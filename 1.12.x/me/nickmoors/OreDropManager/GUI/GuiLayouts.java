package me.nickmoors.OreDropManager.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

import me.nickmoors.OreDropManager.Reference;
import me.nickmoors.OreDropManager.Handlers.GuiHandler;
import net.md_5.bungee.api.ChatColor;

public class GuiLayouts {
	
	public static Inventory Main = Bukkit.createInventory(null, 27, Reference.prefix + ChatColor.BLUE + " Config Editor");

	static {
		//Main + Navigation
		Main.setItem(0, GuiHandler.addItem(Material.COAL_ORE, "§8Coal", 1, 0));
		Main.setItem(1, GuiHandler.addItem(Material.IRON_ORE, "§7Iron", 1, 0));
		Main.setItem(2, GuiHandler.addItem(Material.LAPIS_ORE, "§3Lapis", 1, 0));
		Main.setItem(3, GuiHandler.addItem(Material.GOLD_ORE, "§6Gold", 1, 0));
		Main.setItem(4, GuiHandler.addStatusInfo(Material.PAPER, "§3Update Notification: ", 21, "Update"));
		Main.setItem(5, GuiHandler.addItem(Material.REDSTONE_ORE, "§cRedstone", 1, 0));
		Main.setItem(6, GuiHandler.addItem(Material.DIAMOND_ORE, "§bDiamond", 1, 0));
		Main.setItem(7, GuiHandler.addItem(Material.EMERALD_ORE, "§aEmerald", 1, 0));
		Main.setItem(8, GuiHandler.addItem(Material.QUARTZ_ORE, "§fQuartz", 1, 0));
		
		Main.setItem(12, GuiHandler.addStatusInfo(Material.DIAMOND_PICKAXE, "§3RandomNormalDrop: ", 21, "RandomNormalAmount"));
		Main.setItem(13, GuiHandler.addStatusInfo(Material.CHEST, "§3PutDropInInventory: ", 21, "PutDropInInventory"));
		Main.setItem(14, GuiHandler.addStatusInfo(Material.DIAMOND_PICKAXE, "§3FortuneControl: ", 21, "FortuneControl"));
		
		Main.setItem(21, GuiHandler.addStatusInfo(Material.EXP_BOTTLE, "§3RandomNormalXP: ", 21, "RandomNormalXP"));
		Main.setItem(22, GuiHandler.addStatusInfo(Material.ENCHANTMENT_TABLE, "§3CustomXPDrop: ", 21, "XP"));
		Main.setItem(23, GuiHandler.addStatusInfo(Material.EXP_BOTTLE, "§3RandomFortuneXP: ", 21, "RandomFortuneXP"));
		Main.setItem(26, GuiHandler.getPlayerHead("§cQuit Menu"));
	}
	
	public static Inventory Quit = Bukkit.createInventory(null, 27, Reference.prefix + "Quit & Save?");
	
	static {
		//Red
		Quit.setItem(0, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		Quit.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		Quit.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		Quit.setItem(9, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		Quit.setItem(10, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		Quit.setItem(11, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		Quit.setItem(18, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		Quit.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		Quit.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§cDon't Save & Quit", 0, 14));
		//Orange
		Quit.setItem(3, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		Quit.setItem(4, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		Quit.setItem(5, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		Quit.setItem(12, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		Quit.setItem(13, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		Quit.setItem(14, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		Quit.setItem(21, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		Quit.setItem(22, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		Quit.setItem(23, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§6Continue editing", 0, 1));
		//Green
		Quit.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));
		Quit.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));
		Quit.setItem(8, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));	
		Quit.setItem(15, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));
		Quit.setItem(16, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));
		Quit.setItem(17, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));
		Quit.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));
		Quit.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));
		Quit.setItem(26, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§aSave & Quit", 0, 5));
	}
	
	public static Inventory Coal = Bukkit.createInventory(null, 54, Reference.prefix + "§9Editing Coal");
	
	static {
		//Coal
		Coal.setItem(4, GuiHandler.addStatusInfo(Material.COAL_ORE, "§8Coal", 1,"Coal"));
		Coal.setItem(49, GuiHandler.getPlayerHead("§cMain Menu"));
		
		//Drop
		Coal.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 5, 5));
		Coal.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 6, 5));
		Coal.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 7, 5));
		Coal.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 8, 5));
		Coal.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Coal"));
		Coal.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Coal"));
		Coal.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Coal"));
		Coal.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Coal"));
		Coal.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 9, 14));
		Coal.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 10, 14));
		Coal.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 11, 14));
		Coal.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 12, 14));
		
		//XP
		Coal.setItem(28, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 13, 5));
		Coal.setItem(29, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 14, 5));
		Coal.setItem(33, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 15, 5));
		Coal.setItem(34, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 16, 5));
		Coal.setItem(37, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Coal"));
		Coal.setItem(38, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Coal"));
		Coal.setItem(42, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Coal"));
		Coal.setItem(43, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Coal"));
		Coal.setItem(46, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 17, 14));
		Coal.setItem(47, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 18, 14));
		Coal.setItem(51, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 19, 14));
		Coal.setItem(52, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 20, 14));
	}
	
	public static Inventory Iron = Bukkit.createInventory(null, 54, Reference.prefix + "§9Editing Iron");
	
	static {
		//Iron
		Iron.setItem(4, GuiHandler.addStatusInfo(Material.IRON_ORE, "§7Iron", 1,"Iron"));
		Iron.setItem(49, GuiHandler.getPlayerHead("§cMain Menu"));
		
		//Drop
		Iron.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 5, 5));
		Iron.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 6, 5));
		Iron.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 7, 5));
		Iron.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 8, 5));
		Iron.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Iron"));
		Iron.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Iron"));
		Iron.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Iron"));
		Iron.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Iron"));
		Iron.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 9, 14));
		Iron.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 10, 14));
		Iron.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 11, 14));
		Iron.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 12, 14));
		
		//XP
		Iron.setItem(28, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 13, 5));
		Iron.setItem(29, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 14, 5));
		Iron.setItem(33, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 15, 5));
		Iron.setItem(34, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 16, 5));
		Iron.setItem(37, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Iron"));
		Iron.setItem(38, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Iron"));
		Iron.setItem(42, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Iron"));
		Iron.setItem(43, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Iron"));
		Iron.setItem(46, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 17, 14));
		Iron.setItem(47, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 18, 14));
		Iron.setItem(51, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 19, 14));
		Iron.setItem(52, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 20, 14));
	}
	
	public static Inventory Lapis = Bukkit.createInventory(null, 54, Reference.prefix + "§9Editing Lapis");
	
	static {
		//Lapis
		Lapis.setItem(4, GuiHandler.addStatusInfo(Material.LAPIS_ORE, "§3Lapis", 1,"Lapis"));
		Lapis.setItem(49, GuiHandler.getPlayerHead("§cMain Menu"));
		
		//Drop
		Lapis.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 5, 5));
		Lapis.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 6, 5));
		Lapis.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 7, 5));
		Lapis.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 8, 5));
		Lapis.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Lapis"));
		Lapis.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Lapis"));
		Lapis.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Lapis"));
		Lapis.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Lapis"));
		Lapis.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 9, 14));
		Lapis.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 10, 14));
		Lapis.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 11, 14));
		Lapis.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 12, 14));
		
		//XP
		Lapis.setItem(28, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 13, 5));
		Lapis.setItem(29, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 14, 5));
		Lapis.setItem(33, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 15, 5));
		Lapis.setItem(34, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 16, 5));
		Lapis.setItem(37, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Lapis"));
		Lapis.setItem(38, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Lapis"));
		Lapis.setItem(42, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Lapis"));
		Lapis.setItem(43, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Lapis"));
		Lapis.setItem(46, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 17, 14));
		Lapis.setItem(47, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 18, 14));
		Lapis.setItem(51, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 19, 14));
		Lapis.setItem(52, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 20, 14));
	}

public static Inventory Gold = Bukkit.createInventory(null, 54, Reference.prefix + "§9Editing Gold");
	
	static {
		//Gold
		Gold.setItem(4, GuiHandler.addStatusInfo(Material.GOLD_ORE, "§6Gold", 1,"Gold"));
		Gold.setItem(49, GuiHandler.getPlayerHead("§cMain Menu"));
		
		//Drop
		Gold.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 5, 5));
		Gold.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 6, 5));
		Gold.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 7, 5));
		Gold.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 8, 5));
		Gold.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Gold"));
		Gold.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Gold"));
		Gold.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Gold"));
		Gold.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Gold"));
		Gold.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 9, 14));
		Gold.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 10, 14));
		Gold.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 11, 14));
		Gold.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 12, 14));
		
		//XP
		Gold.setItem(28, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 13, 5));
		Gold.setItem(29, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 14, 5));
		Gold.setItem(33, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 15, 5));
		Gold.setItem(34, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 16, 5));
		Gold.setItem(37, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Gold"));
		Gold.setItem(38, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Gold"));
		Gold.setItem(42, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Gold"));
		Gold.setItem(43, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Gold"));
		Gold.setItem(46, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 17, 14));
		Gold.setItem(47, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 18, 14));
		Gold.setItem(51, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 19, 14));
		Gold.setItem(52, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 20, 14));
	}
	
	public static Inventory Redstone = Bukkit.createInventory(null, 54, Reference.prefix + "§9Editing Redstone");
	
	static {
		//Redstone
		Redstone.setItem(4, GuiHandler.addStatusInfo(Material.REDSTONE_ORE, "§cRedstone", 1,"Redstone"));
		Redstone.setItem(49, GuiHandler.getPlayerHead("§cMain Menu"));
		
		//Drop
		Redstone.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 5, 5));
		Redstone.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 6, 5));
		Redstone.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 7, 5));
		Redstone.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 8, 5));
		Redstone.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Redstone"));
		Redstone.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Redstone"));
		Redstone.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Redstone"));
		Redstone.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Redstone"));
		Redstone.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 9, 14));
		Redstone.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 10, 14));
		Redstone.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 11, 14));
		Redstone.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 12, 14));
		
		//XP
		Redstone.setItem(28, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 13, 5));
		Redstone.setItem(29, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 14, 5));
		Redstone.setItem(33, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 15, 5));
		Redstone.setItem(34, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 16, 5));
		Redstone.setItem(37, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Redstone"));
		Redstone.setItem(38, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Redstone"));
		Redstone.setItem(42, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Redstone"));
		Redstone.setItem(43, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Redstone"));
		Redstone.setItem(46, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 17, 14));
		Redstone.setItem(47, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 18, 14));
		Redstone.setItem(51, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 19, 14));
		Redstone.setItem(52, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 20, 14));
	}
	
	public static Inventory Diamond = Bukkit.createInventory(null, 54, Reference.prefix + "§9Editing Diamond");
	
	static {
		//Diamond
		Diamond.setItem(4, GuiHandler.addStatusInfo(Material.DIAMOND_ORE, "§bDiamond", 1,"Diamond"));
		Diamond.setItem(49, GuiHandler.getPlayerHead("§cMain Menu"));
		
		//Drop
		Diamond.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 5, 5));
		Diamond.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 6, 5));
		Diamond.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 7, 5));
		Diamond.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 8, 5));
		Diamond.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Diamond"));
		Diamond.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Diamond"));
		Diamond.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Diamond"));
		Diamond.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Diamond"));
		Diamond.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 9, 14));
		Diamond.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 10, 14));
		Diamond.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 11, 14));
		Diamond.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 12, 14));
		
		//XP
		Diamond.setItem(28, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 13, 5));
		Diamond.setItem(29, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 14, 5));
		Diamond.setItem(33, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 15, 5));
		Diamond.setItem(34, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 16, 5));
		Diamond.setItem(37, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Diamond"));
		Diamond.setItem(38, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Diamond"));
		Diamond.setItem(42, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Diamond"));
		Diamond.setItem(43, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Diamond"));
		Diamond.setItem(46, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 17, 14));
		Diamond.setItem(47, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 18, 14));
		Diamond.setItem(51, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 19, 14));
		Diamond.setItem(52, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 20, 14));
	}
	
	public static Inventory Emerald = Bukkit.createInventory(null, 54, Reference.prefix + "§9Editing Emerald");
	
	static {
		//Emerald
		Emerald.setItem(4, GuiHandler.addStatusInfo(Material.EMERALD_ORE, "§aEmerald", 1,"Emerald"));
		Emerald.setItem(49, GuiHandler.getPlayerHead("§cMain Menu"));
		
		//Drop
		Emerald.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 5, 5));
		Emerald.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 6, 5));
		Emerald.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 7, 5));
		Emerald.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 8, 5));
		Emerald.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Emerald"));
		Emerald.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Emerald"));
		Emerald.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Emerald"));
		Emerald.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Emerald"));
		Emerald.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 9, 14));
		Emerald.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 10, 14));
		Emerald.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 11, 14));
		Emerald.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 12, 14));
		
		//XP
		Emerald.setItem(28, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 13, 5));
		Emerald.setItem(29, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 14, 5));
		Emerald.setItem(33, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 15, 5));
		Emerald.setItem(34, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 16, 5));
		Emerald.setItem(37, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Emerald"));
		Emerald.setItem(38, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Emerald"));
		Emerald.setItem(42, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Emerald"));
		Emerald.setItem(43, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Emerald"));
		Emerald.setItem(46, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 17, 14));
		Emerald.setItem(47, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 18, 14));
		Emerald.setItem(51, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 19, 14));
		Emerald.setItem(52, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 20, 14));
	}

	
	public static Inventory Quartz = Bukkit.createInventory(null, 54, Reference.prefix + "§9Editing Quartz");
	
	static {
		//Quartz
		Quartz.setItem(4, GuiHandler.addStatusInfo(Material.QUARTZ_ORE, "§fQuartz", 1,"Quartz"));
		Quartz.setItem(49, GuiHandler.getPlayerHead("§cMain Menu"));
		
		//Drop
		Quartz.setItem(1, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 5, 5));
		Quartz.setItem(2, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 6, 5));
		Quartz.setItem(6, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 7, 5));
		Quartz.setItem(7, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 8, 5));
		Quartz.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Quartz"));
		Quartz.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3NormalAmount", "§9Current value: ", "NormalAmount", "Quartz"));
		Quartz.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Quartz"));
		Quartz.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§3FortuneAmount", "§9Current value: ", "FortuneAmount", "Quartz"));
		Quartz.setItem(19, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 9, 14));
		Quartz.setItem(20, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 10, 14));
		Quartz.setItem(24, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 11, 14));
		Quartz.setItem(25, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 12, 14));
		
		//XP
		Quartz.setItem(28, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 13, 5));
		Quartz.setItem(29, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 14, 5));
		Quartz.setItem(33, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+1", 15, 5));
		Quartz.setItem(34, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l+10", 16, 5));
		Quartz.setItem(37, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Quartz"));
		Quartz.setItem(38, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3NormalXP", "§9Current value: ", "NormalXP", "Quartz"));
		Quartz.setItem(42, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Quartz"));
		Quartz.setItem(43, GuiHandler.addAdvToolInfo(Material.EXP_BOTTLE, "§3FortuneXP", "§9Current value: ", "FortuneXP", "Quartz"));
		Quartz.setItem(46, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 17, 14));
		Quartz.setItem(47, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 18, 14));
		Quartz.setItem(51, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-1", 19, 14));
		Quartz.setItem(52, GuiHandler.addItem(Material.STAINED_GLASS_PANE, "§a§l-10", 20, 14));
	}
}
