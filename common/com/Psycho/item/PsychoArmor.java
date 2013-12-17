package com.Psycho.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.Psycho.info.PsychoInfo;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PsychoArmor extends ItemArmor {

	private final EnumArmorMaterial material;
	private String texture;
	
	public PsychoArmor(int id, EnumArmorMaterial mat, int renderer, int slot, String type) 
	{
		super(id, mat, renderer, slot);
		this.material = mat;
		this.setArmorType(type.toLowerCase(), slot);
	}
	
	public PsychoArmor(int id, EnumArmorMaterial mat, int renderer, int slot, String type, CreativeTabs tab) 
	{
		super(id, mat, renderer, slot);
		this.material = mat;
		this.setArmorType(type.toLowerCase(), slot);
		this.setCreativeTab(tab);
	}
	
	public void setArmorType(String type, int slotNumber)
    {
    	switch(slotNumber)
    	{
    		case 0:
    		{ this.texture = PsychoInfo.ID + ":textures/armor/" + type +"_1.png"; }
    		break;
    		case 1:
    		{ this.texture= PsychoInfo.ID + ":textures/armor/" + type +"_1.png"; }
    		break;
    		case 2:
    		{ this.texture = PsychoInfo.ID + ":textures/armor/" + type +"_2.png"; }
    		break;
    		case 3:
    		{ this.texture = PsychoInfo.ID + ":textures/armor/" + type +"_1.png"; }
    		break;
    	}
    }
	
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    { return this.texture; }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(
			PsychoInfo.getResource(this.getUnlocalizedName())
		); 
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return this.material.getArmorCraftingMaterial() == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}
