package me.nickmoors.OreDropManager.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionDefault;

import me.nickmoors.OreDropManager.OreDropManager;
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
				if (OreDropManager.version.equals("v1_12_R1")) {
					if (args.length == 0) {
						player.sendMessage(Reference.prefix + " *-§9Available commands:");
						player.sendMessage("§9- §a/drop reload §9Reloads the config.");
						player.sendMessage("§9- §a/drop config §9Edit the config.");
						player.sendMessage("§9- §a/drop set §cORE §9Set drop for ore.");
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
							player.sendMessage(Reference.prefix + " §cYou don't have permission to do that!");
						}	
					} else if (args[0].equalsIgnoreCase("set")){
						if (player.hasPermission(config)) {
							if (args.length >= 2) {
								switch(args[1].toLowerCase()) {
									case("coal"):
										ItemStack coal = player.getInventory().getItemInMainHand();
									
										if (coal != null && coal.getType() != Material.AIR) {
											ConfigFile.config.set("Coal.Item", coal);
											ConfigFile.update();
											player.sendMessage(Reference.prefix + " §aItem has been changed!");
										} else {
											player.sendMessage(Reference.prefix + " §cInvalid item!");
										}
										break;
									case("iron"):
										ItemStack iron = player.getInventory().getItemInMainHand();

										if (iron != null && iron.getType() != Material.AIR) {
											ConfigFile.config.set("Iron.Item", iron);
											ConfigFile.update();
											player.sendMessage(Reference.prefix + " §aItem has been changed!");
										} else {
											player.sendMessage(Reference.prefix + " §cInvalid item!");
										}
										break;
									case("gold"):
										ItemStack gold = player.getInventory().getItemInMainHand();
									
										if (gold != null && gold.getType() != Material.AIR) {
											ConfigFile.config.set("Gold.Item", gold);
											ConfigFile.update();
											player.sendMessage(Reference.prefix + " §aItem has been changed!");
										} else {
											player.sendMessage(Reference.prefix + " §cInvalid item!");
										}
										break;
									case("redstone"):
										ItemStack redstone = player.getInventory().getItemInMainHand();
									
										if (redstone != null && redstone.getType() != Material.AIR) {
											ConfigFile.config.set("Redstone.Item", redstone);
											ConfigFile.update();
											player.sendMessage(Reference.prefix + " §aItem has been changed!");
										} else {
											player.sendMessage(Reference.prefix + " §cInvalid item!");
										}
										break;
									case("diamond"):
										ItemStack diamond = player.getInventory().getItemInMainHand();
									
										if (diamond != null && diamond.getType() != Material.AIR) {
											ConfigFile.config.set("Diamond.Item", diamond);
											ConfigFile.update();
											player.sendMessage(Reference.prefix + " §aItem has been changed!");
										} else {
											player.sendMessage(Reference.prefix + " §cInvalid item!");
										}
										break;
									case("emerald"):
										ItemStack emerald = player.getInventory().getItemInMainHand();
									
										if (emerald != null && emerald.getType() != Material.AIR) {
											ConfigFile.config.set("Emerald.Item", emerald);
											ConfigFile.update();
											player.sendMessage(Reference.prefix + " §aItem has been changed!");
										} else {
											player.sendMessage(Reference.prefix + " §cInvalid item!");
										}
										break;
									case("lapis"):
										ItemStack lapis = player.getInventory().getItemInMainHand();
									
										if (lapis != null && lapis.getType() != Material.AIR) {
											ConfigFile.config.set("Lapis.Item", lapis);
											ConfigFile.update();
											player.sendMessage(Reference.prefix + " §aItem has been changed!");
										} else {
											player.sendMessage(Reference.prefix + " §cInvalid item!");
										}
										break;
									case("quartz"):
										ItemStack quartz = player.getInventory().getItemInMainHand();
									
										if (quartz != null && quartz.getType() != Material.AIR) {
											ConfigFile.config.set("Coal.Item", quartz);
											ConfigFile.update();
											player.sendMessage(Reference.prefix + " §aItem has been changed!");
										} else {
											player.sendMessage(Reference.prefix + " §cInvalid item!");
										}
										break;
									default:
										player.sendMessage(Reference.prefix + "§cUnvalid ore given!");
										break;
								}	
							} else {
								player.sendMessage(Reference.prefix + " §cIncorrect usage! §9/drop set §cORE");
								player.sendMessage(Reference.prefix + " §aAvailable ores: " );
								player.sendMessage("§9- §8Coal§f, §7Iron§f, §9Lapis§f, §6Gold§f, §cRedstone§f, §bDiamond§f, §aEmerald§f, Quartz.");
							}
						} else {
							player.sendMessage(Reference.prefix + " §cYou don't have permission to do that!");
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
				} else {
					player.sendMessage(Reference.prefix + " §cThis plugin version (§3v1_12_R1§c) is not compatible with your server version! (§3" + OreDropManager.version + "§c)");
				}
			} 
		}
		return true;
	}
}
