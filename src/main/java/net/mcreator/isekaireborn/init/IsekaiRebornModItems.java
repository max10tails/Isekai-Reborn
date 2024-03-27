
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.isekaireborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.isekaireborn.IsekaiRebornMod;

public class IsekaiRebornModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IsekaiRebornMod.MODID);
	public static final RegistryObject<Item> RYUKA_SPAWN_EGG = REGISTRY.register("ryuka_spawn_egg", () -> new ForgeSpawnEggItem(IsekaiRebornModEntities.RYUKA, -16776961, -6750055, new Item.Properties()));
}
