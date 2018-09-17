package me.nickmoors.OreDropManager.Events;

import me.nickmoors.OreDropManager.OreDropManager;

public class Event {
	
	public static void enable() {
		OreDropManager.instance.getServer().getPluginManager().registerEvents(new JoinEvent(), OreDropManager.instance);
		
		if (OreDropManager.version.equals("v1_13_R1") || OreDropManager.version.equals("v1_13_R2")) {
			OreDropManager.instance.getServer().getPluginManager().registerEvents(new OreBreakEvent(), OreDropManager.instance);
			OreDropManager.instance.getServer().getPluginManager().registerEvents(new InvInteractEvent(), OreDropManager.instance);
			OreDropManager.instance.getServer().getPluginManager().registerEvents(new InvCloseEvent(), OreDropManager.instance);
		}	
	}
}
