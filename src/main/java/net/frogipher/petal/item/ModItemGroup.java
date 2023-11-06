package net.frogipher.petal.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frogipher.petal.PetalMod;
import net.frogipher.petal.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup PETAL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PetalMod.MOD_ID, "petal"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.petal"))
                    .icon(() -> new ItemStack(ModItems.FLOWER_CROWN)).entries((displayContext, entries) -> {

                        entries.add(ModItems.FLOWER_CROWN);

                        entries.add(ModBlocks.RED_PANSY);
                        entries.add(ModBlocks.LIME_MUM);
                        entries.add(ModBlocks.MARIGOLD);
                        entries.add(ModBlocks.MAGENTA_COSMOS);
                        entries.add(ModBlocks.BLUE_HYACINTH);
                        entries.add(ModBlocks.WHITE_WINDFLOWER);

                    }).build());

    public static void registerItemGroups(){

    }

}
