package com.Psycho.manager;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

import com.Psycho.block.PsychoBlock;
import com.Psycho.item.PsychoArmor;
import com.Psycho.item.PsychoItem;
import com.Psycho.item.tools.PsychoPick;

import cpw.mods.fml.common.registry.GameRegistry;

public class IBAManager {

	//Armor Materials
	
	public static EnumArmorMaterial armorPsycho = EnumHelper.addArmorMaterial("PSYCHO", 2000, new int[]{2, 7, 5, 2}, 20);
	
	//Armor Renders
	
	public static int armorPsychoRenderer;
	
	//Tool Materials
	
	public static EnumToolMaterial materialPsycho = EnumHelper.addToolMaterial("PSYCHO", 6, 2000, 5.0F, 4F, 20);
	
	//I Am Making A Test for all things as a template e.g. PsychoBlock, PsychoPick, PsychoHelm etc. 	
	
	//Blocks
	public static Block PsychoBlock;
	
	//Items
	public static Item PsychoItem;
	
	//Tools
	public static Item PsychoPick;
	
	//Armor
	public static Item PsychoHelm;
	
	// Start from 700
	public static void addBlocks(CreativeTabs tab) {
		float Res = 12F;
		PsychoBlock = new PsychoBlock(700, Material.rock, tab).setResistance(Res).setHardness(3.0F).setUnlocalizedName("PsychoBlock");
		//Register Here
		GameRegistry.registerBlock(PsychoBlock, PsychoBlock.getUnlocalizedName());
	}
	
	//Start from 2500
	public static void addItems(CreativeTabs tab) {
		PsychoItem = new PsychoItem(2200, tab).setUnlocalizedName("PsychoItem");
	}
	
	//Start from 1800
	public static void addTools(CreativeTabs tab) {
		PsychoPick = new PsychoPick(1800, materialPsycho, tab).setUnlocalizedName("pickPsycho");
	}
	
	//Start from 1500
	public static void addArmor(CreativeTabs tab) {
		PsychoHelm = new PsychoArmor(1500, armorPsycho, armorPsychoRenderer, 0, "psycho", tab).setUnlocalizedName("helmPsycho");
	}
}
