package com.Psycho.item.tools;

import com.Psycho.info.PsychoInfo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class PsychoPick extends ItemPickaxe{

	public PsychoPick(int par1, EnumToolMaterial par2EnumToolMaterial, CreativeTabs tab) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(tab);
	}

	public void registerIcons(IconRegister registerIcon) {
		this.itemIcon = registerIcon.registerIcon(PsychoInfo.getResource(this.getUnlocalizedName()));
	}
}
