package net.minecraft.server;

import java.util.Collection;
import java.util.Iterator;

public class EntityCreeper extends EntityMonster {

    private static final DataWatcherObject<Integer> b = DataWatcher.a(EntityCreeper.class, DataWatcherRegistry.b);
    private static final DataWatcherObject<Boolean> POWERED = DataWatcher.a(EntityCreeper.class, DataWatcherRegistry.i);
    private static final DataWatcherObject<Boolean> d = DataWatcher.a(EntityCreeper.class, DataWatcherRegistry.i);
    private int bz;
    private int fuseTicks;
    public int maxFuseTicks = 30;
    public int explosionRadius = 3;
    private int bD;

    public EntityCreeper(EntityTypes<? extends EntityCreeper> entitytypes, World world) {
        super(entitytypes, world);
    }

    @Override
    protected void initPathfinder() {
        this.goalSelector.a(1, new PathfinderGoalFloat(this));
        this.goalSelector.a(2, new PathfinderGoalSwell(this));
        this.goalSelector.a(3, new PathfinderGoalAvoidTarget<>(this, EntityOcelot.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.a(3, new PathfinderGoalAvoidTarget<>(this, EntityCat.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.a(4, new PathfinderGoalMeleeAttack(this, 1.0D, false));
        this.goalSelector.a(5, new PathfinderGoalRandomStrollLand(this, 0.8D));
        this.goalSelector.a(6, new PathfinderGoalLookAtPlayer(this, EntityHuman.class, 8.0F));
        this.goalSelector.a(6, new PathfinderGoalRandomLookaround(this));
        this.targetSelector.a(1, new PathfinderGoalNearestAttackableTarget<>(this, EntityHuman.class, true));
        this.targetSelector.a(2, new PathfinderGoalHurtByTarget(this, new Class[0]));
    }

    @Override
    protected void initAttributes() {
        super.initAttributes();
        this.getAttributeInstance(GenericAttributes.MOVEMENT_SPEED).setValue(0.25D);
    }

    @Override
    public int bu() {
        return this.getGoalTarget() == null ? 3 : 3 + (int) (this.getHealth() - 1.0F);
    }

    @Override
    public void b(float f, float f1) {
        super.b(f, f1);
        this.fuseTicks = (int) ((float) this.fuseTicks + f * 1.5F);
        if (this.fuseTicks > this.maxFuseTicks - 5) {
            this.fuseTicks = this.maxFuseTicks - 5;
        }

    }

    @Override
    protected void initDatawatcher() {
        super.initDatawatcher();
        this.datawatcher.register(EntityCreeper.b, -1);
        this.datawatcher.register(EntityCreeper.POWERED, false);
        this.datawatcher.register(EntityCreeper.d, false);
    }

    @Override
    public void b(NBTTagCompound nbttagcompound) {
        super.b(nbttagcompound);
        if ((Boolean) this.datawatcher.get(EntityCreeper.POWERED)) {
            nbttagcompound.setBoolean("powered", true);
        }

        nbttagcompound.setShort("Fuse", (short) this.maxFuseTicks);
        nbttagcompound.setByte("ExplosionRadius", (byte) this.explosionRadius);
        nbttagcompound.setBoolean("ignited", this.isIgnited());
    }

    @Override
    public void a(NBTTagCompound nbttagcompound) {
        super.a(nbttagcompound);
        this.datawatcher.set(EntityCreeper.POWERED, nbttagcompound.getBoolean("powered"));
        if (nbttagcompound.hasKeyOfType("Fuse", 99)) {
            this.maxFuseTicks = nbttagcompound.getShort("Fuse");
        }

        if (nbttagcompound.hasKeyOfType("ExplosionRadius", 99)) {
            this.explosionRadius = nbttagcompound.getByte("ExplosionRadius");
        }

        if (nbttagcompound.getBoolean("ignited")) {
            this.dY();
        }

    }

    @Override
    public void tick() {
        if (this.isAlive()) {
            this.bz = this.fuseTicks;
            if (this.isIgnited()) {
                this.a(1);
            }

            int i = this.dW();

            if (i > 0 && this.fuseTicks == 0) {
                this.a(SoundEffects.ENTITY_CREEPER_PRIMED, 1.0F, 0.5F);
            }

            this.fuseTicks += i;
            if (this.fuseTicks < 0) {
                this.fuseTicks = 0;
            }

            if (this.fuseTicks >= this.maxFuseTicks) {
                this.fuseTicks = this.maxFuseTicks;
                this.eb();
            }
        }

        super.tick();
    }

    @Override
    protected SoundEffect getSoundHurt(DamageSource damagesource) {
        return SoundEffects.ENTITY_CREEPER_HURT;
    }

    @Override
    protected SoundEffect getSoundDeath() {
        return SoundEffects.ENTITY_CREEPER_DEATH;
    }

    @Override
    protected void dropDeathLoot(DamageSource damagesource, int i, boolean flag) {
        super.dropDeathLoot(damagesource, i, flag);
        Entity entity = damagesource.getEntity();

        if (entity != this && entity instanceof EntityCreeper) {
            EntityCreeper entitycreeper = (EntityCreeper) entity;

            if (entitycreeper.canCauseHeadDrop()) {
                entitycreeper.setCausedHeadDrop();
                this.a((IMaterial) Items.CREEPER_HEAD);
            }
        }

    }

    @Override
    public boolean C(Entity entity) {
        return true;
    }

    public boolean isPowered() {
        return (Boolean) this.datawatcher.get(EntityCreeper.POWERED);
    }

    public int dW() {
        return (Integer) this.datawatcher.get(EntityCreeper.b);
    }

    public void a(int i) {
        this.datawatcher.set(EntityCreeper.b, i);
    }

    @Override
    public void onLightningStrike(EntityLightning entitylightning) {
        super.onLightningStrike(entitylightning);
        this.datawatcher.set(EntityCreeper.POWERED, true);
    }

    @Override
    protected boolean a(EntityHuman entityhuman, EnumHand enumhand) {
        ItemStack itemstack = entityhuman.b(enumhand);

        if (itemstack.getItem() == Items.FLINT_AND_STEEL) {
            this.world.a(entityhuman, this.locX, this.locY, this.locZ, SoundEffects.ITEM_FLINTANDSTEEL_USE, this.getSoundCategory(), 1.0F, this.random.nextFloat() * 0.4F + 0.8F);
            entityhuman.a(enumhand);
            if (!this.world.isClientSide) {
                this.dY();
                itemstack.damage(1, entityhuman, (entityhuman1) -> {
                    entityhuman1.d(enumhand);
                });
                return true;
            }
        }

        return super.a(entityhuman, enumhand);
    }

    private void eb() {
        if (!this.world.isClientSide) {
            Explosion.Effect explosion_effect = this.world.getGameRules().getBoolean("mobGriefing") ? Explosion.Effect.DESTROY : Explosion.Effect.NONE;
            float f = this.isPowered() ? 2.0F : 1.0F;

            this.killed = true;
            this.world.explode(this, this.locX, this.locY, this.locZ, (float) this.explosionRadius * f, explosion_effect);
            this.die();
            this.createEffectCloud();
        }

    }

    private void createEffectCloud() {
        Collection<MobEffect> collection = this.getEffects();

        if (!collection.isEmpty()) {
            EntityAreaEffectCloud entityareaeffectcloud = new EntityAreaEffectCloud(this.world, this.locX, this.locY, this.locZ);

            entityareaeffectcloud.setRadius(2.5F);
            entityareaeffectcloud.setRadiusOnUse(-0.5F);
            entityareaeffectcloud.setWaitTime(10);
            entityareaeffectcloud.setDuration(entityareaeffectcloud.getDuration() / 2);
            entityareaeffectcloud.setRadiusPerTick(-entityareaeffectcloud.getRadius() / (float) entityareaeffectcloud.getDuration());
            Iterator iterator = collection.iterator();

            while (iterator.hasNext()) {
                MobEffect mobeffect = (MobEffect) iterator.next();

                entityareaeffectcloud.a(new MobEffect(mobeffect));
            }

            this.world.addEntity(entityareaeffectcloud);
        }

    }

    public boolean isIgnited() {
        return (Boolean) this.datawatcher.get(EntityCreeper.d);
    }

    public void dY() {
        this.datawatcher.set(EntityCreeper.d, true);
    }

    public boolean canCauseHeadDrop() {
        return this.isPowered() && this.bD < 1;
    }

    public void setCausedHeadDrop() {
        ++this.bD;
    }
}
