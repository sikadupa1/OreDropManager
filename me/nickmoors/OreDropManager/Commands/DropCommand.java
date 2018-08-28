package me.nickmoors.OreDropManager.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

import me.nickmoors.OreDropManager.Reference;
import me.nickmoors.OreDropManager.Config.ConfigFile;
import me.nickmoors.OreDropManager.GUI.GuiLayouts;
import me.nickmoors.OreDropManager.Handlers.InvHandler;

public class DropCommand implements CommandExecutor {
	
	Permission reload = new Permission("drop.reload", PermissionDefault.FALSE);
	Permission config = new Permission("drop.config", PermissionDefault.FALSE);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player){
			Player player = (Player) sender;
		
			if (label.equalsIgnoreCase("drop")) {
				if (args.length == 0) {
					player.sendMessage(Reference.prefix + "§9Available commands:");
					player.sendMessage("§9- §a/drop reload §9Reloads the config.");
					player.sendMessage("§9- §a/drop config §9Edit the config.");
					player.sendMessage("§9Plugin made by: MrGraycat");
					
				} else if (args[0].equalsIgnoreCase("reload")){
					if (player.hasPermission(reload)) {
						if (Reference.inUse != true) {
							ConfigFile.reload();
							player.sendMessage(Reference.prefix + " §9Config reloaded!");
						} else {
							player.sendMessage(Reference.prefix + " §cReload Canceled!:");
							//Don't forget replacing!
							player.sendMessage(Reference.prefix + " §9Ingame config is being used by: " +  Reference.editingPlayer.getName());
						}											
					} else {
						player.sendMessage(Reference.prefix + "§cYou don't have permission to do that!");
					}	
				} else if (args[0].equalsIgnoreCase("config")){
					if (player.hasPermission(config)) {
						if (Reference.inUse != true || player == Reference.editingPlayer) {
							InvHandler.usingInventory(player, true);
							InvHandler.openInventory(player, GuiLayouts.Main, true);
						} else {
							player.sendMessage(Reference.prefix + " §9Ingame Config is being used by: " + Reference.editingPlayer.getName());
						}
					} else {
						player.sendMessage(Reference.prefix + " §cYou don't have permission to do that!");
					}
				} else {
					player.sendMessage(Reference.prefix + " §9Invalid subcommand do §a/drop §9for a list of commands.");
				}
			} 
		}
		return true;
	}
}
