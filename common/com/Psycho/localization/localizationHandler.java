package com.Psycho.localization;

import cpw.mods.fml.common.registry.LanguageRegistry;
import com.Psycho.Psycho;;

public class localizationHandler {

	public static void loadLanguages() {
		for (final localization localeFile : localization.values())
				Psycho.proxy.loadLocalization(localeFile.fileName(), localeFile.locale());
	}
	
	@Deprecated
	public static void addTabLocalization(String tab, String local) {
    	LanguageRegistry.instance().addStringLocalization("itemGroup." + tab, local);
    }
    
	
}