package net.frogipher.petal.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.frogipher.petal.PetalMod;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RED_PANSY = registerBlock("red_pansy",
            new FlowerBlock(StatusEffects.ABSORPTION, 4, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_RED_PANSY = registerBlockWithoutBlockItem("potted_red_pansy",
            new FlowerPotBlock(RED_PANSY, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block LIME_MUM = registerBlock("lime_mum",
            new FlowerBlock(StatusEffects.INSTANT_DAMAGE, 2, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_LIME_MUM = registerBlockWithoutBlockItem("potted_lime_mum",
            new FlowerPotBlock(LIME_MUM, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block MARIGOLD = registerBlock("marigold",
            new FlowerBlock(StatusEffects.LUCK, 4, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_MARIGOLD = registerBlockWithoutBlockItem("potted_marigold",
            new FlowerPotBlock(MARIGOLD, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block MAGENTA_COSMOS = registerBlock("magenta_cosmos",
            new FlowerBlock(StatusEffects.HASTE, 6, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_MAGENTA_COSMOS = registerBlockWithoutBlockItem("potted_magenta_cosmos",
            new FlowerPotBlock(MAGENTA_COSMOS, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block BLUE_HYACINTH = registerBlock("blue_hyacinth",
            new FlowerBlock(StatusEffects.REGENERATION, 4, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_BLUE_HYACINTH = registerBlockWithoutBlockItem("potted_blue_hyacinth",
            new FlowerPotBlock(BLUE_HYACINTH, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block WHITE_WINDFLOWER = registerBlock("white_windflower",
            new FlowerBlock(StatusEffects.GLOWING, 4, FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_WHITE_WINDFLOWER = registerBlockWithoutBlockItem("potted_white_windflower",
            new FlowerPotBlock(WHITE_WINDFLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PetalMod.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(PetalMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PetalMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        PetalMod.LOGGER.info("Registering ModBlocks for " + PetalMod.MOD_ID);
    }

}
