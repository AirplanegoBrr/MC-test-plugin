package io.glitch.airplanegobrr.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		//Server Start Up
	}
	
	@Override
	public void onDisable() {
		//server shutdown
	}
	
	// /test <-- Test working!
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("test")) {
			if (sender instanceof Player) {
				//player
				Player player = (Player) sender;
				if (player.hasPermission("hello.use")) {
					player.sendMessage("Hey! Welcome to GameOver!");
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1This &2is &4tesing &5colors!"));
					return true;
				}
				player.sendMessage("Hey! Welcome to GameOver!");
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&4It looks like you dont have perm 'hello.use' Please contact admin!"));
				return true;
			}
			else {
				//console
				sender.sendMessage("Hey Console!");
				return true;
			}
		}
		
		return false;
	}
	
}
//eclipse