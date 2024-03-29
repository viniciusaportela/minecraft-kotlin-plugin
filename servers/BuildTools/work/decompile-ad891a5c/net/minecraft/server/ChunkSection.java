package net.minecraft.server;

import javax.annotation.Nullable;

public class ChunkSection {

    public static final DataPalette<IBlockData> GLOBAL_PALETTE = new DataPaletteGlobal<>(Block.REGISTRY_ID, Blocks.AIR.getBlockData());
    private final int yPos;
    private short nonEmptyBlockCount;
    private short tickingBlockCount;
    private short e;
    private final DataPaletteBlock<IBlockData> blockIds;

    public ChunkSection(int i) {
        this(i, (short) 0, (short) 0, (short) 0);
    }

    public ChunkSection(int i, short short0, short short1, short short2) {
        this.yPos = i;
        this.nonEmptyBlockCount = short0;
        this.tickingBlockCount = short1;
        this.e = short2;
        this.blockIds = new DataPaletteBlock<>(ChunkSection.GLOBAL_PALETTE, Block.REGISTRY_ID, GameProfileSerializer::d, GameProfileSerializer::a, Blocks.AIR.getBlockData());
    }

    public IBlockData getType(int i, int j, int k) {
        return (IBlockData) this.blockIds.a(i, j, k);
    }

    public Fluid b(int i, int j, int k) {
        return ((IBlockData) this.blockIds.a(i, j, k)).p();
    }

    public void a() {
        this.blockIds.a();
    }

    public void b() {
        this.blockIds.b();
    }

    public IBlockData setType(int i, int j, int k, IBlockData iblockdata) {
        return this.setType(i, j, k, iblockdata, true);
    }

    public IBlockData setType(int i, int j, int k, IBlockData iblockdata, boolean flag) {
        IBlockData iblockdata1;

        if (flag) {
            iblockdata1 = (IBlockData) this.blockIds.setBlock(i, j, k, iblockdata);
        } else {
            iblockdata1 = (IBlockData) this.blockIds.b(i, j, k, iblockdata);
        }

        Fluid fluid = iblockdata1.p();
        Fluid fluid1 = iblockdata.p();

        if (!iblockdata1.isAir()) {
            --this.nonEmptyBlockCount;
            if (iblockdata1.q()) {
                --this.tickingBlockCount;
            }
        }

        if (!fluid.isEmpty()) {
            --this.e;
        }

        if (!iblockdata.isAir()) {
            ++this.nonEmptyBlockCount;
            if (iblockdata.q()) {
                ++this.tickingBlockCount;
            }
        }

        if (!fluid1.isEmpty()) {
            ++this.e;
        }

        return iblockdata1;
    }

    public boolean c() {
        return this.nonEmptyBlockCount == 0;
    }

    public static boolean a(@Nullable ChunkSection chunksection) {
        return chunksection == Chunk.a || chunksection.c();
    }

    public boolean d() {
        return this.shouldTick() || this.f();
    }

    public boolean shouldTick() {
        return this.tickingBlockCount > 0;
    }

    public boolean f() {
        return this.e > 0;
    }

    public int getYPosition() {
        return this.yPos;
    }

    public void recalcBlockCounts() {
        this.nonEmptyBlockCount = 0;
        this.tickingBlockCount = 0;
        this.e = 0;

        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    IBlockData iblockdata = this.getType(i, j, k);
                    Fluid fluid = this.b(i, j, k);

                    if (!iblockdata.isAir()) {
                        ++this.nonEmptyBlockCount;
                        if (iblockdata.q()) {
                            ++this.tickingBlockCount;
                        }
                    }

                    if (!fluid.isEmpty()) {
                        ++this.nonEmptyBlockCount;
                        if (fluid.g()) {
                            ++this.e;
                        }
                    }
                }
            }
        }

    }

    public DataPaletteBlock<IBlockData> getBlocks() {
        return this.blockIds;
    }

    public void b(PacketDataSerializer packetdataserializer) {
        packetdataserializer.writeShort(this.nonEmptyBlockCount);
        this.blockIds.b(packetdataserializer);
    }

    public int j() {
        return 2 + this.blockIds.c();
    }

    public boolean a(IBlockData iblockdata) {
        return this.blockIds.a((Object) iblockdata);
    }
}
