package me.nickmoors.OreDropManager.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

import me.nickmoors.OreDropManager.OreDropManager;
import me.nickmoors.OreDropManager.Reference;

public class JoinEvent implements Listener {

	Permission update = new Permission("drop.update", PermissionDefault.FALSE);
	public static boolean Update = false;
	
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
		
		if (event.getPlayer().getName().equals("Mr_Graycat") || event.getPlayer().getName().equals("MrGraycats")) {
			event.getPlayer().sendMessage("§f[§cOreDropManager§f] §9This server is using your plugin!");
		}
		
		if (!OreDropManager.version.equals("v1_13_R1") && !OreDropManager.version.equals("v1_13_R2")) {
			event.getPlayer().sendMessage(Reference.prefix + " §cThis plugin version (§3v1_13_R1/R2§c) is not compatible with this server version! (§3" + OreDropManager.version + "§c)");
		}
	}
}
