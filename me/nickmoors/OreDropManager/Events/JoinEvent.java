package me.nickmoors.OreDropManager.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.scheduler.BukkitRunnable;

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
		
		if (event.getPlayer().hasPermission(update)) {
			if (Update != false && Reference.Update != false) {
				new BukkitRunnable() {
					
					@Override
					public void run() {
						event.getPlayer().sendMessage(Reference.prefix + " §cUpdate found!");
						event.getPlayer().sendMessage(Reference.prefix + " §9Download it here: §agoo.gl/Quhhoj");
					}
				}.runTaskLater(OreDropManager.instance, 20);
			}
		}
	}
}
