package com.theluke.lostdimension.item;

import com.theluke.lostdimension.LostDimension;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item LOST_INGOT = registerItem("lost_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.LOST_GROUP)));

    public static final Item LOST_SWORD = registerItem("lost_sword",
            new SwordItem(ModToolMaterial.LOST, 10, 3f, new FabricItemSettings().group(ModItemGroup.LOST_GROUP)));

    public static final Item LOST_HELMET = registerItem("lost_helmet",
            new ArmorItem(ModArmorMaterials.LOST, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.LOST_GROUP)));
    public static final Item LOST_CHESTPLATE = registerItem("lost_chestplate",
            new ArmorItem(ModArmorMaterials.LOST, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.LOST_GROUP)));
    public static final Item LOST_LEGGINGS = registerItem("lost_leggings",
            new ArmorItem(ModArmorMaterials.LOST, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.LOST_GROUP)));
    public static final Item LOST_BOOTS = registerItem("lost_boots",
            new ArmorItem(ModArmorMaterials.LOST, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.LOST_GROUP)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(LostDimension.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LostDimension.LOGGER.debug("Registrando itens do mod " + LostDimension.MOD_ID);
    }
}
