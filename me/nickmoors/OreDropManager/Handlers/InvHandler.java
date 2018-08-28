package me.nickmoors.OreDropManager.Handlers;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import me.nickmoors.OreDropManager.Reference;

public class InvHandler {
		
	public static void openInventory(Player player, Inventory inv, boolean update) {
		Reference.activate = false;
		player.openInventory(inv);
		if (update == true) {
			player.updateInventory();
		}
		Reference.activate = true;
	}
	
	public static void closeInventory(Player player) {
		Reference.activate = false;
		player.closeInventory();
		Reference.activate = true;
	}
	
	public static void usingInventory(Player player, boolean state) {
		if (state == true) {
			Reference.inUse = true;
			Reference.editingPlayer = player;
		} else if (state == false) {
			Reference.inUse = false;
			Reference.editingPlayer = null;
		}
	}
}
