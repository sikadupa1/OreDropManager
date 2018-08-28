package me.nickmoors.OreDropManager.Events;

import me.nickmoors.OreDropManager.OreDropManager;

public class Event {
	
	public static void enable() {
		OreDropManager.instance.getServer().getPluginManager().registerEvents(new OreBreakEvent(), OreDropManager.instance);
		OreDropManager.instance.getServer().getPluginManager().registerEvents(new InvInteractEvent(), OreDropManager.instance);
		OreDropManager.instance.getServer().getPluginManager().registerEvents(new JoinEvent(), OreDropManager.instance);
		OreDropManager.instance.getServer().getPluginManager().registerEvents(new InvCloseEvent(), OreDropManager.instance);
	}
}
