package com.Psycho.block;

import java.util.Random;

import com.Psycho.info.PsychoInfo;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class PsychoBlock extends Block {

	public PsychoBlock(int par1, Material par2Material, CreativeTabs tab) {
		super(par1, par2Material);
		this.setCreativeTab(tab);
	}
	@Override
	public void registerIcons(IconRegister registerIcon) {
		this.blockIcon = registerIcon.registerIcon(PsychoInfo.getResource(this.getUnlocalizedName()));
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return this.blockID;
	}
}
