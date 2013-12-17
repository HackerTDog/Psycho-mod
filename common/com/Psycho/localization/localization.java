package com.Psycho.localization;

public enum localization {
	US("en_US");
	
	private final String locale;
	
	localization(String locale) {
		this.locale = locale;
	}
	
	public String fileName() {
        return String.format("/assets/psycho/localization/%s.xml", locale);	}
	
	public String locale() {
		return locale;
	}
}
