package me.nickmoors.OreDropManager.Handlers;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import me.nickmoors.OreDropManager.Reference;
import me.nickmoors.OreDropManager.Config.ConfigFile;
import me.nickmoors.OreDropManager.GUI.GuiLayouts;

public class GuiHandler {
	
	public static ItemStack addItem(Material material, String name, int loreType) {
		ArrayList<String> lores = new ArrayList<String>();
		ItemStack item = null;
		
		item = new ItemStack(material);
		ItemMeta meta = item.getItemMeta();
		
		if (loreType != 0) {
			lores.add(Reference.getLore(loreType));
		}

		meta.setDisplayName(name);
		meta.setLore(lores);
		item.setItemMeta(meta);
		
		return item;
	}
	
	public static ItemStack addStatusInfo(Material material, String name, int lore, String type) {
		
		ArrayList<String> lores = new ArrayList<String>();
		ItemStack item = new ItemStack(material);
		ItemMeta meta = item.getItemMeta();
		String status = "";
		
		if (type.equals(Reference.oreList.get(0)) || type.equals(Reference.oreList.get(1)) || type.equals(Reference.oreList.get(2)) || type.equals(Reference.oreList.get(3)) || type.equals(Reference.oreList.get(4)) || type.equals(Reference.oreList.get(5)) || type.equals(Reference.oreList.get(6)) || type.equals(Reference.oreList.get(7))) {
			if (ConfigFile.getValue(type + Reference.pathOreEnabled) == true) {
				status = "§aEnabled";
			} else if (ConfigFile.getValue(type + Reference.pathOreEnabled) == false){
				status = "§cDisabled";
			}
			
			lores.add("§9Status: " + status);
			lores.add(Reference.getLore(21));
			
			meta.setDisplayName(name);
			meta.setLore(lores);
			item.setItemMeta(meta);
			return item;
			
		} else if (type.equals(Reference.typeFortuneControl)){
			lores.add("§9When enabled:");
		    lores.add("§9The FortuneAmount will be used");
		    lores.add("§9for a fortune pickaxe.");
			lores.add(Reference.getLore(21));
			
			if (ConfigFile.getValue(Reference.pathFortuneControl) == true) {
				status = "§aEnabled";
			} else if (ConfigFile.getValue(Reference.pathFortuneControl) == false){
				status = "§cDisabled";
			}
			
			meta.setDisplayName(name + status);
			meta.setLore(lores);
			meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item.setItemMeta(meta);
			return item;
			
		} else if (type.equals(Reference.typeRandomNormalAmount)) {
			lores.add("§9When enabled:");
		    lores.add("§9Uses a random amount to drop if");
		    lores.add("§9Normal amount is higher than 1.");
		    lores.add(Reference.getLore(21));
			
			if (ConfigFile.getValue(Reference.pathRandomNormalAmount) == true) {
				status = "§aEnabled";
			} else if (ConfigFile.getValue(Reference.pathRandomNormalAmount) == false){
				status = "§cDisabled";
			}
					
			meta.setDisplayName(name + status);
			meta.setLore(lores);
			item.setItemMeta(meta);
			return item;
			
		} else if (type.equals(Reference.typePutDropInInv)) {
			lores.add("§9When enabled:");
	    	lores.add("§9Drops will be put in inventory");
	    	lores.add("§9Prevent lag and removal from clearlag");
	    	lores.add(Reference.getLore(21));
		
	    	if (ConfigFile.getValue(Reference.pathPutDropInInv) == true) {
	    		status = "§aEnabled";
	    	} else if (ConfigFile.getValue(Reference.pathPutDropInInv) == false){
	    		status = "§cDisabled";
	    	}
				
	    	meta.setDisplayName(name + status);
	    	meta.setLore(lores);
	    	item.setItemMeta(meta);
	    	return item;
	    	
		} else if (type.equals(Reference.typeRandomNormalXP)) {
			lores.add("§9When enabled:");
    		lores.add("§9Uses a random amount of XP to drop for");
    		lores.add("§9normal, if XP Control is enabled.");
    		lores.add(Reference.getLore(21));
	
    		if (ConfigFile.getValue(Reference.pathRandomNormalXP) == true) {
    			status = "§aEnabled";
    		} else if (ConfigFile.getValue(Reference.pathRandomNormalXP) == false){
    			status = "§cDisabled";
    		}
			
    		meta.setDisplayName(name + status);
    		meta.setLore(lores);
    		item.setItemMeta(meta);
    		return item;
    		
		} else if (type.equals(Reference.typeRandomFortuneXP)) {
			lores.add("§9When enabled:");
			lores.add("§9Uses a random amount of XP to drop for");
			lores.add("§9fortune, if CustomXPDrop is enabled.");
			lores.add(Reference.getLore(21));

			if (ConfigFile.getValue(Reference.pathRandomFortuneXP) == true) {
				status = "§aEnabled";
			} else if (ConfigFile.getValue(Reference.pathRandomFortuneXP) == false){
				status = "§cDisabled";
			}
		
			meta.setDisplayName(name + status);
			meta.setLore(lores);
			meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item.setItemMeta(meta);
			return item;
						
		} else if (type.equals(Reference.typeXP)) {
			lores.add("§9When enabled:");
    		lores.add("§9Vanilla XP drops will be replaced");
    		lores.add("§9with the ones in the config.");
    		lores.add(Reference.getLore(21));
	
    		if (ConfigFile.getValue(Reference.pathXP) == true) {
    			status = "§aEnabled";
    		} else if (ConfigFile.getValue(Reference.pathXP) == false){
    			status = "§cDisabled";
    		}
			
    		meta.setDisplayName(name + status);
    		meta.setLore(lores);
    		item.setItemMeta(meta);
    		return item;
    		
		} else if (type.equals(Reference.typeUpdate)) {
			lores.add("§9When enabled:");
		    lores.add("§9You will receive update notifications");
		    lores.add("§9when joining.");
		    lores.add(Reference.getLore(21));
		    
		    if (ConfigFile.getValue(Reference.pathUpdate) == true) {
		    	status = "§aEnabled";
		    } else if (ConfigFile.getValue(Reference.pathUpdate) == false) {
		    	status = "§cDisabled";
		    }
		    
		    meta.setDisplayName(name + status);
		    meta.setLore(lores);
		    item.setItemMeta(meta);
		    return item;
		    
		}	
		return null;
	}
	
	public static ItemStack addAdvToolInfo(Material material, String name, String lore, String type, String mtype) {
		ArrayList<String> lores = new ArrayList<String>();
		ItemStack item = new ItemStack(material);
		ItemMeta meta = item.getItemMeta();
		
		switch(type) {		
		case("NormalAmount"):
			lores.add(lore);
			lores.add("§9" + ConfigFile.getIntValue(mtype + Reference.pathOreNormalAmount));
			
			meta.setDisplayName(name);
			meta.setLore(lores);
			item.setItemMeta(meta);
			return item;
		
		case("FortuneAmount"):
			lores.add(lore);
			lores.add("§9" + ConfigFile.getIntValue(mtype + Reference.pathOreFortuneAmount));
			
			meta.setDisplayName(name);
			meta.setLore(lores);
			meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item.setItemMeta(meta);
			return item;

		case("NormalXP"):
			lores.add(lore);
			lores.add("§9" + ConfigFile.getIntValue(mtype + Reference.pathOreNormalXP));
			
			meta.setDisplayName(name);
			meta.setLore(lores);
			item.setItemMeta(meta);
			return item;
			
		case("FortuneXP"):
			lores.add(lore);
			lores.add("§9" + ConfigFile.getIntValue(mtype + Reference.pathOreFortuneXP));
		
			meta.setDisplayName(name);
			meta.setLore(lores);
			meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
			meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			item.setItemMeta(meta);
		return item;
		}
		return null;
	}
	
	public static ItemStack getPlayerHead(String name){
		ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
		SkullMeta meta = (SkullMeta)skull.getItemMeta();
		meta.setOwningPlayer(Bukkit.getOfflinePlayer(UUID.fromString("484bd042-3924-425f-b31c-82b689a9ef57")));
	    meta.setDisplayName(name);
	    skull.setItemMeta(meta);
		return skull;
	}
	
	public static void update(Inventory inv, int slot, String type, String ore) {
		
		
		String name = Reference.Cyan + type + ": ";	
		
		if (type == Reference.typeRandomNormalAmount) {
			inv.setItem(slot, GuiHandler.addStatusInfo(Material.DIAMOND_PICKAXE, name, 21, type));
		} else if (type == Reference.typeFortuneControl) {
			inv.setItem(slot, GuiHandler.addStatusInfo(Material.DIAMOND_PICKAXE, name, 21, type));
		} else if (type == Reference.typeRandomFortuneXP) {
			inv.setItem(slot, GuiHandler.addStatusInfo(Material.EXPERIENCE_BOTTLE, name, 21, type));
		} else if (type == Reference.typeRandomNormalXP) {
			inv.setItem(slot, GuiHandler.addStatusInfo(Material.EXPERIENCE_BOTTLE, name, 21, type));
		} else if (type == Reference.typePutDropInInv){
			inv.setItem(slot, GuiHandler.addStatusInfo(Material.CHEST, name, 21, type));
		} else if (type == Reference.typeXP) {
			name = Reference.Cyan + "Custom" + type + "Drop: ";
			inv.setItem(slot, GuiHandler.addStatusInfo(Material.ENCHANTING_TABLE, name, 21, type));
		} else if (type == Reference.typeNormalXP) {
			inv.setItem(37, GuiHandler.addAdvToolInfo(Material.EXPERIENCE_BOTTLE, "§3NormalXP", "§9Current value: ", Reference.typeNormalXP, ore));
			inv.setItem(38, GuiHandler.addAdvToolInfo(Material.EXPERIENCE_BOTTLE, "§3NormalXP", "§9Current value: ", Reference.typeNormalXP, ore));	
		} else if (type == Reference.typeFortuneXP) {
			inv.setItem(42, GuiHandler.addAdvToolInfo(Material.EXPERIENCE_BOTTLE, "§3FortuneXP", "§9Current value: ", Reference.typeFortuneXP, ore));
			inv.setItem(43, GuiHandler.addAdvToolInfo(Material.EXPERIENCE_BOTTLE, "§3FortuneXP", "§9Current value: ", Reference.typeFortuneXP, ore));			
		} else if (type == Reference.typeNormalAmount) {
			inv.setItem(10, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§bNormalAmount", "§9Current value: ", Reference.typeNormalAmount, ore));
			inv.setItem(11, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§bNormalAmount", "§9Current value: ", Reference.typeNormalAmount, ore));
		} else if (type == Reference.typeFortuneAmount) {
			inv.setItem(15, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§bFortuneAmount", "§9Current value: ", Reference.typeFortuneAmount, ore));
			inv.setItem(16, GuiHandler.addAdvToolInfo(Material.DIAMOND_PICKAXE, "§bFortuneAmount", "§9Current value: ", Reference.typeFortuneAmount, ore));
		} else if (type == Reference.typeUpdate) {
			name = Reference.Cyan + type + " Notification: ";
			inv.setItem(slot, GuiHandler.addStatusInfo(Material.PAPER, name, 21, type));
		}
	}
	
	public static void oreInvUpdate(Material material, ItemMeta meta,Player player, Inventory inventory, int slot, String name) {
		
		String pathNormal = name + Reference.pathOreNormalAmount;
		String pathFortune = name + Reference.pathOreFortuneAmount;
		String pathNormalXP = name + Reference.pathOreNormalXP;
		String pathFortuneXP = name + Reference.pathOreFortuneXP;
		
		int valueNormal = ConfigFile.getIntValue(pathNormal);
		int valueFortune = ConfigFile.getIntValue(pathFortune);
		int valueNormalXP = ConfigFile.getIntValue(pathNormalXP);
		int valueFortuneXP = ConfigFile.getIntValue(pathFortuneXP);
		
		String displayName = meta.getDisplayName();
		
		if (material.name().contains("STAINED_GLASS_PANE") && displayName.contains("+10") || displayName.contains("+1") || displayName.contains("-1") || displayName.contains("-10")) {
			
			switch(slot) {
			case(1):
				ConfigFile.changeIntValue(pathNormal, valueNormal + 10, true);
				GuiHandler.update(inventory, slot, Reference.typeNormalAmount, name);
				player.updateInventory();
				break;
			case(2):
				ConfigFile.changeIntValue(pathNormal, valueNormal + 1, true);
				GuiHandler.update(inventory, slot, Reference.typeNormalAmount, name);
				player.updateInventory();
				break;
			case(19):
				if (GuiHandler.checkPossible(valueNormal, "-", 10) == true) {
					ConfigFile.changeIntValue(pathNormal, valueNormal - 10, true);
					GuiHandler.update(inventory, slot, Reference.typeNormalAmount, name);
					player.updateInventory();
					break;
				} else {
					if (valueNormal != 0) {
						ConfigFile.changeIntValue(pathNormal, 0, true);
						GuiHandler.update(inventory, slot, Reference.typeNormalAmount, name);
						player.updateInventory();
					}
					break;
				}
			case(20):
				if (GuiHandler.checkPossible(valueNormal, "-", 1) == true) {
					ConfigFile.changeIntValue(pathNormal, valueNormal - 1, true);
					GuiHandler.update(inventory, slot, Reference.typeNormalAmount, name);
					player.updateInventory();
					break;
				} else {
					if (valueNormal != 0) {
						ConfigFile.changeIntValue(pathNormal, 0, true);
						GuiHandler.update(inventory, slot, Reference.typeNormalAmount, name);
						player.updateInventory();
					}
					break;
				}
			case(7):
				ConfigFile.changeIntValue(pathFortune, valueFortune + 10, true);
				GuiHandler.update(inventory, slot, Reference.typeFortuneAmount, name);
				player.updateInventory();
				break;
			case(6):
				ConfigFile.changeIntValue(pathFortune, valueFortune + 1, true);
				GuiHandler.update(inventory, slot, Reference.typeFortuneAmount, name);
				player.updateInventory();
				break;
			case(25):
				if (GuiHandler.checkPossible(valueFortune, "-", 10) == true) {
					ConfigFile.changeIntValue(pathFortune, valueFortune - 10, true);
					GuiHandler.update(inventory, slot, Reference.typeFortuneAmount, name);
					player.updateInventory();
					break;
				} else {
					if (valueFortune != 0) {
						ConfigFile.changeIntValue(pathFortune, 0, true);
						GuiHandler.update(inventory, slot, Reference.typeFortuneAmount, name);
						player.updateInventory();
					}
					break;
				}
			case(24):
				if (GuiHandler.checkPossible(valueFortune, "-", 1) == true) {
					ConfigFile.changeIntValue(pathFortune, valueFortune - 1, true);
					GuiHandler.update(inventory, slot, Reference.typeFortuneAmount, name);
					player.updateInventory();
					break;
				} else {
					if (valueFortune != 0) {
						ConfigFile.changeIntValue(pathFortune, 0, true);
						GuiHandler.update(inventory, slot, Reference.typeFortuneAmount, name);
						player.updateInventory();
					}
					break;
				}
			case(28):
				ConfigFile.changeIntValue(pathNormalXP, valueNormalXP + 10, true);
				GuiHandler.update(inventory, slot, Reference.typeNormalXP, name);
				player.updateInventory();
				break;
			case(29):
				ConfigFile.changeIntValue(pathNormalXP, valueNormalXP + 1, true);
				GuiHandler.update(inventory, slot, Reference.typeNormalXP, name);
				player.updateInventory();
				break;
			case(46):
				if (GuiHandler.checkPossible(valueNormalXP, "-", 10) == true) {
					ConfigFile.changeIntValue(pathNormalXP, valueNormalXP - 10, true);
					GuiHandler.update(inventory, slot, Reference.typeNormalXP, name);
					player.updateInventory();
					break;
				} else {
					if (valueNormalXP != 0) {
						ConfigFile.changeIntValue(pathNormalXP, 0, true);
						GuiHandler.update(inventory, slot, Reference.typeNormalXP, name);
						player.updateInventory();
					}
					break;
				}
			case(47):
				if (GuiHandler.checkPossible(valueNormalXP, "-", 1) == true) {
					ConfigFile.changeIntValue(pathNormalXP, valueNormalXP - 1, true);
					GuiHandler.update(inventory, slot, Reference.typeNormalXP, name);
					player.updateInventory();
					break;
				} else {
					if (valueNormalXP != 0) {
						ConfigFile.changeIntValue(pathNormalXP, 0, true);
						GuiHandler.update(inventory, slot, Reference.typeNormalXP, name);
						player.updateInventory();
					}
					break;
				}
			case(34):
				ConfigFile.changeIntValue(pathFortuneXP, valueFortuneXP + 10, true);
				GuiHandler.update(inventory, slot, Reference.typeFortuneXP, name);
				player.updateInventory();
				break;
			case(33):
				ConfigFile.changeIntValue(pathFortuneXP, valueFortuneXP + 1, true);
				GuiHandler.update(inventory, slot, Reference.typeFortuneXP, name);
				player.updateInventory();
				break;
			case(52):
				if (GuiHandler.checkPossible(valueFortuneXP, "-", 10) == true) {
					ConfigFile.changeIntValue(pathFortuneXP, valueFortuneXP - 10, true);
					GuiHandler.update(inventory, slot, Reference.typeFortuneXP, name);
					player.updateInventory();
					break;
				} else {
					if (valueFortuneXP != 0) {
						ConfigFile.changeIntValue(pathFortuneXP, 0, true);
						GuiHandler.update(inventory, slot, Reference.typeFortuneXP, name);
						player.updateInventory();
					}
					break;
				}
			case(51):
				if (GuiHandler.checkPossible(valueFortuneXP, "-", 1) == true) {
					ConfigFile.changeIntValue(pathFortuneXP, valueFortuneXP - 1, true);
					GuiHandler.update(inventory, slot, Reference.typeFortuneXP, name);
					player.updateInventory();
					break;
				} else {
					if (valueFortuneXP != 0) {
						ConfigFile.changeIntValue(pathFortuneXP, 0, true);
						GuiHandler.update(inventory, slot, Reference.typeFortuneXP, name);
						player.updateInventory();
					}
					break;
				}
			}
		} else if (material == Material.COAL_ORE && displayName.contains("§8Coal")) {
			String pathCoal = "Coal.Enabled";
			
			if (ConfigFile.getValue(pathCoal) == false) {
				ConfigFile.changeValue(pathCoal, true, true);
				GuiLayouts.Coal.setItem(4, GuiHandler.addStatusInfo(Material.COAL_ORE, "§8Coal", 21, Reference.oreList.get(0)));
				player.updateInventory();
			} else if (ConfigFile.getValue(pathCoal) == true){
				ConfigFile.changeValue(pathCoal, false, true);
				GuiLayouts.Coal.setItem(4, GuiHandler.addStatusInfo(Material.COAL_ORE, "§8Coal", 21, Reference.oreList.get(0)));
				player.updateInventory();
			}
		} else if (material == Material.IRON_ORE && displayName.contains("§7Iron")) {
			String pathIron = "Iron.Enabled";
			
			if (ConfigFile.getValue(pathIron) == false) {
				ConfigFile.changeValue(pathIron, true, true);
				GuiLayouts.Iron.setItem(4, GuiHandler.addStatusInfo(Material.IRON_ORE, "§7Iron", 21, Reference.oreList.get(1)));
				player.updateInventory();
			} else if (ConfigFile.getValue(pathIron) == true) {
				ConfigFile.changeValue(pathIron, false, true);
				GuiLayouts.Iron.setItem(4, GuiHandler.addStatusInfo(Material.IRON_ORE, "§7Iron", 21, Reference.oreList.get(1)));
				player.updateInventory();
			}
		} else if (material == Material.LAPIS_ORE && displayName.contains("§3Lapis")) {
			String pathLapis = "Lapis.Enabled";
			
			if (ConfigFile.getValue(pathLapis) == false) {
				ConfigFile.changeValue(pathLapis, true, true);
				GuiLayouts.Lapis.setItem(4, GuiHandler.addStatusInfo(Material.LAPIS_ORE, "§3Lapis", 21, Reference.oreList.get(2)));
				player.updateInventory();
			} else if (ConfigFile.getValue(pathLapis) == true){
				ConfigFile.changeValue(pathLapis, false, true);
				GuiLayouts.Lapis.setItem(4, GuiHandler.addStatusInfo(Material.LAPIS_ORE, "§3Lapis", 21, Reference.oreList.get(2)));
				player.updateInventory();
			}
		}  else if (material == Material.GOLD_ORE && displayName.contains("§6Gold")) {
			String pathGold = "Gold.Enabled";
			
			if (ConfigFile.getValue(pathGold) == false) {
				ConfigFile.changeValue(pathGold, true, true);
				GuiLayouts.Gold.setItem(4, GuiHandler.addStatusInfo(Material.GOLD_ORE, "§6Gold", 21, Reference.oreList.get(4)));
				player.updateInventory();
			} else if (ConfigFile.getValue(pathGold) == true) {
				ConfigFile.changeValue(pathGold, false, true);
				GuiLayouts.Gold.setItem(4, GuiHandler.addStatusInfo(Material.GOLD_ORE, "§6Gold", 21, Reference.oreList.get(4)));
				player.updateInventory();
			}
		} else if (material == Material.REDSTONE_ORE && displayName.contains("§cRedstone")) {
			String pathRedstone = "Redstone.Enabled";
			
			if (ConfigFile.getValue(pathRedstone) == false) {
				ConfigFile.changeValue(pathRedstone, true, true);
				GuiLayouts.Redstone.setItem(4, GuiHandler.addStatusInfo(Material.REDSTONE_ORE, "§cRedstone", 21, Reference.oreList.get(3)));
				player.updateInventory();
			} else if (ConfigFile.getValue(pathRedstone) == true){
				ConfigFile.changeValue(pathRedstone, false, true);
				GuiLayouts.Redstone.setItem(4, GuiHandler.addStatusInfo(Material.REDSTONE_ORE, "§cRedstone", 21, Reference.oreList.get(3)));
				player.updateInventory();
			}
		} else if (material == Material.DIAMOND_ORE && displayName.contains("§bDiamond")) {
			String pathDiamond = "Diamond.Enabled";
			
			if (ConfigFile.getValue(pathDiamond) == false) {
				ConfigFile.changeValue(pathDiamond, true, true);
				GuiLayouts.Diamond.setItem(4, GuiHandler.addStatusInfo(Material.DIAMOND_ORE, "§bDiamond", 21, Reference.oreList.get(5)));
				player.updateInventory();
			} else if (ConfigFile.getValue(pathDiamond) == true){
				ConfigFile.changeValue(pathDiamond, false, true);
				GuiLayouts.Diamond.setItem(4, GuiHandler.addStatusInfo(Material.DIAMOND_ORE, "§bDiamond", 21, Reference.oreList.get(5)));
				player.updateInventory();
			}
		} else if (material == Material.EMERALD_ORE && displayName.contains("§aEmerald")) {
			String pathEmerald = "Emerald.Enabled";
			
			if (ConfigFile.getValue(pathEmerald) == false) {
				ConfigFile.changeValue(pathEmerald, true, true);
				GuiLayouts.Emerald.setItem(4, GuiHandler.addStatusInfo(Material.EMERALD_ORE, "§aEmerald", 21, Reference.oreList.get(6)));
				player.updateInventory();
			} else if (ConfigFile.getValue(pathEmerald) == true) {
				ConfigFile.changeValue(pathEmerald, false, true);
				GuiLayouts.Emerald.setItem(4, GuiHandler.addStatusInfo(Material.EMERALD_ORE, "§aEmerald", 21, Reference.oreList.get(6)));
				player.updateInventory();
			}
		} else if (material == Material.NETHER_QUARTZ_ORE && displayName.contains("§fQuartz")) {
			String pathQuartz = "Quartz.Enabled";
			
			if (ConfigFile.getValue(pathQuartz) == false) {
				ConfigFile.changeValue(pathQuartz, true, true);
				GuiLayouts.Quartz.setItem(4, GuiHandler.addStatusInfo(Material.NETHER_QUARTZ_ORE, "§fQuartz", 21, Reference.oreList.get(7)));
				player.updateInventory();
			} else if (ConfigFile.getValue(pathQuartz) == true){
				ConfigFile.changeValue(pathQuartz, false, true);
				GuiLayouts.Quartz.setItem(4, GuiHandler.addStatusInfo(Material.NETHER_QUARTZ_ORE, "§fQuartz", 21, Reference.oreList.get(7)));
				player.updateInventory();
			}
		} else if (material == Material.PLAYER_HEAD && displayName.contains("§cMain")) {
			InvHandler.openInventory(player, GuiLayouts.Main, true);
		}
	}
	
	public static void resultQuit(ItemStack item, Player player) {
		if (item.getType().name().contains("STAINED_GLASS_PANE")) {
			String color = item.getType().name();
			
			//Continue editing
			if (color.equals("ORANGE_STAINED_GLASS_PANE")) {
				InvHandler.openInventory(player, GuiLayouts.Main, true);
			}
			//Save & Quit
			if (color.equals("LIME_STAINED_GLASS_PANE")) {
				Reference.Enable();
				if (Reference.Errors != 0) {
					player.sendMessage(Reference.prefix + " §c" + Reference.Errors + " §9Values were missing and got added with their default value.");
					Reference.Errors = 0;
				}
				InvHandler.closeInventory(player);
				InvHandler.usingInventory(player, false);
			}
			//Don't save & quit
			if (color.equals("RED_STAINED_GLASS_PANE")) {
				Reference.returnOriginal();
				InvHandler.closeInventory(player);
				InvHandler.usingInventory(player, false);
			}	
		}
	}
	
	public static boolean checkPossible(int currentAmount, String type,int amount) {
		int check;
		
		if (type == "-") {
			check = currentAmount - amount;
			if (check < 0) {
				return false;
			}
		}
		return true;	
	}
}
