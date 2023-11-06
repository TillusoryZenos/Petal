package net.frogipher.petal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.frogipher.petal.PetalMod;
import net.frogipher.petal.item.ModItems;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementDisplay;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.item.ItemStack;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementsProvider extends FabricAdvancementProvider {
    public ModAdvancementsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        Advancement rootAdvancement = Advancement.Builder.create()
                .display(new AdvancementDisplay(new ItemStack(ModItems.FLOWER_CROWN),
                        Text.literal("Flower Power!"), Text.literal("Obtain a flower crown!"),
                        new Identifier(PetalMod.MOD_ID, "textures/item/flower_crown.png"), AdvancementFrame.TASK,
                        true, true,false))
                .criterion("has_flower_crown", InventoryChangedCriterion.Conditions.items(ModItems.FLOWER_CROWN))
                .build(consumer, PetalMod.MOD_ID + ":petal");
    }
}
