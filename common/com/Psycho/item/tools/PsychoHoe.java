package com.Psycho.item.tools;

import com.Psycho.info.PsychoInfo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class PsychoHoe extends ItemHoe {

	public PsychoHoe(int par1, EnumToolMaterial par2EnumToolMaterial, CreativeTabs tab) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(tab);
	}
	@Override
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(PsychoInfo.getResource(this.getUnlocalizedName()));
	}
}
