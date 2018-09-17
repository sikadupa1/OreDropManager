package me.nickmoors.OreDropManager.Events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

import me.nickmoors.OreDropManager.OreDropManager;
import me.nickmoors.OreDropManager.Reference;
import me.nickmoors.OreDropManager.GUI.GuiLayouts;
import me.nickmoors.OreDropManager.Handlers.InvHandler;

public class InvCloseEvent implements Listener {
	
	@EventHandler
	public void InvClose(InventoryCloseEvent event) {
		if (event.getInventory().getName().contains(Reference.prefix)) {
			if (Reference.activate == true) {			
				Bukkit.getScheduler().scheduleSyncDelayedTask(OreDropManager.instance, new Runnable() {
					
					@Override
					public void run() {
						String invname = event.getInventory().getName();
						Player player = (Player)event.getPlayer();
						
						if (invname.equals(GuiLayouts.Main.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Quit, true);
						}
						
						if (invname.equals(GuiLayouts.Quit.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Quit, true);
						}
						
						if (invname.equals(GuiLayouts.Coal.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						}
						
						if (invname.equals(GuiLayouts.Iron.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						}
						
						if (invname.equals(GuiLayouts.Lapis.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						}
						
						if (invname.equals(GuiLayouts.Gold.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						}
						
						if (invname.equals(GuiLayouts.Redstone.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						}
						
						if (invname.equals(GuiLayouts.Diamond.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						}
						
						if (invname.equals(GuiLayouts.Emerald.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						}
						
						if (invname.equals(GuiLayouts.Quartz.getName())) {
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						}			
					}
				}, 2);	
			}	
		}
	}

}
