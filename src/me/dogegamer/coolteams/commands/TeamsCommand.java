package me.dogegamer.coolteams.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.dogegamer.coolteams.CoolTeams;
import me.dogegamer.coolteams.Messager;

public class TeamsCommand implements CommandExecutor {

	String[] helpLines = {
			"&a&lCoolTeams",
			"",
			"&a/team help &e- shows this menu",
			"&a/team create [name] &e- create a team",
			"&a/team remove &e- remove a team",
			"&a/team join [player] &e- join a team",
			"&a/team leave &e- leave a team",
			"&a/team sethome &e- set team home",
			"&a/team home &e- teleport to team home",
			"&a/team list &e- list team players",
			"&a/team kick [player] &e- kicl a team player",
			"&a/team config &e- show the config commands",
			"&a/team promote [player] &e- promote a player",
			"&a/team chat [message] &e- send a message to the team ",
	};
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
		if(args.length > 0) {
			if(args[0].equalsIgnoreCase("reload")) {
				CoolTeams.plugin.loadConfig();
				sender.sendMessage(Messager.color(
						"&aThe configuration has been reloaded."));
			} else if (args[0].equalsIgnoreCase("help")) {
			} else {
				sender.sendMessage(Messager.color(
					"&cInvalid arguments! &7Use &b/teams help &7to get help."));
			}
		} else {
			sender.sendMessage(Messager.color(
					"&eUse &b/teams help &eto see how to use the plugin."));
		}
		return true;
	
	}

}
