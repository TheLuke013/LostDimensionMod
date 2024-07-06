package com.theluke.lostdimension.item;

import com.theluke.lostdimension.LostDimension;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	public static final Item LOST_INGOT = registerItem("lost_ingot",
	new Item(new FabricItemSettings().group(ModItemGroup.LOST_GROUP)));
	
	public static final Item LOST_SWORD = registerItem("lost_sword",
	new SwordItem(ModToolMaterial.LOST, 5, 3f, new FabricItemSettings().group(ModItemGroup.LOST_GROUP)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(LostDimension.MOD_ID, name), item);
	}

	public static void registerModItems() {
        LostDimension.LOGGER.debug("Registrando itens do mod " + LostDimension.MOD_ID);
	}
}
