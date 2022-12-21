package com.entrate.cheesemod.item;

import com.entrate.cheesemod.CheeseMod;
import com.entrate.cheesemod.item.custom.CheeseItem;
import com.entrate.cheesemod.item.custom.CheeseSwordItem;
import com.entrate.cheesemod.item.custom.ModArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CheeseMod.MOD_ID);

    public static final RegistryObject<Item> OLDCHEESE = ITEMS.register("oldcheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CHEESE)));

    public static final RegistryObject<Item> TDCHEESE = ITEMS.register("tdcheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFoods.CHEESE)));


    public static final RegistryObject<Item> MYSTICAL_CHEESE = ITEMS.register("mystical_cheese",
            () -> new CheeseItem(new Item.Properties().tab(ModCreativeModeTab.CHEESE_TAB).stacksTo(1)));

    public static final RegistryObject<Item> LEGENDARY_CHEESE = ITEMS.register("legendary_cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> LEGENDARY_MILK_BUCKET = ITEMS.register("legendary_milk_bucket",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(1)));

    public static final RegistryObject<Item> GODLY_CHEESE = ITEMS.register("godly_cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> NETHERITE_LEGENDARY_CHEESE = ITEMS.register("netherite_legendary_cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<Item> LEGENDARY_CHEESE_SWORD_BROKEN = ITEMS.register("legendary_cheese_sword_broken",
            () -> new SwordItem(ModTiers.LEGENDARY_CHEESE_BROKEN, 2, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEGENDARY_CHEESE_SWORD = ITEMS.register("legendary_cheese_sword",
            () -> new CheeseSwordItem(ModTiers.LEGENDARY_CHEESE, 1, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> LEGENDARY_CHEESE_SWORD_BURNING = ITEMS.register("legendary_cheese_sword_burning",
            () -> new CheeseSwordItem(ModTiers.LEGENDARY_CHEESE, 1, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> NETHERITE_LEGENDARY_CHEESE_HELMET = ITEMS.register("netherite_legendary_cheese_helmet",
            () -> new ModArmorItem(ModArmourMaterials.NETHERITE_LEGENDARY_CHEESE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGENDARY_CHEESE_CHESTPLATE = ITEMS.register("netherite_legendary_cheese_helmet_chestplate",
            () -> new ArmorItem(ModArmourMaterials.NETHERITE_LEGENDARY_CHEESE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGENDARY_CHEESE_LEGGINGS = ITEMS.register("netherite_legendary_cheese_leggings",
            () -> new ArmorItem(ModArmourMaterials.NETHERITE_LEGENDARY_CHEESE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> NETHERITE_LEGENDARY_CHEESE_BOOTS = ITEMS.register("netherite_legendary_cheese_boots",
            () -> new ArmorItem(ModArmourMaterials.NETHERITE_LEGENDARY_CHEESE, EquipmentSlot.FEET,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));




    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
