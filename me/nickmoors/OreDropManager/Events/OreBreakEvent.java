package me.nickmoors.OreDropManager.Events;

import java.util.HashMap;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import me.nickmoors.OreDropManager.Reference;
import me.nickmoors.OreDropManager.Handlers.DropHandler;


public class OreBreakEvent implements Listener {
	
	@EventHandler (priority = EventPriority.HIGHEST)
	public void onPlayerBreakBlock(BlockBreakEvent event) {
		
		Block block = event.getBlock();
		Material material = block.getType();
		HashMap<Integer, ItemStack> rest;
		
		if (event.getPlayer().getGameMode() != GameMode.CREATIVE) {
			if (material == Material.COAL_ORE) {
				if (Reference.CoalStatus == true) {
					event.setDropItems(false);
					
					switch(DropHandler.getPickaxeType(event.getPlayer())) {
						case("FortunePick"):
							if (Reference.PutDropInInv == true) {
								if (Reference.FortuneControl == true) {
									ItemStack drop = DropHandler.getFortuneDrop(Reference.oreList.get(0), DropHandler.getFortuneLevel(event.getPlayer()));
									rest = event.getPlayer().getInventory().addItem(drop);
									if (!rest.isEmpty()) {										
										event.setCancelled(true);
										int amount = drop.getAmount() - rest.get(0).getAmount();
										event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.COAL, amount)});
										event.getPlayer().updateInventory();
										event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");							
									} else {
										if (Reference.XPStatus == true) {
											event.setExpToDrop(0);
											event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(0), Reference.typeFortune));
										}
									}
									break;
								} else {
									ItemStack item = new ItemStack(Material.COAL);
									
									int amount = DropHandler.getDropCount(event.getPlayer().getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS), Reference.oreList.get(0));
								    
									item.setAmount(amount);
									rest = event.getPlayer().getInventory().addItem(item);
									if (!rest.isEmpty()) {
										event.setCancelled(true);
										amount = item.getAmount() - rest.get(0).getAmount();
										event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.COAL, amount)});
										event.getPlayer().updateInventory();
										event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
									} else {
										if (Reference.XPStatus == true) {
											event.setExpToDrop(0);
											event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(0), Reference.typeFortune));
										}
									}
									break;
								}
							} else {
								if (Reference.FortuneControl == true) {
									block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getFortuneDrop(Reference.oreList.get(0), DropHandler.getFortuneLevel(event.getPlayer())));
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(0), Reference.typeFortune));
									}
								} else {
									event.setDropItems(true);
								}
								break;
							}	
						case("SilkTouchPick"):
							if (Reference.PutDropInInv == true) {
								ItemStack item = new ItemStack(Material.COAL_ORE);
								item.setAmount(1);
								rest = event.getPlayer().getInventory().addItem(item);
								if (!rest.isEmpty()) {
									event.setCancelled(true);
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
								}
							} else {
								event.setDropItems(true);
							}
							break;
						case("NormalPick"):
							if (Reference.PutDropInInv == true) {
								ItemStack drop = DropHandler.getNormalDrop(Reference.oreList.get(0));
								rest = event.getPlayer().getInventory().addItem(drop);
								if (!rest.isEmpty()) {
									event.setCancelled(true);
									int amount = drop.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.COAL, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(0), Reference.typeNormal));
									}
								}
								break;
							} else {
								block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getNormalDrop(Reference.oreList.get(0)));
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(0), Reference.typeNormal));
								}
								break;
							}
						case("NotAPick"):
							break;
					}
				}
			}
			
			if (material == Material.IRON_ORE) {
				if (Reference.IronStatus == true) {
					event.setDropItems(false);
					
					switch(DropHandler.getPickaxeType(event.getPlayer())) {
					case("FortunePick"):
						if (Reference.PutDropInInv == true) {
							if (Reference.FortuneControl == true) {
								ItemStack drop = DropHandler.getFortuneDrop(Reference.oreList.get(1), DropHandler.getFortuneLevel(event.getPlayer()));
								rest = event.getPlayer().getInventory().addItem(drop);
								if (!rest.isEmpty()) {										
									event.setCancelled(true);
									int amount = drop.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.IRON_ORE, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");							
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(1), Reference.typeFortune));
									}
								}
								break;
							} else {
								ItemStack item = new ItemStack(Material.IRON_ORE);
								int amount = 1;
							    item.setAmount(amount);
								rest = event.getPlayer().getInventory().addItem(item);
								if (!rest.isEmpty()) {
									event.setCancelled(true);
									amount = item.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.IRON_ORE, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(1), Reference.typeFortune));
									}
								}
								break;
							}
						} else {
							if (Reference.FortuneControl == true) {
								block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getFortuneDrop(Reference.oreList.get(1), DropHandler.getFortuneLevel(event.getPlayer())));
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(1), Reference.typeFortune));
								}
							} else {
								event.setDropItems(true);
							}
							break;
						}
					case("SilkTouchPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack item = new ItemStack(Material.IRON_ORE);
							item.setAmount(1);
							rest = event.getPlayer().getInventory().addItem(item);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							}
						} else {
							event.setDropItems(true);
						}
						break;
					case("NormalPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack drop = DropHandler.getNormalDrop(Reference.oreList.get(1));
							rest = event.getPlayer().getInventory().addItem(drop);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								int amount = drop.getAmount() - rest.get(0).getAmount();
								event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.IRON_ORE, amount)});
								event.getPlayer().updateInventory();
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							} else {
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(1), Reference.typeNormal));
								}
							}
							break;
						} else {
							block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getNormalDrop("Iron"));
							if (Reference.XPStatus == true) {
								event.setExpToDrop(0);
								event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(1), Reference.typeNormal));
							}
							break;
						}
					case("NotAPick"):
						break;
					}
				}
			}
			
			if (material == Material.GOLD_ORE) {
				if (Reference.GoldStatus == true) {
					event.setDropItems(false);
					
					switch(DropHandler.getPickaxeType(event.getPlayer())) {
					case("FortunePick"):
						if (Reference.PutDropInInv == true) {
							if (Reference.FortuneControl == true) {
								ItemStack drop = DropHandler.getFortuneDrop(Reference.oreList.get(4), DropHandler.getFortuneLevel(event.getPlayer()));
								rest = event.getPlayer().getInventory().addItem(drop);
								if (!rest.isEmpty()) {										
									event.setCancelled(true);
									int amount = drop.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.GOLD_ORE, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");							
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(4) , Reference.typeFortune));
									}
								}
								break;
							} else {
								ItemStack item = new ItemStack(Material.GOLD_ORE);
								int amount = 1;
							    item.setAmount(amount);
								rest = event.getPlayer().getInventory().addItem(item);
								if (!rest.isEmpty()) {
									event.setCancelled(true);
									amount = item.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.GOLD_ORE, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(4) , Reference.typeFortune));
									}
								}
								break;
							}
						} else {
							if (Reference.FortuneControl == true) {
								block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getFortuneDrop(Reference.oreList.get(4), DropHandler.getFortuneLevel(event.getPlayer())));
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(4) , Reference.typeFortune));
								}
							} else {
								event.setDropItems(true);
							}
							break;
						}
					case("SilkTouchPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack item = new ItemStack(Material.GOLD_ORE);
							item.setAmount(1);
							rest = event.getPlayer().getInventory().addItem(item);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							}
						} else {
							event.setDropItems(true);
						}
						break;
					case("NormalPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack drop = DropHandler.getNormalDrop(Reference.oreList.get(4));
							rest = event.getPlayer().getInventory().addItem(drop);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								int amount = drop.getAmount() - rest.get(0).getAmount();
								event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.GOLD_ORE, amount)});
								event.getPlayer().updateInventory();
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							} else {
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(4) , Reference.typeNormal));
								}
							}
							break;
						} else {
							block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getNormalDrop("Gold"));
							if (Reference.XPStatus == true) {
								event.setExpToDrop(0);
								event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(4) , Reference.typeNormal));
							}
							break;
						}
					case("NotAPick"):
						break;
					}
				}
			}
			
			//Glowing redstone ore removed
			if (material == Material.REDSTONE_ORE) {
				if(Reference.RedstoneStatus == true) {
					event.setDropItems(false);	
					
					switch(DropHandler.getPickaxeType(event.getPlayer())) {
					case("FortunePick"):
						if (Reference.PutDropInInv == true) {
							if (Reference.FortuneControl == true) {
								ItemStack drop = DropHandler.getFortuneDrop(Reference.oreList.get(3), DropHandler.getFortuneLevel(event.getPlayer()));
								rest = event.getPlayer().getInventory().addItem(drop);
								if (!rest.isEmpty()) {										
									event.setCancelled(true);
									int amount = drop.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.REDSTONE, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");							
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(3) , Reference.typeFortune));
									}
								}
								break;
							} else {
								ItemStack item = new ItemStack(Material.REDSTONE);
								int amount = DropHandler.getDropCount(event.getPlayer().getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS), Reference.oreList.get(3));
								//int amount = random.nextInt(20) + 1;
							    item.setAmount(amount);
								rest = event.getPlayer().getInventory().addItem(item);
								if (!rest.isEmpty()) {
									event.setCancelled(true);
									amount = item.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.REDSTONE, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(3) , Reference.typeFortune));
									}
								}
								break;
							}
						} else {
							if (Reference.FortuneControl == true) {
								block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getFortuneDrop(Reference.oreList.get(3), DropHandler.getFortuneLevel(event.getPlayer())));
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(3) , Reference.typeFortune));
								}
							} else {
								event.setDropItems(true);
							}
							break;
						}	
					case("SilkTouchPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack item = new ItemStack(Material.REDSTONE_ORE);
							item.setAmount(1);
							rest = event.getPlayer().getInventory().addItem(item);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							}
						} else {
							event.setDropItems(true);
						}
						break;
					case("NormalPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack drop = DropHandler.getNormalDrop(Reference.oreList.get(3));
							rest = event.getPlayer().getInventory().addItem(drop);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								int amount = drop.getAmount() - rest.get(0).getAmount();
								event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.REDSTONE, amount)});
								event.getPlayer().updateInventory();
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							} else {
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(3) , Reference.typeNormal));
								}
							}
							break;
						} else {
							block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getNormalDrop(Reference.oreList.get(3)));
							if (Reference.XPStatus == true) {
								event.setExpToDrop(0);
								event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(3) , Reference.typeNormal));
							}
							break;
						}
					case("NotAPick"):
						break;
					}
				}
			}
			
			if (material == Material.DIAMOND_ORE) {
				if (Reference.DiamondStatus == true) {
					event.setDropItems(false);	
					
					switch(DropHandler.getPickaxeType(event.getPlayer())) {
					case("FortunePick"):
						if (Reference.PutDropInInv == true) {
							if (Reference.FortuneControl == true) {
								ItemStack drop = DropHandler.getFortuneDrop(Reference.oreList.get(5), DropHandler.getFortuneLevel(event.getPlayer()));
								rest = event.getPlayer().getInventory().addItem(drop);
								if (!rest.isEmpty()) {										
									event.setCancelled(true);
									int amount = drop.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.DIAMOND, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");							
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(5) , Reference.typeFortune));
									}
								}
								break;
							} else {
								ItemStack item = new ItemStack(Material.DIAMOND);
								int amount = DropHandler.getDropCount(event.getPlayer().getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS), Reference.oreList.get(5));
								//int amount = random.nextInt(4) + 1;
							    item.setAmount(amount);
								rest = event.getPlayer().getInventory().addItem(item);
								if (!rest.isEmpty()) {
									event.setCancelled(true);
									amount = item.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.DIAMOND, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
									} else {
										if (Reference.XPStatus == true) {
											event.setExpToDrop(0);
											event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(5) , Reference.typeFortune));
										}
									}
								break;
							}
						} else {
							if (Reference.FortuneControl == true) {
								block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getFortuneDrop(Reference.oreList.get(5), DropHandler.getFortuneLevel(event.getPlayer())));
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(5) , Reference.typeFortune));
								}
							} else {
								event.setDropItems(true);
							}
							break;
						}
					case("SilkTouchPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack item = new ItemStack(Material.DIAMOND_ORE);
							item.setAmount(1);
							rest = event.getPlayer().getInventory().addItem(item);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							}
						} else {
							event.setDropItems(true);
						}
						break;
					case("NormalPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack drop = DropHandler.getNormalDrop(Reference.oreList.get(5));
							rest = event.getPlayer().getInventory().addItem(drop);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								int amount = drop.getAmount() - rest.get(0).getAmount();
								event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.DIAMOND, amount)});
								event.getPlayer().updateInventory();
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							} else {
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(5) , Reference.typeNormal));
								}
							}
							break;
						} else {
							block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getNormalDrop(Reference.oreList.get(5)));
							if (Reference.XPStatus == true) {
								event.setExpToDrop(0);
								event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(5) , Reference.typeNormal));
							}
							break;
						}
					case("NotAPick"):
						break;
					}
				}
			}
			
			if (material == Material.EMERALD_ORE) {
				if (Reference.EmeraldStatus == true) {
					event.setDropItems(false);
					
					switch(DropHandler.getPickaxeType(event.getPlayer())) {
					case("FortunePick"):
						if (Reference.PutDropInInv == true) {
							if (Reference.FortuneControl == true) {
								ItemStack drop = DropHandler.getFortuneDrop(Reference.oreList.get(6), DropHandler.getFortuneLevel(event.getPlayer()));
								rest = event.getPlayer().getInventory().addItem(drop);
								if (!rest.isEmpty()) {										
									event.setCancelled(true);
									int amount = drop.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.EMERALD, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");							
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(6) , Reference.typeFortune));
									}
								}
								break;
							} else {
								ItemStack item = new ItemStack(Material.EMERALD);
								int amount = DropHandler.getDropCount(event.getPlayer().getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS), Reference.oreList.get(6));
								//int amount = random.nextInt(4) + 1;
								item.setAmount(amount);
									rest = event.getPlayer().getInventory().addItem(item);
									if (!rest.isEmpty()) {
										event.setCancelled(true);
										amount = item.getAmount() - rest.get(0).getAmount();
										event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.EMERALD, amount)});
										event.getPlayer().updateInventory();
										event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
									} else {
										if (Reference.XPStatus == true) {
											event.setExpToDrop(0);
											event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(6) , Reference.typeFortune));
										}
									}
								break;
							}
						} else {
							if (Reference.FortuneControl == true) {
								block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getFortuneDrop(Reference.oreList.get(6), DropHandler.getFortuneLevel(event.getPlayer())));
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(6) , Reference.typeFortune));
								}
							} else {
								event.setDropItems(true);
							}
							break;
						}
					case("SilkTouchPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack item = new ItemStack(Material.EMERALD_ORE);
							item.setAmount(1);
							rest = event.getPlayer().getInventory().addItem(item);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							}
						} else {
							event.setDropItems(true);
						}
						break;
					case("NormalPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack drop = DropHandler.getNormalDrop(Reference.oreList.get(6));
							rest = event.getPlayer().getInventory().addItem(drop);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								int amount = drop.getAmount() - rest.get(0).getAmount();
								event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.EMERALD, amount)});
								event.getPlayer().updateInventory();
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							} else {
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(6) , Reference.typeNormal));
								}
							}
							break;
						} else {
							block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getNormalDrop(Reference.oreList.get(6)));
							if (Reference.XPStatus == true) {
								event.setExpToDrop(0);
								event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(6) , Reference.typeNormal));
							}
							break;
						}
					case("NotAPick"):
						break;
					}
				}
			}
			
			if (material == Material.LAPIS_ORE) {
				if (Reference.LapisStatus == true) {
					event.setDropItems(false);
					
					switch(DropHandler.getPickaxeType(event.getPlayer())) {
					case("FortunePick"):
						if (Reference.PutDropInInv == true) {
							if (Reference.FortuneControl == true) {
								ItemStack drop = DropHandler.getFortuneDrop(Reference.oreList.get(2), DropHandler.getFortuneLevel(event.getPlayer()));
								rest = event.getPlayer().getInventory().addItem(drop);
								if (!rest.isEmpty()) {										
									event.setCancelled(true);
									int amount = drop.getAmount() - rest.get(0).getAmount();
									ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI, 1);
									lapis.setAmount(amount);
									event.getPlayer().getInventory().removeItem(new ItemStack[] {lapis});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");							
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(2) , Reference.typeFortune));
									}
								}
								break;
							} else {
								ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI);
								int amount = DropHandler.getDropCount(event.getPlayer().getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS), Reference.oreList.get(2));
								//int amount = random.nextInt(20) + 1;
							    lapis.setAmount(amount);
									rest = event.getPlayer().getInventory().addItem(lapis);
									if (!rest.isEmpty()) {
										event.setCancelled(true);
										amount = lapis.getAmount() - rest.get(0).getAmount();
										lapis.setAmount(amount);
										event.getPlayer().getInventory().removeItem(new ItemStack[] {lapis});
										event.getPlayer().updateInventory();
										event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
									} else {
										if (Reference.XPStatus == true) {
											event.setExpToDrop(0);
											event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(2) , Reference.typeFortune));
										}
									}
								break;
							}
						} else {
							if (Reference.FortuneControl == true) {
								block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getFortuneDrop("Lapis", DropHandler.getFortuneLevel(event.getPlayer())));
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(2) , Reference.typeFortune));
								}
							} else {
								event.setDropItems(true);
							}
							break;
						}
					case("SilkTouchPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack item = new ItemStack(Material.LAPIS_ORE);
							item.setAmount(1);
							rest = event.getPlayer().getInventory().addItem(item);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							}
						} else {
							event.setDropItems(true);
						}
						break;
					case("NormalPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack drop = DropHandler.getNormalDrop(Reference.oreList.get(2));
							rest = event.getPlayer().getInventory().addItem(drop);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								int amount = drop.getAmount() - rest.get(0).getAmount();
								ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI);
								lapis.setAmount(amount);
								event.getPlayer().getInventory().removeItem(new ItemStack[] {lapis});
								event.getPlayer().updateInventory();
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							} else {
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(2) , Reference.typeNormal));
								}
							}
							break;
						} else {
							block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getNormalDrop(Reference.oreList.get(2)));
							if (Reference.XPStatus == true) {
								event.setExpToDrop(0);
								event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(2) , Reference.typeNormal));
							}
							break;
						}
					case("NotAPick"):
						break;
					}
				}					
			}
			
			if (material == Material.NETHER_QUARTZ_ORE) {
				if (Reference.QuartzStatus == true) {
					event.setDropItems(false);
					
					switch(DropHandler.getPickaxeType(event.getPlayer())) {
					case("FortunePick"):
						if (Reference.PutDropInInv == true) {
							if (Reference.FortuneControl == true) {
								ItemStack drop = DropHandler.getFortuneDrop(Reference.oreList.get(7), DropHandler.getFortuneLevel(event.getPlayer()));
								rest = event.getPlayer().getInventory().addItem(drop);
								if (!rest.isEmpty()) {										
									event.setCancelled(true);
									int amount = drop.getAmount() - rest.get(0).getAmount();
									event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.QUARTZ, amount)});
									event.getPlayer().updateInventory();
									event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");							
								} else {
									if (Reference.XPStatus == true) {
										event.setExpToDrop(0);
										event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(7) , Reference.typeFortune));
									}
								}
								break;
							} else {
								ItemStack item = new ItemStack(Material.QUARTZ);
								int amount = DropHandler.getDropCount(event.getPlayer().getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS), Reference.oreList.get(7));
								//int amount = random.nextInt(4) + 1;
							    item.setAmount(amount);
									rest = event.getPlayer().getInventory().addItem(item);
									if (!rest.isEmpty()) {
										event.setCancelled(true);
										amount = item.getAmount() - rest.get(0).getAmount();
										event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.QUARTZ, amount)});
										event.getPlayer().updateInventory();
										event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
									} else {
										if (Reference.XPStatus == true) {
											event.setExpToDrop(0);
											event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(7) , Reference.typeFortune));
										}
									}
								break;
							}
						} else {
							if (Reference.FortuneControl == true) {
								block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getFortuneDrop(Reference.oreList.get(7), DropHandler.getFortuneLevel(event.getPlayer())));
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(7) , Reference.typeFortune));
								}
							} else {
								event.setDropItems(true);
							}
							break;
						}
					case("SilkTouchPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack item = new ItemStack(Material.NETHER_QUARTZ_ORE);
							item.setAmount(1);
							rest = event.getPlayer().getInventory().addItem(item);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							}
						} else {
							event.setDropItems(true);
						}
						break;
					case("NormalPick"):
						if (Reference.PutDropInInv == true) {
							ItemStack drop = DropHandler.getNormalDrop(Reference.oreList.get(7));
							rest = event.getPlayer().getInventory().addItem(drop);
							if (!rest.isEmpty()) {
								event.setCancelled(true);
								int amount = drop.getAmount() - rest.get(0).getAmount();
								event.getPlayer().getInventory().removeItem(new ItemStack[] {new ItemStack(Material.QUARTZ, amount)});
								event.getPlayer().updateInventory();
								event.getPlayer().sendMessage(Reference.prefix + "§cThere isn't enough space in your inventory! ");
							} else {
								if (Reference.XPStatus == true) {
									event.setExpToDrop(0);
									event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(7) , Reference.typeNormal));
								}
							}
							break;
						} else {
							block.getLocation().getWorld().dropItemNaturally(DropHandler.getMiddle(block.getLocation()), DropHandler.getNormalDrop(Reference.oreList.get(7)));
							if (Reference.XPStatus == true) {
								event.setExpToDrop(0);
								event.getPlayer().giveExp(DropHandler.getXPDrop(Reference.oreList.get(7) , Reference.typeNormal));
							}
							break;
						}
					case("NotAPick"):
						break;
					}	
				}
			}	
		}
	}
}
