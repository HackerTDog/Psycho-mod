package com.Psycho.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class clientProxy extends commonProxy {

	public int addArmor(String armor) { return RenderingRegistry.addNewArmourRendererPrefix(armor); }
	
	public static EntityPlayer getPlayer() {
		return FMLClientHandler.instance().getClient().thePlayer;
	}
	
	public static EntityPlayerMP getPlayerMp(String username) {
		MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
		EntityPlayerMP player = server.getConfigurationManager().getPlayerForUsername(username);
		return player;
	}

	public void registerRenders() {
		
	}
}
