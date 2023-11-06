package net.frogipher.petal.item;

import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frogipher.petal.PetalMod;
import net.frogipher.petal.block.ModBlocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item FLOWER_CROWN = registerItem("flower_crown", new ArmorItem(ModArmorMaterials.FLOWER_CROWN, ArmorItem.Type.HELMET, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PetalMod.MOD_ID, name), item);
    }

    private static void itemGroupNatural(FabricItemGroupEntries entries){
    }

    public static void registerModItems(){
        PetalMod.LOGGER.info("Registering ModItems for " + PetalMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::itemGroupNatural);
    }
}
