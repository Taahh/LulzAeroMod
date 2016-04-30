package net.lulzcraft.lulzmod;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class AdminChat {
	
	public static void adminChat(CommandSender sender, String message) {
		String name = sender.getName();
		for (Player player : Bukkit.getOnlinePlayers()) {
			if (player.hasPermission("lulzmod.adminchat.view")) {
				player.sendMessage(ChatColor.GRAY + "[" + ChatColor.BLUE + "AdminChat" + ChatColor.GRAY + "] " + ChatColor.BLUE + name + ChatColor.WHITE + " : " + ChatColor.AQUA + message);
			}
		}
	}

}
