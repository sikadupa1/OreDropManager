package me.nickmoors.OreDropManager.Config;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

import me.nickmoors.OreDropManager.OreDropManager;

public class ConfigFile {

  public static YamlConfiguration config;
  public static File configf;
  
  public static void enable()
  {
    configf = new File(OreDropManager.instance.getDataFolder(), "config.yml");
    try
    {
      if (!OreDropManager.instance.getDataFolder().exists()) {
        OreDropManager.instance.getDataFolder().mkdirs();
      }
      
      if (!configf.exists()) {
        OreDropManager.instance.getLogger().info("Config.yml not found, creating!");
        configf.getParentFile().mkdirs();
        OreDropManager.instance.saveResource("config.yml", false);
      } else {
        OreDropManager.instance.getLogger().info("Config.yml found, loading!");
      }
      
      config = YamlConfiguration.loadConfiguration(configf);
      
      config.load(configf);
    }
    catch (Exception e) {
      OreDropManager.instance.getLogger().info("I'm sorry, but this happened:");
      e.printStackTrace();
    }
  }
  
  public static void changeValue(String path, boolean value, boolean update) {
	  config.set(path, value);
	  if (update == true) {
		  update();
	  }
  }
  
  public static void changeIntValue(String path, int value, boolean update) {
	  config.set(path, value);
	  if (update == true) {
		  update();
	  }
  }
  
  public static boolean getValue(String path) {
	  return config.getBoolean(path);
  }
  
  public static int getIntValue(String path) {
	  return config.getInt(path);
  }
  
  public static void disable() {
    try {
      config.save(configf);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public static void reload() {
	  OreDropManager.instance.reloadConfig();
  }
  
  public static void update() {
	try {
		config.save(configf);
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
 }