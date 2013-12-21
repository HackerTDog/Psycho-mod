package com.Psycho.manager;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;

import com.Psycho.block.PsychoBlock;
import com.Psycho.item.PsychoArmor;
import com.Psycho.item.PsychoItem;
import com.Psycho.item.tools.PsychoAxe;
import com.Psycho.item.tools.PsychoHoe;
import com.Psycho.item.tools.PsychoPick;
import com.Psycho.item.tools.PsychoShovel;
import com.Psycho.item.tools.PsychoSword;

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
	public static Block blockPsycho;
	public static Block orePsycho;
	
	//Items
	public static Item gemPsycho;
	
	//Tools
	public static Item pickPsycho;
	public static Item axePsycho;
	public static Item shovelPsycho;
	public static Item swordPsycho;	
	public static Item hoePsycho;

	//Armor
	public static Item helmPsycho;
	public static Item chestPsycho;
	public static Item legsPsycho;
	public static Item bootsPsycho;
	
	// Start from 700
	public static void addBlocks(CreativeTabs tab) {
		float Res = 8F;
		blockPsycho = new PsychoBlock(700, Material.rock, tab).setResistance(Res).setHardness(3.0F).setUnlocalizedName("blockPsycho");
		orePsycho = new PsychoBlock(701, Material.rock, tab).setResistance(Res).setHardness(3.5F).setUnlocalizedName("orePsycho");
		//Register Here
		GameRegistry.registerBlock(blockPsycho, blockPsycho.getUnlocalizedName());
		GameRegistry.registerBlock(orePsycho, orePsycho.getUnlocalizedName());
	}
	
	//Start from 2500
	public static void addItems(CreativeTabs tab) {
		gemPsycho = new PsychoItem(2200, tab).setUnlocalizedName("gemPsycho");
	}
	
	//Start from 1800
	public static void addTools(CreativeTabs tab) {
		pickPsycho = new PsychoPick(1800, materialPsycho, tab).setUnlocalizedName("pickPsycho");
		axePsycho = new PsychoAxe(1801, materialPsycho, tab).setUnlocalizedName("axePsycho");
		shovelPsycho = new PsychoShovel(1802, materialPsycho, tab).setUnlocalizedName("shovelPsycho");
		swordPsycho = new PsychoSword(1803, materialPsycho, tab).setUnlocalizedName("swordPsycho");
		hoePsycho = new PsychoHoe(1804, materialPsycho, tab).setUnlocalizedName("hoePsycho");
	}
	
	//Start from 1500
	public static void addArmor(CreativeTabs tab) {
		helmPsycho = new PsychoArmor(1500, armorPsycho, armorPsychoRenderer, 0, "psycho", tab).setUnlocalizedName("helmPsycho");
		chestPsycho = new PsychoArmor(1501, armorPsycho, armorPsychoRenderer, 1, "psycho", tab).setUnlocalizedName("chestPsycho");
		legsPsycho = new PsychoArmor(1502, armorPsycho, armorPsychoRenderer, 2, "psycho", tab).setUnlocalizedName("legsPsycho");
		bootsPsycho = new PsychoArmor(1503, armorPsycho, armorPsychoRenderer, 3, "psycho", tab).setUnlocalizedName("bootsPsycho");
	}
	
	//Add Recipes Here
	public static void addRecipes() {
		GameRegistry.addRecipe(new ItemStack(helmPsycho), new Object[]{"XXX", "X X", 'X', gemPsycho});
		GameRegistry.addRecipe(new ItemStack(chestPsycho), new Object[]{"X X", "XXX", "XXX", 'X', gemPsycho});
		GameRegistry.addRecipe(new ItemStack(legsPsycho), new Object[]{"XXX", "X X", "X X", 'X', gemPsycho});
		GameRegistry.addRecipe(new ItemStack(bootsPsycho), new Object[]{"X X", "X X", 'X', gemPsycho});
		GameRegistry.addRecipe(new ItemStack(pickPsycho), new Object[]{"XXX", " S ", " S ", 'X', gemPsycho, 'S', Item.stick});	
		GameRegistry.addRecipe(new ItemStack(axePsycho), new Object[]{"XX", "XS ", " S ", 'X', gemPsycho, 'S', Item.stick});	
		GameRegistry.addRecipe(new ItemStack(shovelPsycho), new Object[]{"X", "S", "S", 'X', gemPsycho, 'S', Item.stick});	
		GameRegistry.addRecipe(new ItemStack(swordPsycho), new Object[]{"X", "X", "S", 'X', gemPsycho, 'S', Item.stick});	
		GameRegistry.addRecipe(new ItemStack(hoePsycho), new Object[]{"XX", " S ", " S ", 'X', gemPsycho, 'S', Item.stick});	
		GameRegistry.addSmelting(orePsycho.blockID, new ItemStack(gemPsycho), 1.5F);
	}
}
