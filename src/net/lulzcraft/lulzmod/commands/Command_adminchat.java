package net.lulzcraft.lulzmod.commands;

import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SourceType;

import org.apache.commons.lang3.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import net.lulzcraft.lulzmod.AdminChat;
import net.lulzcraft.lulzmod.LulzMain;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.SimpleCommand;


@CommandOptions(source = SourceType.ANY, 
permission = "lulzmod.adminchat", 
aliases = "o")
public class Command_adminchat extends SimpleCommand<LulzMain> {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (args.length == 0) {
			sender.sendMessage(ChatColor.RED + "Please provide a message!");
			return false;
		}
		
		if (!sender.hasPermission("lulzmod.adminchat")) {
			sender.sendMessage(ChatColor.RED + "You have no permissions!");
			return false;
		}
		AdminChat.adminChat(sender, StringUtils.join(args, " "));
		
		return true;
	}

}
