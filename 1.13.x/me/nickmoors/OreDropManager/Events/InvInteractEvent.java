package me.nickmoors.OreDropManager.Events;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.nickmoors.OreDropManager.Reference;
import me.nickmoors.OreDropManager.Config.ConfigFile;
import me.nickmoors.OreDropManager.GUI.GuiLayouts;
import me.nickmoors.OreDropManager.Handlers.GuiHandler;
import me.nickmoors.OreDropManager.Handlers.InvHandler;

public class InvInteractEvent implements Listener {
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		try {
			Inventory inventory = event.getInventory();
			if (getTitle().contains(Reference.prefix)) {
				Player player = (Player)event.getWhoClicked();
				ItemStack clicked = event.getCurrentItem();
				ItemMeta clickedMeta = clicked.getItemMeta();
				Material type = clicked.getType();
				if (inventory.getName().equals(GuiLayouts.Main.getName())) {

					event.setCancelled(true);
					
					if (clicked.getType() == null) {
						
					} else if (type == Material.COAL_ORE && clickedMeta.getDisplayName().contains("§8Coal")) {
						InvHandler.openInventory(player, GuiLayouts.Coal, false);
					} else if (type == Material.IRON_ORE && clickedMeta.getDisplayName().contains("§7Iron")){
						InvHandler.openInventory(player, GuiLayouts.Iron, false);
					} else if (type == Material.LAPIS_ORE && clickedMeta.getDisplayName().contains("§3Lapis")) {
						InvHandler.openInventory(player, GuiLayouts.Lapis, false);
					} else if (type == Material.GOLD_ORE && clickedMeta.getDisplayName().contains("§6Gold")) {
						InvHandler.openInventory(player, GuiLayouts.Gold, false);
					} else if (type == Material.REDSTONE_ORE && clickedMeta.getDisplayName().contains("§cRedstone")) {
						InvHandler.openInventory(player, GuiLayouts.Redstone, false);
					} else if (type == Material.DIAMOND_ORE && clickedMeta.getDisplayName().contains("§bDiamond")) {
						InvHandler.openInventory(player, GuiLayouts.Diamond, false);
					} else if (type == Material.EMERALD_ORE && clickedMeta.getDisplayName().contains("§aEmerald")) {
						InvHandler.openInventory(player, GuiLayouts.Emerald, false);
					} else if (type == Material.NETHER_QUARTZ_ORE && clickedMeta.getDisplayName().contains("§fQuartz")) {
						InvHandler.openInventory(player, GuiLayouts.Quartz, false);
					} else if (type == Material.DIAMOND_PICKAXE) {
						if (clicked.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && clickedMeta.getDisplayName().contains("§3Fortune")) {
							if (ConfigFile.getValue(Reference.pathFortuneControl) == false) {
								ConfigFile.changeValue(Reference.pathFortuneControl, true, true);
								GuiHandler.update(inventory, event.getSlot(), Reference.typeFortuneControl, "");
								player.updateInventory();
							} else if (ConfigFile.getValue(Reference.pathFortuneControl)== true){
								ConfigFile.changeValue(Reference.pathFortuneControl, false, true);
								GuiHandler.update(inventory, event.getSlot(), Reference.typeFortuneControl, "");
								player.updateInventory();
							}
						} else if (clickedMeta.getDisplayName().contains("§3RandomNormal")) {
							if (ConfigFile.getValue(Reference.pathRandomNormalAmount) == false) {
								ConfigFile.changeValue(Reference.pathRandomNormalAmount, true, true);
								GuiHandler.update(inventory, event.getSlot(), Reference.typeRandomNormalAmount, "");
								player.updateInventory();
							} else if (ConfigFile.getValue(Reference.pathRandomNormalAmount) == true){
								ConfigFile.changeValue(Reference.pathRandomNormalAmount, false, true);
								GuiHandler.update(inventory, event.getSlot(), Reference.typeRandomNormalAmount, "");
								player.updateInventory();
							}
						}
					}  else if (type == Material.PAPER && clickedMeta.getDisplayName().contains("§3Update")) {
						if (ConfigFile.getValue(Reference.pathUpdate) == false) {
							ConfigFile.changeValue(Reference.pathUpdate, true, true);
							GuiHandler.update(inventory, event.getSlot(), Reference.typeUpdate, "");
						} else if (ConfigFile.getValue(Reference.pathUpdate) == true) {
							ConfigFile.changeValue(Reference.pathUpdate, false, true);
							GuiHandler.update(inventory, event.getSlot(), Reference.typeUpdate, "");
						}
					} else if (type == Material.CHEST && clickedMeta.getDisplayName().contains("§3PutDrop")) {
						if (ConfigFile.getValue(Reference.pathPutDropInInv) == false) {
							ConfigFile.changeValue(Reference.pathPutDropInInv, true, true);
							GuiHandler.update(inventory, event.getSlot(), Reference.typePutDropInInv, "");
							player.updateInventory();
						} else if (ConfigFile.getValue(Reference.pathPutDropInInv) == true){
							ConfigFile.changeValue(Reference.pathPutDropInInv, false, true);
							GuiHandler.update(inventory, event.getSlot(), Reference.typePutDropInInv, "");
							player.updateInventory();
						}
					} else if (type == Material.EXPERIENCE_BOTTLE) {
						if (clicked.containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS) && clickedMeta.getDisplayName().contains("§3RandomFortune")) {
							if (ConfigFile.getValue(Reference.pathRandomFortuneXP) == true) {
								ConfigFile.changeValue(Reference.pathRandomFortuneXP, false, true);
								GuiHandler.update(inventory, event.getSlot(), Reference.typeRandomFortuneXP, "");
								player.updateInventory();
							} else if (ConfigFile.getValue(Reference.pathRandomFortuneXP) == false) {
								ConfigFile.changeValue(Reference.pathRandomFortuneXP, true, true);
								GuiHandler.update(inventory, event.getSlot(), Reference.typeRandomFortuneXP, "");
								player.updateInventory();
							}
						} else if (clickedMeta.getDisplayName().contains("§3RandomNormalXP")) {
							if (ConfigFile.getValue(Reference.pathRandomNormalXP) == true) {
								ConfigFile.changeValue(Reference.pathRandomNormalXP, false, true);
								GuiHandler.update(inventory, event.getSlot(), Reference.typeRandomNormalXP, "");
								player.updateInventory();
							} else if (ConfigFile.getValue(Reference.pathRandomNormalXP) == false) {
								ConfigFile.changeValue(Reference.pathRandomNormalXP, true, true);
								GuiHandler.update(inventory, event.getSlot(), Reference.typeRandomNormalXP, "");
							}
						}
						
					} else if (type == Material.ENCHANTING_TABLE && clickedMeta.getDisplayName().contains("§3CustomXP")) {
						if (ConfigFile.getValue(Reference.pathXP) == true) {
							ConfigFile.changeValue(Reference.pathXP, false, true);
							GuiHandler.update(inventory, event.getSlot(), Reference.typeXP, "");
							player.updateInventory();
						} else if (ConfigFile.getValue(Reference.pathXP) == false) {
							ConfigFile.changeValue(Reference.pathXP, true, true);
							GuiHandler.update(inventory, event.getSlot(), Reference.typeXP, "");
						}
					} else if (type == Material.PLAYER_HEAD && clickedMeta.getDisplayName().contains("§cQuit")) {
						InvHandler.openInventory(player, GuiLayouts.Quit, true);
					}
				} 
				
				if(getTitle().equals(GuiLayouts.Coal.getName())) {
					event.setCancelled(true);
					GuiHandler.oreInvUpdate(type, clickedMeta, player, inventory, event.getSlot(), Reference.oreList.get(0));
					
				} 
				
				if(getTitle().equals(GuiLayouts.Iron.getName())){
					event.setCancelled(true);
					
					GuiHandler.oreInvUpdate(type, clickedMeta, player, inventory, event.getSlot(), Reference.oreList.get(1));
				}
				
				if(getTitle().equals(GuiLayouts.Lapis.getName())) {
					event.setCancelled(true);
					
					GuiHandler.oreInvUpdate(type, clickedMeta, player, inventory, event.getSlot(), Reference.oreList.get(2));
				}
				
				if(getTitle().equals(GuiLayouts.Redstone.getName())) {
					event.setCancelled(true);
					
					GuiHandler.oreInvUpdate(type, clickedMeta, player, inventory, event.getSlot(), Reference.oreList.get(3));
				}
				
				if (getTitle().equals(GuiLayouts.Gold.getName())) {
					event.setCancelled(true);
					
					GuiHandler.oreInvUpdate(type, clickedMeta, player, inventory, event.getSlot(), Reference.oreList.get(4));
				}			
				
				if(getTitle().equals(GuiLayouts.Diamond.getName())) {
					event.setCancelled(true);
					
					GuiHandler.oreInvUpdate(type, clickedMeta, player, inventory, event.getSlot(), Reference.oreList.get(5));
				}
				
				if(getTitle().equals(GuiLayouts.Emerald.getName())) {
					event.setCancelled(true);
					
					GuiHandler.oreInvUpdate(type, clickedMeta, player, inventory, event.getSlot(), Reference.oreList.get(6));
				}
				
				if(getTitle().equals(GuiLayouts.Quartz.getName())) {
					event.setCancelled(true);
					
					GuiHandler.oreInvUpdate(type, clickedMeta, player, inventory, event.getSlot(), Reference.oreList.get(7));
				}
				
				if(getTitle().equals(GuiLayouts.Quit.getName())) {
					event.setCancelled(true);
					
					GuiHandler.resultQuit(event.getCurrentItem(), player);
				}
			}		
		} catch (Exception e) {
			
		}		
	}
}
