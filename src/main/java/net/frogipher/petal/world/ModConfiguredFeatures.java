package net.frogipher.petal.world;

import net.frogipher.petal.PetalMod;
import net.frogipher.petal.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_PANSY_KEY = registerKey("red_pansy");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_MUM_KEY = registerKey("lime_mum");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARIGOLD_KEY = registerKey("marigold");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAGENTA_COSMOS_KEY = registerKey("magenta_cosmos");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_HYACINTH_KEY = registerKey("blue_hyacinth");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_WINDFLOWER_KEY = registerKey("white_windflower");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context){

        register(context, RED_PANSY_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.RED_PANSY)))));
        register(context, LIME_MUM_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.LIME_MUM)))));
        register(context, MARIGOLD_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MARIGOLD)))));
        register(context, MAGENTA_COSMOS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.MAGENTA_COSMOS)))));
        register(context, BLUE_HYACINTH_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BLUE_HYACINTH)))));
        register(context, WHITE_WINDFLOWER_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.WHITE_WINDFLOWER)))));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(PetalMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
