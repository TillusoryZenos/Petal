package net.frogipher.petal;

import net.fabricmc.api.ModInitializer;

import net.frogipher.petal.block.ModBlocks;
import net.frogipher.petal.item.ModItemGroup;
import net.frogipher.petal.item.ModItems;
import net.frogipher.petal.util.ModRegistries;
import net.frogipher.petal.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PetalMod implements ModInitializer {
	public static final String MOD_ID = "petal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		ModWorldGeneration.generateModWorldGeneration();

	}
}