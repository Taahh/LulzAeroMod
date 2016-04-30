package net.lulzcraft.lulzmod.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import net.lulzcraft.lulzmod.LulzMain;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.SimpleCommand;

public class Command_lam extends SimpleCommand<LulzMain> {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		sender.sendMessage(ChatColor.RED + "-=-=-LulzAeroMod-=-=-");
		sender.sendMessage(ChatColor.GOLD + "Created by TPhoenixG");
		sender.sendMessage(ChatColor.GOLD + "Version 1.5");
		sender.sendMessage(ChatColor.RED + "-=-=-LulzAeroMod-=-=-");
		return true;
	}

}
