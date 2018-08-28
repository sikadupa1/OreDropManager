package me.nickmoors.OreDropManager.Config;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;

import me.nickmoors.OreDropManager.OreDropManager;

public class MessagesFile {
	public static YamlConfiguration messages;
	static File messagesf;

	public static void enable() {
		messagesf = new File(OreDropManager.instance.getDataFolder(), "config.yml");
		try {
			if (!OreDropManager.instance.getDataFolder().exists()) {
				OreDropManager.instance.getDataFolder().mkdirs();
			}

			if (!messagesf.exists()) {
				OreDropManager.instance.getLogger().info("Config.yml not found, creating!");
				messagesf.getParentFile().mkdirs();
				OreDropManager.instance.saveResource("config.yml", false);
			} else {
				OreDropManager.instance.getLogger().info("Config.yml found, loading!");
			}

			messages = YamlConfiguration.loadConfiguration(messagesf);

			messages.load(messagesf);
		} catch (Exception e) {
			OreDropManager.instance.getLogger().info("I'm sorry, but this happened:");
			e.printStackTrace();
		}
	}

	public static void reload() {
		OreDropManager.instance.reloadConfig();
	}

	public static void update() {
		try {
			messages.save(messagesf);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
