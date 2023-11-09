package net.frogipher.petal.util;

import net.frogipher.petal.PetalMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS =
                createTag("metal_detector_detectable_blocks");

        public class ModBlockTags {
            public static final TagKey<Block> SMALL_FLOWERS = TagKey.of(RegistryKeys.BLOCK, new Identifier("petal", "small_flowers"));
            public static final TagKey<Block> FLOWER_POTS = TagKey.of(RegistryKeys.BLOCK, new Identifier("petal", "flower_pots"));
        }

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(PetalMod.MOD_ID, name));
        }
    }

}
