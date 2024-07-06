package com.theluke.lostdimension.block;

import com.theluke.lostdimension.LostDimension;
import com.theluke.lostdimension.item.ModItemGroup;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	public static final Block LOST_BLOCK = registerBlock("lost_block",
	new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.LOST_GROUP);
	
	public static final Block LOST_ORE_BLOCK = registerBlock("lost_ore_block",
	new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.LOST_GROUP);
	
	private static Block registerBlock(String name, Block block, ItemGroup tab) {
		registerBlockItem(name, block, tab);
		return Registry.register(Registry.BLOCK, new Identifier(LostDimension.MOD_ID, name), block);
	}
	
	private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
		return Registry.register(Registry.ITEM, new Identifier(LostDimension.MOD_ID, name),
		new BlockItem(block, new FabricItemSettings().group(tab)));
	}
	
	public static void registerModBlocks() {
		LostDimension.LOGGER.debug("Registrando blocos do mod " + LostDimension.MOD_ID);
	}
}