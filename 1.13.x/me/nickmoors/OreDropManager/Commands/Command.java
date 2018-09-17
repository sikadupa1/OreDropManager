package me.nickmoors.OreDropManager.Commands;

import me.nickmoors.OreDropManager.OreDropManager;

public class Command {

	public static void enable() {
		OreDropManager.instance.getCommand("drop").setExecutor(new DropCommand());
	}
}
