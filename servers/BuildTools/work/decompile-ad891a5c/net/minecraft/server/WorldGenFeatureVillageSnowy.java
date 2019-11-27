package net.minecraft.server;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class WorldGenFeatureVillageSnowy {

    public static void a() {}

    static {
        ImmutableList<DefinedStructureProcessor> immutablelist = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestTag(TagsBlock.DOORS), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.TORCH), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.WALL_TORCH), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.LANTERN), DefinedStructureTestTrue.a, Blocks.AIR.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.SPRUCE_PLANKS, 0.2F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.SPRUCE_SLAB, 0.4F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.STRIPPED_SPRUCE_LOG, 0.05F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.STRIPPED_SPRUCE_WOOD, 0.05F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.GLASS_PANE, 0.5F), DefinedStructureTestTrue.a, Blocks.COBWEB.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlockState((IBlockData) ((IBlockData) Blocks.GLASS_PANE.getBlockData().set(BlockIronBars.NORTH, true)).set(BlockIronBars.SOUTH, true)), DefinedStructureTestTrue.a, (IBlockData) ((IBlockData) Blocks.BROWN_STAINED_GLASS_PANE.getBlockData().set(BlockIronBars.NORTH, true)).set(BlockIronBars.SOUTH, true)), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlockState((IBlockData) ((IBlockData) Blocks.GLASS_PANE.getBlockData().set(BlockIronBars.EAST, true)).set(BlockIronBars.WEST, true)), DefinedStructureTestTrue.a, (IBlockData) ((IBlockData) Blocks.BROWN_STAINED_GLASS_PANE.getBlockData().set(BlockIronBars.EAST, true)).set(BlockIronBars.WEST, true)), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.1F), DefinedStructureTestTrue.a, Blocks.CARROTS.getBlockData()), new DefinedStructureProcessorPredicates[] { new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.8F), DefinedStructureTestTrue.a, Blocks.POTATOES.getBlockData())})));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/town_centers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/town_centers/snowy_meeting_point_1"), 100), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/town_centers/snowy_meeting_point_2"), 50), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/town_centers/snowy_meeting_point_3"), 150), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/town_centers/snowy_meeting_point_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/town_centers/snowy_meeting_point_2"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/town_centers/snowy_meeting_point_3"), 3)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        ImmutableList<DefinedStructureProcessor> immutablelist1 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.GRASS_PATH), new DefinedStructureTestBlock(Blocks.WATER), Blocks.SPRUCE_PLANKS.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.GRASS_PATH, 0.2F), DefinedStructureTestTrue.a, Blocks.GRASS_BLOCK.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.GRASS_BLOCK), new DefinedStructureTestBlock(Blocks.WATER), Blocks.WATER.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestBlock(Blocks.DIRT), new DefinedStructureTestBlock(Blocks.WATER), Blocks.WATER.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/streets"), new MinecraftKey("village/snowy/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/corner_01", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/corner_02", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/corner_03", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/square_01", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/straight_01", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/straight_02", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/straight_03", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/straight_04", immutablelist1), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/straight_06", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/straight_08", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/crossroad_02", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/crossroad_03", immutablelist1), 2), new Pair[] { new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/crossroad_04", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/crossroad_05", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/crossroad_06", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/streets/turn_01", immutablelist1), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/zombie/streets"), new MinecraftKey("village/snowy/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/corner_01", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/corner_02", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/corner_03", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/square_01", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/straight_01", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/straight_02", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/straight_03", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/straight_04", immutablelist1), 7), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/straight_06", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/straight_08", immutablelist1), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/crossroad_02", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/crossroad_03", immutablelist1), 2), new Pair[] { new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/crossroad_04", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/crossroad_05", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/crossroad_06", immutablelist1), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/streets/turn_01", immutablelist1), 3)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        ImmutableList<DefinedStructureProcessor> immutablelist2 = ImmutableList.of(new DefinedStructureProcessorRule(ImmutableList.of(new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.1F), DefinedStructureTestTrue.a, Blocks.CARROTS.getBlockData()), new DefinedStructureProcessorPredicates(new DefinedStructureTestRandomBlock(Blocks.WHEAT, 0.8F), DefinedStructureTestTrue.a, Blocks.POTATOES.getBlockData()))));

        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/houses"), new MinecraftKey("village/snowy/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_small_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_small_house_2"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_small_house_3"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_small_house_4"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_small_house_5"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_small_house_6"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_small_house_7"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_small_house_8"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_medium_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_medium_house_2"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_medium_house_3"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_butchers_shop_1"), 2), new Pair[] { new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_butchers_shop_2"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_tool_smith_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_fletcher_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_shepherds_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_armorer_house_1"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_armorer_house_2"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_fisher_cottage"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_tannery_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_cartographer_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_library_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_masons_house_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_masons_house_2"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_weapon_smith_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_temple_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_farm_1", immutablelist2), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_farm_2", immutablelist2), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_animal_pen_1"), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_animal_pen_2"), 2), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 6)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/zombie/houses"), new MinecraftKey("village/snowy/terminators"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_small_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_small_house_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_small_house_3", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_small_house_4", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_small_house_5", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_small_house_6", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_small_house_7", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_small_house_8", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_medium_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_medium_house_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/houses/snowy_medium_house_3", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_butchers_shop_1", immutablelist), 2), new Pair[] { new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_butchers_shop_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_tool_smith_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_fletcher_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_shepherds_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_armorer_house_1", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_armorer_house_2", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_fisher_cottage", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_tannery_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_cartographer_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_library_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_masons_house_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_masons_house_2", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_weapon_smith_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_temple_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_farm_1", immutablelist), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_farm_2", immutablelist), 3), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_animal_pen_1", immutablelist), 2), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/houses/snowy_animal_pen_2", immutablelist), 2), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 6)}), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/terminators"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_01", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_02", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_03", immutablelist1), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/plains/terminators/terminator_04", immutablelist1), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.TERRAIN_MATCHING));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/trees"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SPRUCE_TREE, WorldGenFeatureConfiguration.e)), 1)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/decor"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/snowy_lamp_post_01"), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/snowy_lamp_post_02"), 4), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/snowy_lamp_post_03"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SPRUCE_TREE, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SNOW_PILE, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.ICE_PILE, WorldGenFeatureConfiguration.e)), 1), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 9)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/zombie/decor"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/snowy_lamp_post_01", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/snowy_lamp_post_02", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/snowy_lamp_post_03", immutablelist), 1), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SPRUCE_TREE, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.SNOW_PILE, WorldGenFeatureConfiguration.e)), 4), new Pair(new WorldGenFeatureDefinedStructurePoolFeature(new WorldGenFeatureConfigured<>(WorldGenerator.ICE_PILE, WorldGenFeatureConfiguration.e)), 4), Pair.of(WorldGenFeatureDefinedStructurePoolEmpty.a, 7)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/villagers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/villagers/nitwit"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/villagers/baby"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
        WorldGenFeatureDefinedStructureJigsawPlacement.a.a(new WorldGenFeatureDefinedStructurePoolTemplate(new MinecraftKey("village/snowy/zombie/villagers"), new MinecraftKey("empty"), ImmutableList.of(new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/villagers/nitwit"), 1), new Pair(new WorldGenFeatureDefinedStructurePoolSingle("village/snowy/zombie/villagers/unemployed"), 10)), WorldGenFeatureDefinedStructurePoolTemplate.Matching.RIGID));
    }
}
