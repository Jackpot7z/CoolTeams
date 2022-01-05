package me.dogegamer.coolteams;

import org.bukkit.plugin.java.JavaPlugin;

import me.dogegamer.coolteams.commands.TeamsCommand;

public class CoolTeams extends JavaPlugin{

	public static final String prefix = "[CoolTeams] ";
	
	@Override
	public void onEnable() {
		registerCommands();
		System.out.println(prefix + "hola");
	}

	private void registerCommands() {
		this.getCommand("teams").setExecutor(new TeamsCommand());
	}
	
}
