package com.Psycho.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

import com.Psycho.manager.IBAManager;

public class biomePsycho extends BiomeGenBase {

	public biomePsycho(int par1) {
		super(par1);
		this.topBlock = (byte)IBAManager.blockPsycho.blockID;
		this.fillerBlock = (byte)IBAManager.orePsycho.blockID;
	}
}
