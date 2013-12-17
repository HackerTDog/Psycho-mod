package com.Psycho;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;

import com.Psycho.localization.localizationHandler;
import com.Psycho.manager.IBAManager;
import com.Psycho.proxy.commonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = "psycho", name = "Psycho Imagination", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Psycho {

@SidedProxy(clientSide = "com.Psycho.proxy.clientProxy", serverSide ="com.Psycho.proxy.commonProxy")
public static commonProxy proxy;

@Instance("psycho")
public Psycho instance;

//CreativeTabs
public static CreativeTabs PsychoBlocks;
public static CreativeTabs PsychoItems;
public static CreativeTabs PsychoTools;
public static CreativeTabs PsychoArmor;

@EventHandler
public void preInit(FMLPreInitializationEvent event) {
	localizationHandler.loadLanguages();
}
@EventHandler
public void load(FMLInitializationEvent event) {
	proxy.registerRenderers();

	PsychoBlocks = new CreativeTabs("tabPsychoBlocks") {
		public ItemStack getIconItemStack() {
			return new ItemStack(IBAManager.PsychoBlock, 1, 0);
		}
	};
	PsychoItems = new CreativeTabs("tabPsychoItems") {
		public ItemStack getIconItemStack() {
			return new ItemStack(IBAManager.PsychoItem, 1, 0);
		}
	};
	PsychoTools = new CreativeTabs("tabPsychoTools") {
		public ItemStack getIconItemStack() {
			return new ItemStack(IBAManager.PsychoPick, 1, 0);
		}
	};
	PsychoArmor = new CreativeTabs("tabPsychoArmor") {
		public ItemStack getIconItemStack() {
			return new ItemStack(IBAManager.PsychoHelm, 1, 0);
		}
	};
	
	//Adding tabs to things
	IBAManager.addBlocks(PsychoBlocks);
	IBAManager.addItems(PsychoItems);
	IBAManager.addTools(PsychoTools);
	IBAManager.addArmor(PsychoArmor);
	
}
@EventHandler
public void postInit(FMLPostInitializationEvent event) {
	
}
//For Mobs
public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColour, int fgEggColour) {
	int id = EntityRegistry.findGlobalUniqueEntityId();
	
	EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
	EntityList.entityEggs.put(Integer.valueOf(id), new EntityEggInfo(id, bkEggColour, fgEggColour));
}
public void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
	if (spawnProb > 0) {
		EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
	}
}
}
