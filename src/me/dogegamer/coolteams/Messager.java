package me.dogegamer.coolteams;

import org.bukkit.ChatColor;

public class Messager {

	public static final char ALT_COLOR_CHAR = '&';
	
	public static String color(String text) {
		return ChatColor.translateAlternateColorCodes(ALT_COLOR_CHAR, text);
	}
	
	public static String colorFormat(String text, Object... format) {
		return color(String.format(text, format));
	}
	
}
