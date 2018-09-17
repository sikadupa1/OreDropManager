package me.nickmoors.OreDropManager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import me.nickmoors.OreDropManager.Commands.Command;
import me.nickmoors.OreDropManager.Config.ConfigFile;
import me.nickmoors.OreDropManager.Events.Event;

public class OreDropManager extends JavaPlugin {
	
	public static OreDropManager instance;
	public static String version = "Unknown";
	
	@Override
	public void onEnable() {
		version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
		
		instance = this;
		ConfigFile.enable();
		Reference.oreList();
		Command.enable();
		Event.enable();
		Reference.Enable();
	}
		
	@Override
	public void onDisable() {
		ConfigFile.disable();
		instance = null;
	}
}
