package me.nickmoors.OreDropManager.Handlers;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import me.nickmoors.OreDropManager.Reference;
import me.nickmoors.OreDropManager.Config.ConfigFile;

public class DropHandler {
	
	public static Location getMiddle(Location location) {
		location.add(0.5, 0.5, 0.5);
		return location;	
	}
	
	public static ItemStack getNormalDrop(String type) {
		int amount = 0;
		Random random = new Random();
		
		amount = ConfigFile.config.getInt(type + Reference.pathOreNormalAmount);

		if (amount > 1 && Reference.RandomNormalAmount == true){
			amount = random.nextInt(amount) + 1;
		}	
		
		switch(type) {
		case("Coal"):
			if (ConfigFile.config.getString("Coal.Item") == null || ConfigFile.config.getString("Coal.Item").equals("COAL")) {
				ItemStack coalt = new ItemStack(Material.COAL);
				ConfigFile.config.set("Coal.Item", coalt);
				ConfigFile.update();
			}
		
			ItemStack coal = ConfigFile.config.getItemStack("Coal.Item");
			
			coal.setAmount(amount);
			return coal;
		case("Iron"):
			if (ConfigFile.config.getString("Iron.Item") == null || ConfigFile.config.getString("Iron.Item").equals("IRON_ORE")) {
				ItemStack iront = new ItemStack(Material.IRON_ORE);
				ConfigFile.config.set("Iron.Item", iront);
				ConfigFile.update();
			}
		
			ItemStack iron = ConfigFile.config.getItemStack("Iron.Item");
			
			iron.setAmount(amount);
			return iron;
		case("Gold"):
			if (ConfigFile.config.getString("Gold.Item") == null || ConfigFile.config.getString("Gold.Item").equals("GOLD_ORE")) {
				ItemStack goldt = new ItemStack(Material.GOLD_ORE);
				ConfigFile.config.set("Gold.Item", goldt);
				ConfigFile.update();
			}
		
			ItemStack gold = ConfigFile.config.getItemStack("Gold.Item");
			
			gold.setAmount(amount);
			return gold;
		case("Redstone"):
			if (ConfigFile.config.getString("Redstone.Item") == null || ConfigFile.config.getString("Redstone.Item").equals("REDSTONE")) {
				ItemStack redstonet = new ItemStack(Material.REDSTONE);
				ConfigFile.config.set("Redstone.Item", redstonet);
				ConfigFile.update();
			}
		
			ItemStack redstone = ConfigFile.config.getItemStack("Redstone.Item");
			
			redstone.setAmount(amount);
			return redstone;
		case("Diamond"):
			if (ConfigFile.config.getString("Diamond.Item") == null || ConfigFile.config.getString("Diamond.Item").equals("DIAMOND")) {
				ItemStack diamondt = new ItemStack(Material.DIAMOND);
				ConfigFile.config.set("Diamond.Item", diamondt);
				ConfigFile.update();
			}
		
			ItemStack diamond = ConfigFile.config.getItemStack("Diamond.Item");
			
			diamond.setAmount(amount);
			return diamond;
		case("Emerald"):
			if (ConfigFile.config.getString("Emerald.Item") == null || ConfigFile.config.getString("Emerald.Item").equals("EMERALD")) {
				ItemStack emeraldt = new ItemStack(Material.EMERALD);
				ConfigFile.config.set("Emerald.Item", emeraldt);
				ConfigFile.update();
			}
		
			ItemStack emerald = ConfigFile.config.getItemStack("Emerald.Item");
			emerald.setAmount(amount);
			return emerald;
		case("Lapis"):
			if (ConfigFile.config.getString("Lapis.Item") == null || ConfigFile.config.getString("Lapis.Item").equals("LAPIS_LAZULI")) {
				ItemStack lapist = new ItemStack(Material.LAPIS_LAZULI);
				ConfigFile.config.set("Lapis.Item", lapist);
				ConfigFile.update();
			}
		
			ItemStack lapis = ConfigFile.config.getItemStack("Lapis.Item");
			lapis.setAmount(amount);
			return lapis;
		case("Quartz"):
			if (ConfigFile.config.getString("Quartz.Item") == null || ConfigFile.config.getString("Quartz.Item").equals("QUARTZ")) {
				ItemStack quartzt = new ItemStack(Material.QUARTZ);
				ConfigFile.config.set("Quartz.Item", quartzt);
				ConfigFile.update();
			}
		
			ItemStack quartz = ConfigFile.config.getItemStack("Quartz.Item");
			quartz.setAmount(amount);
			return quartz;
		}
		return null;	
	}
	
	public static ItemStack getFortuneDrop(String type, int fortunelevel) {
		int amount = 0;
		Random random = new Random();
		
		amount = ConfigFile.config.getInt(type + Reference.pathOreFortuneAmount);
		
		switch (fortunelevel) {
		case(1):
			if (amount >= 3) {
				amount = (int) Math.ceil((double)amount/(double)3);
				amount = random.nextInt(amount) + 1;
			} else if (amount > 1) {
				amount = random.nextInt(amount) + 1;
			}
		case(2):
			if (amount >= 3) {
				amount = (int) Math.ceil(((double)amount/(double)3) * (double)2);
				amount = random.nextInt(amount) + 1;
			} else if (amount > 1) {
				amount = random.nextInt(amount) + 1;
			}
		case(3):
			if (amount > 1) {
				amount = random.nextInt(amount) + 1;
			} 
		case(4):
			if (amount > 1) {
				amount = random.nextInt(amount) + 1;
			} 
		}
		
		switch(type) {
		case("Coal"):
			if (ConfigFile.config.getString("Coal.Item") == null || ConfigFile.config.getString("Coal.Item").equals("COAL")) {
				ItemStack coalt = new ItemStack(Material.COAL);
				ConfigFile.config.set("Coal.Item", coalt);
				ConfigFile.update();
			}
		
			ItemStack coal = ConfigFile.config.getItemStack("Coal.Item");
			
			coal.setAmount(amount);
			return coal;
		case("Iron"):
			if (ConfigFile.config.getString("Iron.Item") == null || ConfigFile.config.getString("Iron.Item").equals("IRON_ORE")) {
				ItemStack iront = new ItemStack(Material.IRON_ORE);
				ConfigFile.config.set("Iron.Item", iront);
				ConfigFile.update();
			}
		
			ItemStack iron = ConfigFile.config.getItemStack("Iron.Item");
			
			iron.setAmount(amount);
			return iron;
		case("Gold"):
			if (ConfigFile.config.getString("Gold.Item") == null || ConfigFile.config.getString("Gold.Item").equals("GOLD_ORE")) {
				ItemStack goldt = new ItemStack(Material.GOLD_ORE);
				ConfigFile.config.set("Gold.Item", goldt);
				ConfigFile.update();
			}
		
			ItemStack gold = ConfigFile.config.getItemStack("Gold.Item");
			
			gold.setAmount(amount);
			return gold;
		case("Redstone"):
			if (ConfigFile.config.getString("Redstone.Item") == null || ConfigFile.config.getString("Redstone.Item").equals("REDSTONE")) {
				ItemStack redstonet = new ItemStack(Material.REDSTONE);
				ConfigFile.config.set("Redstone.Item", redstonet);
				ConfigFile.update();
			}
		
			ItemStack redstone = ConfigFile.config.getItemStack("Redstone.Item");
			
			redstone.setAmount(amount);
			return redstone;
		case("Diamond"):
			if (ConfigFile.config.getString("Diamond.Item") == null || ConfigFile.config.getString("Diamond.Item").equals("DIAMOND")) {
				ItemStack diamondt = new ItemStack(Material.DIAMOND);
				ConfigFile.config.set("Diamond.Item", diamondt);
				ConfigFile.update();
			}
		
			ItemStack diamond = ConfigFile.config.getItemStack("Diamond.Item");
			
			diamond.setAmount(amount);
			return diamond;
		case("Emerald"):
			if (ConfigFile.config.getString("Emerald.Item") == null || ConfigFile.config.getString("Emerald.Item").equals("EMERALD")) {
				ItemStack emeraldt = new ItemStack(Material.EMERALD);
				ConfigFile.config.set("Emerald.Item", emeraldt);
				ConfigFile.update();
			}
		
			ItemStack emerald = ConfigFile.config.getItemStack("Emerald.Item");
			
			emerald.setAmount(amount);
			return emerald;
		case("Lapis"):
			if (ConfigFile.config.getString("Lapis.Item") == null || ConfigFile.config.getString("Lapis.Item").equals("LAPIS_LAZULI")) {
				ItemStack lapist = new ItemStack(Material.LAPIS_LAZULI);
				ConfigFile.config.set("Lapis.Item", lapist);
				ConfigFile.update();
			}
		
			ItemStack lapis = ConfigFile.config.getItemStack("Lapis.Item");
			lapis.setAmount(amount);
			return lapis;
		case("Quartz"):
			if (ConfigFile.config.getString("Quartz.Item") == null || ConfigFile.config.getString("Quartz.Item").equals("QUARTZ")) {
				ItemStack quartzt = new ItemStack(Material.QUARTZ);
				ConfigFile.config.set("Quartz.Item", quartzt);
				ConfigFile.update();
			}
		
			ItemStack quartz = ConfigFile.config.getItemStack("Quartz.Item");
			
			quartz.setAmount(amount);
			return quartz;
		}
		return null;	
	}
	
	public static String getPickaxeType(Player player) {
		if (player.getInventory().getItemInMainHand().getType().toString().contains("PICKAXE") && player.getInventory().getItemInMainHand().containsEnchantment(Enchantment.LOOT_BONUS_BLOCKS)) {
			return Reference.pickFortune;
		} else if (player.getInventory().getItemInMainHand().getType().toString().contains("PICKAXE") && player.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
			return Reference.pickSilkTouch;
		} else if (player.getInventory().getItemInMainHand().getType().toString().contains("PICKAXE")) {
			return Reference.pickNormal;
		} else {
			return Reference.pickFalse;
		}
	}
	
	public static int getFortuneLevel(Player player) {
		if (player.getInventory().getItemInMainHand().getType().toString().contains("PICKAXE") && player.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 1) {
			return 1;
		} else if (player.getInventory().getItemInMainHand().getType().toString().contains("PICKAXE") && player.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) == 2) {
			return 2;
		} else if (player.getInventory().getItemInMainHand().getType().toString().contains("PICKAXE") && player.getInventory().getItemInMainHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS) >= 3) {
			return 3;
		}
		return 0;
	}
	
	public static int getXPDrop(String ore, String type) {
		Random random = new Random();
		int amount = 0;
		switch(type) {
		case ("Fortune"):
				if (Reference.RandomFortuneXP == true) {
					amount = random.nextInt(ConfigFile.config.getInt(ore + Reference.pathOreFortuneXP) + 1);
					return amount;
				} else {
					amount = ConfigFile.config.getInt(ore + Reference.pathOreFortuneXP);
					return amount;
				}
		case ("Normal"):
				if (Reference.RandomNormalXP == true) {
					amount = random.nextInt(ConfigFile.config.getInt(ore + Reference.pathOreNormalXP) + 1);
					return amount;
				} else {
					amount = ConfigFile.config.getInt(ore + Reference.pathOreNormalXP);
					return amount;
				}
		}	
		return 0;	
	}
	
    public static int getDropCount(int fortuneLevel, String ore) {
        int bonus = (int) (Math.random() * (fortuneLevel + 2)) - 1;
 
        if (ore.equals(Reference.oreList.get(0)) || ore.equals(Reference.oreList.get(5)) || ore.equals(Reference.oreList.get(6)) || ore.equals(Reference.oreList.get(7))) {
        	//Normal
        	bonus = (int) (Math.random() * (fortuneLevel + 2)) - 1;
        	
        	if (bonus < 0) {
                bonus = 0;
            }
        	
        	return bonus + 1;
        } else if (ore.equals(Reference.oreList.get(2)) || ore.equals(Reference.oreList.get(3))) {
        	//Special
        	bonus = (int) (Math.random() * (fortuneLevel + 5)) * fortuneLevel;
        	
        	if (bonus < 0) {
                bonus = 0;
            }
        	
        	return bonus + 4;
        }
        return (bonus + 1);
    }
}
