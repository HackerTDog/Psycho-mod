package com.Psycho.info;

public class PsychoInfo {

	public final static String NAME = "Psycho Imagination";
	public final static String ID = "psycho";
	public final static String VERSION = "0.1";
	
	public static String getResource(String UnlocalizedName) {
		return ID + ":" + UnlocalizedName.substring(5);
	}
}
