package com.theluke.lostdimension;

import com.theluke.lostdimension.item.ModItems;
import com.theluke.lostdimension.block.ModBlocks;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.Identifier;
import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;

public class LostDimension implements ModInitializer {
	public static final String MOD_ID = "lostdimension";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		
		CustomPortalApiRegistry.addPortal(ModBlocks.LOST_BLOCK, new Identifier(LostDimension.MOD_ID + ":lostdimension"), 131, 66, 184);
	}
}