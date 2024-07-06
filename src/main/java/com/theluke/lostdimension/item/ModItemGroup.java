package com.theluke.lostdimension.item;

import com.theluke.lostdimension.LostDimension;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
	public static final ItemGroup LOST_GROUP = FabricItemGroupBuilder.build(new Identifier(LostDimension.MOD_ID, "lost_group"), () -> new ItemStack(ModItems.LOST_INGOT));
}