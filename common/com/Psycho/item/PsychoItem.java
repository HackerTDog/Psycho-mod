package com.Psycho.item;

import com.Psycho.info.PsychoInfo;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PsychoItem extends Item {

	public PsychoItem(int par1, CreativeTabs tab) {
		super(par1);
		this.setCreativeTab(tab);
	}
	public void registerIcons(IconRegister registerIcon) {
		this.itemIcon = registerIcon.registerIcon(PsychoInfo.getResource(this.getUnlocalizedName()));
	}
}
