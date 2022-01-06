package me.dogegamer.coolteams;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import me.dogegamer.coolteams.commands.TeamsCommand;

public class CoolTeams extends JavaPlugin{

	public static final String prefix = "[CoolTeams] ";
	
	public static YamlConfiguration config;
	
	public static CoolTeams plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		registerCommands();
		loadConfig();
		System.out.println(prefix + "hola");
		
	}
	
	private void registerCommands() {
		this.getCommand("teams").setExecutor(new TeamsCommand());
	}
	
	public void loadConfig() {
		File file = new File(getDataFolder(), "config.yml");
		if(!file.exists())
			saveResource("config.yml", true);
		config = YamlConfiguration.loadConfiguration(file);
	}

}
