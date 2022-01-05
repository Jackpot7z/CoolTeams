package me.dogegamer.coolteams.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.dogegamer.coolteams.Messager;

public class TeamsCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
		if(args.length > 0) {
			// TODO: add subcommands
			sender.sendMessage(Messager.color(
					"&cInvalid arguments! &7Use &b/teams help &7to get help."));
		} else {
			sender.sendMessage(Messager.color(
					"&eUse &b/teams help &eto see how to use the plugin."));
		}
		return false;
	}

}
