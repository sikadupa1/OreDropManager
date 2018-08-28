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
		int amount;
		Random random = new Random();
		
		amount = ConfigFile.config.getInt(type + Reference.pathOreNormalAmount);
		if (amount > 1 && Reference.RandomNormalAmount == true){
			amount = random.nextInt(amount) + 1;
		}	
		
		switch(type) {
		case("Coal"):
			ItemStack coal = new ItemStack(Material.COAL);
			coal.setAmount(amount);
			return coal;
		case("Iron"):
			ItemStack iron = new ItemStack(Material.IRON_ORE);
			iron.setAmount(amount);
			return iron;
		case("Gold"):
			ItemStack gold = new ItemStack(Material.GOLD_ORE);
			gold.setAmount(amount);
			return gold;
		case("Redstone"):
			ItemStack redstone = new ItemStack(Material.REDSTONE);
			redstone.setAmount(amount);
			return redstone;
		case("Diamond"):
			ItemStack diamond = new ItemStack(Material.DIAMOND);
			diamond.setAmount(amount);
			return diamond;
		case("Emerald"):
			ItemStack emerald = new ItemStack(Material.EMERALD);
			emerald.setAmount(amount);
			return emerald;
		case("Lapis"):
			ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI);
			lapis.setAmount(amount);
			return lapis;
		case("Quartz"):
			ItemStack quartz = new ItemStack(Material.QUARTZ);
			quartz.setAmount(amount);
			return quartz;
		}
		return null;	
	}
	
	public static ItemStack getFortuneDrop(String type, int fortunelevel) {
		int amount;
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
			ItemStack coal = new ItemStack(Material.COAL);
			coal.setAmount(amount);
			return coal;
		case("Iron"):
			ItemStack iron = new ItemStack(Material.IRON_ORE);
			iron.setAmount(amount);
			return iron;
		case("Gold"):
			ItemStack gold = new ItemStack(Material.GOLD_ORE);
			gold.setAmount(amount);
			return gold;
		case("Redstone"):
			ItemStack redstone = new ItemStack(Material.REDSTONE);
			redstone.setAmount(amount);
			return redstone;
		case("Diamond"):
			ItemStack diamond = new ItemStack(Material.DIAMOND);
			diamond.setAmount(amount);
			return diamond;
		case("Emerald"):
			ItemStack emerald = new ItemStack(Material.EMERALD);
			emerald.setAmount(amount);
			return emerald;
		case("Lapis"):
			ItemStack lapis = new ItemStack(Material.LAPIS_LAZULI);
			lapis.setAmount(amount);
			return lapis;
		case("Quartz"):
			ItemStack quartz = new ItemStack(Material.QUARTZ);
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
