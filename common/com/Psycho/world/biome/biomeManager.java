package com.Psycho.world.biome;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.BiomeGenBase;

public class biomeManager {
	
	public static BiomeGenBase Psycho;
	
	public static void addBiomes() {
		Psycho = new biomePsycho(23).setMinMaxHeight(2.4F, 4.0F).setTemperatureRainfall(2.0F, 3.0F).setBiomeName("Psycho");
		GameRegistry.addBiome(Psycho);
	}

}
