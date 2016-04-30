package net.lulzcraft.lulzmod.commands;

import org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import net.lulzcraft.lulzmod.LulzMain;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;

@CommandOptions(source = SourceType.PLAYER, 
permission = "lulzmod.say")
public class Command_say extends SimpleCommand<LulzMain> {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		String name = sender.getName();
		String message = StringUtils.join(args, " ");
		Bukkit.broadcastMessage(ChatColor.BLUE + "[SERVER:" + name + "] " + message);
		return true;
	}

}
