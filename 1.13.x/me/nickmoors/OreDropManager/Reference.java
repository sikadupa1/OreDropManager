package me.nickmoors.OreDropManager;

import java.util.ArrayList;

import org.bukkit.entity.Player;

import me.nickmoors.OreDropManager.Config.ConfigFile;

public class Reference {

		//Values to access from other classes
		//General
		public static String prefix = "";
		public static boolean Update =  true;
		public static boolean FortuneControl = false;
		public static boolean RandomNormalAmount = false;
		public static boolean PutDropInInv = false;
		public static int Errors = 0;
		
		//Ingame config
		public static boolean activate = false;
		public static boolean inUse = false;
		public static Player editingPlayer = null;
		
		//XP
		public static boolean XPStatus = false;
		public static boolean RandomNormalXP = false;
		public static boolean RandomFortuneXP = false;

		//Coal
		public static boolean CoalStatus = false;
		public static int CoalNormalDrop = 0;
		public static int CoalNormalXP = 0;
		public static int CoalFortuneDrop = 0;
		public static int CoalFortuneXP = 0;

		//Iron
		public static boolean IronStatus = false;
		public static int IronNormalDrop = 0;
		public static int IronNormalXP = 0;
		public static int IronFortuneDrop = 0;
		public static int IronFortuneXP = 0;

		//Gold
		public static boolean GoldStatus = false;
		public static int GoldNormalDrop = 0;
		public static int GoldNormalXP = 0;
		public static int GoldFortuneDrop = 0;
		public static int GoldFortuneXP = 0;

		//Redstone
		public static boolean RedstoneStatus = false;
		public static int RedstoneNormalDrop = 0;
		public static int RedstoneNormalXP = 0;
		public static int RedstoneFortuneDrop = 0;
		public static int RedstoneFortuneXP = 0;

		//Diamond
		public static boolean DiamondStatus = false;
		public static int DiamondNormalDrop = 0;
		public static int DiamondNormalXP = 0;
		public static int DiamondFortuneDrop = 0;
		public static int DiamondFortuneXP = 0;

		//Emerald
		public static boolean EmeraldStatus = false;
		public static int EmeraldNormalDrop = 0;
		public static int EmeraldNormalXP = 0;
		public static int EmeraldFortuneDrop = 0;
		public static int EmeraldFortuneXP = 0;

		//Lapis
		public static boolean LapisStatus = false;
		public static int LapisNormalDrop = 0;
		public static int LapisNormalXP = 0;
		public static int LapisFortuneDrop = 0;
		public static int LapisFortuneXP = 0;

		//Quartz
		public static boolean QuartzStatus = false;
		public static int QuartzNormalDrop = 0;
		public static int QuartzNormalXP = 0;
		public static int QuartzFortuneDrop = 0;
		public static int QuartzFortuneXP = 0;
		
		//Messages
		public static String msgReloadSuccess = "&9Config Reloaded!";
		public static String msgReloadAbort = "&cReload Canceled!";
		public static String msgConfigInUse = "&9Ingame config is being used by: %player%";
		public static String msgNoPermission = "&cYou don't have permission to do that!";
		public static String msgFullInventory = "&cThere isn't enough space in your inventory!";
		public static String msgError = "&cDid I do that?:";
		
		//Config Paths
		public static String pathPrefix = "prefix";
		public static String pathUpdate = "Update.Enabled";
		public static String pathFortuneControl = "FortuneControl.Enabled";
		public static String pathRandomNormalAmount = "RandomNormalAmount.Enabled";
		public static String pathPutDropInInv = "PutDropInInventory.Enabled";
		public static String pathXP = "XP.Enabled";
		public static String pathRandomNormalXP = "XP.RandomNormalXP";
		public static String pathRandomFortuneXP = "XP.RandomFortuneXP";
		public static String pathOreEnabled = ".Enabled";
		public static String pathOreNormalAmount = ".NormalAmount";
		public static String pathOreNormalXP = ".NormalXP";
		public static String pathOreFortuneAmount = ".FortuneAmount";
		public static String pathOreFortuneXP = ".FortuneXP";
		public static ArrayList<String> oreList = new ArrayList<String>();
		
		//Types
		public static String typeRandomNormalAmount = "RandomNormalAmount";
		public static String typeFortuneControl = "FortuneControl";
		public static String typeFortune = "Fortune";
		public static String typeNormal = "Normal";
		public static String typePutDropInInv = "PutDropInInventory";
		public static String typeXP = "XP";
		public static String typeNormalXP = "NormalXP";
		public static String typeFortuneXP = "FortuneXP";
		public static String typeRandomNormalXP = "RandomNormalXP";
		public static String typeRandomFortuneXP = "RandomFortuneXP";
		public static String typeNormalAmount = "NormalAmount";
		public static String typeFortuneAmount = "FortuneAmount";
		public static String typeUpdate = "Update";
		
		//Picks
		public static String pickNormal = "NormalPick";
		public static String pickFortune = "FortunePick";
		public static String pickSilkTouch = "SilkTouchPick";
		public static String pickFalse = "NotAPick";
				
		//Color
		public static String Cyan = "§3";
		public static String Purple = "§9";
		
		public static void oreList() {
			oreList.clear();
			oreList.add("Coal");
			oreList.add("Iron");
			oreList.add("Lapis");
			oreList.add("Redstone");
			oreList.add("Gold");
			oreList.add("Diamond");
			oreList.add("Emerald");
			oreList.add("Quartz");
		}
		
		public static void Enable() {	
			//Prefix
			try {
				prefix = ConfigFile.config.getString("prefix").replace("&", "§");
			} catch (Exception e) {
				Errors++;
				ConfigFile.config.set("prefix", "&f[&cOreDropManager&f]");
				ConfigFile.update();
				Reference.Enable();
			}
			
			//Messages
			/*try {
				msgReloadSuccess = ConfigFile.config.getString("Messages.ReloadSuccess").replace("&", "§");
			} catch (Exception e) {
				Errors++;
				ConfigFile.config.set("Messages.ReloadSuccess", "&9Config Reloaded!");
				ConfigFile.update();
				Reference.Enable();
			}
			
			try {
				msgReloadAbort = ConfigFile.config.getString("Messages.ReloadAbort").replace("&", "§");
			} catch (Exception e) {
				Errors++;
				ConfigFile.config.set("Messages.ReloadAbort", "&cReload Canceled!");
				ConfigFile.update();
				Reference.Enable();
			}
			
			try {
				msgConfigInUse = ConfigFile.config.getString("Messages.ConfigInUse").replace("&", "§");
			} catch (Exception e) {
				Errors++;
				ConfigFile.config.set("Messages.ConfigInUse", "&9Ingame config is being used by: %player%");
				ConfigFile.update();
				Reference.Enable();
			}
			
			try {
				msgNoPermission = ConfigFile.config.getString("Messages.NoPermission").replace("&", "§");
			} catch (Exception e) {
				Errors++;
				ConfigFile.config.set("Messages.NoPermission", "&cYou don't have permission to do that!");
				ConfigFile.update();
				Reference.Enable();
			}
			
			try {
				msgError = ConfigFile.config.getString("Messages.Error").replace("&", "§");
			} catch (Exception e) {
				Errors++;
				ConfigFile.config.set("Messages.Error", "&cDid I do that?:");
				ConfigFile.update();
				Reference.Enable();
			}*/
			
			//Status General Options
			try {
				Update = ConfigFile.getValue("Update.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Update.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				FortuneControl = ConfigFile.getValue("FortuneControl.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("FortuneControl.Enabled", false);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				RandomNormalAmount = ConfigFile.getValue("RandomNormalAmount.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("RandomNormalAmount.Enabled", false);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				PutDropInInv = ConfigFile.getValue("PutDropInInventory.Enabled");
			} catch (Exception e) {
				Errors++;
				ConfigFile.config.set("PutDropInInventory.Enabled", false);
				ConfigFile.update();
				Reference.Enable();
			}	
		
			//XP
			try {
				XPStatus = ConfigFile.getValue("XP.Enabled");
			} catch (Exception e) {
				Errors++;
				ConfigFile.config.set("XP.Enabled", false);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				RandomNormalXP = ConfigFile.getValue("XP.RandomNormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("XP.RandomNormalXP", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				RandomFortuneXP = ConfigFile.getValue("XP.RandomFortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("XP.RandomFortuneXP", true);
				ConfigFile.update();
				Reference.Enable();
			}
			
			//Coal
			try {
				CoalStatus = ConfigFile.getValue("Coal.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Coal.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				CoalNormalDrop = ConfigFile.getIntValue("Coal.NormalAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Coal.NormalAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				CoalNormalXP = ConfigFile.getIntValue("Coal.NormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Coal.NormalXP", 2);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				CoalFortuneDrop = ConfigFile.getIntValue("Coal.FortuneAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Coal.FortuneAmount", 2);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				CoalFortuneXP = ConfigFile.getIntValue("Coal.FortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Coal.FortuneXP", 2);
				ConfigFile.update();
				Reference.Enable();
			}

			//Iron
			try {
				IronStatus = ConfigFile.getValue("Iron.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Iron.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				IronNormalDrop = ConfigFile.getIntValue("Iron.NormalAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Iron.NormalAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				IronNormalXP = ConfigFile.getIntValue("Iron.NormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Iron.NormalXP", 0);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				IronFortuneDrop = ConfigFile.getIntValue("Iron.FortuneAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Iron.FortuneAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				IronFortuneXP = ConfigFile.getIntValue("Iron.FortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Iron.FortuneXP", 0);
				ConfigFile.update();
				Reference.Enable();
			}
			
			//Gold
			try {
				GoldStatus = ConfigFile.getValue("Gold.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Gold.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				GoldNormalDrop = ConfigFile.getIntValue("Gold.NormalAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Gold.NormalAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				GoldNormalXP = ConfigFile.getIntValue("Gold.NormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Gold.NormalXP", 0);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				GoldFortuneDrop = ConfigFile.getIntValue("Gold.FortuneAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Gold.FortuneAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				GoldFortuneXP = ConfigFile.getIntValue("Gold.FortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Gold.FortuneXP", 0);
				ConfigFile.update();
				Reference.Enable();
			}
			
			//Redstone
			try {
				RedstoneStatus = ConfigFile.getValue("Redstone.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Redstone.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				RedstoneNormalDrop = ConfigFile.getIntValue("Redstone.NormalAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Redstone.NormalAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				RedstoneNormalXP = ConfigFile.getIntValue("Redstone.NormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Redstone.NormalXP", 5);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				RedstoneFortuneDrop = ConfigFile.getIntValue("Redstone.FortuneAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Redstone.FortuneAmount", 2);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				RedstoneFortuneXP = ConfigFile.getIntValue("Redstone.FortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Redstone.FortuneXP", 5);
				ConfigFile.update();
				Reference.Enable();
			}
			
			//Diamond
			try {
				DiamondStatus = ConfigFile.getValue("Diamond.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Diamond.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				DiamondNormalDrop = ConfigFile.getIntValue("Diamond.NormalAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Diamond.NormalAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				DiamondNormalXP = ConfigFile.getIntValue("Diamond.NormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Diamond.NormalXP", 7);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				DiamondFortuneDrop = ConfigFile.getIntValue("Diamond.FortuneAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Diamond.FortuneAmount", 2);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				DiamondFortuneXP = ConfigFile.getIntValue("Diamond.FortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Diamond.FortuneXP", 7);
				ConfigFile.update();
				Reference.Enable();
			}

			//Emerald
			try {
				EmeraldStatus = ConfigFile.getValue("Emerald.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Emerald.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				EmeraldNormalDrop = ConfigFile.getIntValue("Emerald.NormalAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Emerald.NormalAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				EmeraldNormalXP = ConfigFile.getIntValue("Emerald.NormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Emerald.NormalXP", 7);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				EmeraldFortuneDrop = ConfigFile.getIntValue("Emerald.FortuneAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Emerald.FortuneAmount", 2);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				EmeraldFortuneXP = ConfigFile.getIntValue("Emerald.FortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Emerald.FortuneXP", 7);
				ConfigFile.update();
				Reference.Enable();
			}

			//Lapis
			try {
				LapisStatus = ConfigFile.getValue("Lapis.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Lapis.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				LapisNormalDrop = ConfigFile.getIntValue("Lapis.NormalAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Lapis.NormalAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				LapisNormalXP = ConfigFile.getIntValue("Lapis.NormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Lapis.NormalXP", 5);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				LapisFortuneDrop = ConfigFile.getIntValue("Lapis.FortuneAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Lapis.FortuneAmount", 2);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				LapisFortuneXP = ConfigFile.getIntValue("Lapis.FortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Lapis.FortuneXP", 5);
				ConfigFile.update();
				Reference.Enable();
			}

			//Quartz
			try {
				QuartzStatus = ConfigFile.getValue("Quartz.Enabled");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Quartz.Enabled", true);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				QuartzNormalDrop = ConfigFile.getIntValue("Quartz.NormalAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Quartz.NormalAmount", 1);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				QuartzNormalXP = ConfigFile.getIntValue("Quartz.NormalXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Quartz.NormalXP", 5);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				QuartzFortuneDrop = ConfigFile.getIntValue("Quartz.FortuneAmount");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Quartz.FortuneAmount", 2);
				ConfigFile.update();
				Reference.Enable();
			}
			try {
				QuartzFortuneXP = ConfigFile.getIntValue("Quartz.FortuneXP");
			} catch(Exception e) {
				Errors++;
				ConfigFile.config.set("Quartz.FortuneXP", 5);
				ConfigFile.update();
				Reference.Enable();
			}
		}
		
		public static void returnOriginal() {
			ConfigFile.changeValue(pathUpdate, Update, false);
			ConfigFile.changeValue(pathFortuneControl, FortuneControl, false);
			ConfigFile.changeValue(pathRandomNormalAmount, RandomNormalAmount, false);
			ConfigFile.changeValue(pathPutDropInInv, PutDropInInv, false);
			ConfigFile.changeValue(pathXP, XPStatus, false);
			ConfigFile.changeValue(pathRandomNormalXP, RandomNormalXP, false);
			ConfigFile.changeValue(pathRandomFortuneXP, RandomFortuneXP, false);
			ConfigFile.update();
			
			for(String ore: oreList) {
				switch(ore) {
				case("Coal"):
					ConfigFile.changeValue(ore + pathOreEnabled, CoalStatus, false);
					ConfigFile.changeIntValue(ore + pathOreNormalAmount, CoalNormalDrop, false);
					ConfigFile.changeIntValue(ore + pathOreNormalXP, CoalNormalXP, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneAmount, CoalFortuneDrop, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneXP, CoalFortuneXP, false);
					ConfigFile.update();
					break;
				case("Iron"):
					ConfigFile.changeValue(ore + pathOreEnabled, IronStatus, false);
					ConfigFile.changeIntValue(ore + pathOreNormalAmount, IronNormalDrop, false);
					ConfigFile.changeIntValue(ore + pathOreNormalXP, IronNormalXP, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneAmount, IronFortuneDrop, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneXP, IronFortuneXP, false);
					ConfigFile.update();
					break;
				case("Lapis"):
					ConfigFile.changeValue(ore + pathOreEnabled, LapisStatus, false);
					ConfigFile.changeIntValue(ore + pathOreNormalAmount, LapisNormalDrop, false);
					ConfigFile.changeIntValue(ore + pathOreNormalXP, LapisNormalXP, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneAmount, LapisFortuneDrop, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneXP, LapisFortuneXP, false);
					ConfigFile.update();
					break;
				case("Redstone"):
					ConfigFile.changeValue(ore + pathOreEnabled, RedstoneStatus, false);
					ConfigFile.changeIntValue(ore + pathOreNormalAmount, RedstoneNormalDrop, false);
					ConfigFile.changeIntValue(ore + pathOreNormalXP, RedstoneNormalXP, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneAmount, RedstoneFortuneDrop, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneXP, RedstoneFortuneXP, false);
					ConfigFile.update();
					break;
				case("Gold"):
					ConfigFile.changeValue(ore + pathOreEnabled, GoldStatus, false);
					ConfigFile.changeIntValue(ore + pathOreNormalAmount, GoldNormalDrop, false);
					ConfigFile.changeIntValue(ore + pathOreNormalXP, GoldNormalXP, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneAmount, GoldFortuneDrop, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneXP, GoldFortuneXP, false);
					ConfigFile.update();
					break;
				case("Diamond"):
					ConfigFile.changeValue(ore + pathOreEnabled, DiamondStatus, false);
					ConfigFile.changeIntValue(ore + pathOreNormalAmount, DiamondNormalDrop, false);
					ConfigFile.changeIntValue(ore + pathOreNormalXP, DiamondNormalXP, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneAmount, DiamondFortuneDrop, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneXP, DiamondFortuneXP, false);
					ConfigFile.update();
					break;
				case("Emerald"):
					ConfigFile.changeValue(ore + pathOreEnabled, EmeraldStatus, false);
					ConfigFile.changeIntValue(ore + pathOreNormalAmount, EmeraldNormalDrop, false);
					ConfigFile.changeIntValue(ore + pathOreNormalXP, EmeraldNormalXP, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneAmount, EmeraldFortuneDrop, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneXP, EmeraldFortuneXP, false);
					ConfigFile.update();
					break;
				case("Quartz"):
					ConfigFile.changeValue(ore + pathOreEnabled, QuartzStatus, false);
					ConfigFile.changeIntValue(ore + pathOreNormalAmount, QuartzNormalDrop, false);
					ConfigFile.changeIntValue(ore + pathOreNormalXP, QuartzNormalXP, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneAmount, QuartzFortuneDrop, false);
					ConfigFile.changeIntValue(ore + pathOreFortuneXP, QuartzFortuneXP, false);
					ConfigFile.update();
					break;
				}		
			}
		}
		
		public static String getLore(int lore) {
			switch(lore) {
			default:
				return("§cUnvalid");
			case(1):
				return("§9Click to edit.");
			case(2):
				return("§cDon't Save & Quit");
			case(3):
				return("§6Continue editing");
			case(4):
				return("§aSave & Quit");
			case(5):
				return("§9Add 10 to NormalAmount");
			case(6):
				return("§9Add 1 to NormalAmount");
			case(7):
				return("§9Add 1 to FortuneAmount");
			case(8):
				return("§9Add 10 to FortuneAmount");
			case(9):
				return("§9Remove 10 from NormalAmount");
			case(10):
				return("§9Remove 1 from NormalAmount");
			case(11):
				return("§9Remove 1 from FortuneAmount");
			case(12):
				return("§9Remove 10 from FortuneAmount");
			case(13):
				return("§9Add 10 to NormalXP");
			case(14):
				return("§9Add 1 to NormalXP");
			case(15):
				return("§9Add 1 to FortuneXP");
			case(16):
				return("§9Add 10 to FortuneXP");
			case(17):
				return("§9Remove 10 from NormalXP");
			case(18):
				return("§9Remove 1 from NormalXP");
			case(19):
				return("§9Remove 1 from FortuneXP");
			case(20):
				return("§9Remove 10 from FortuneXP");
			case(21):
				return "§9Click to toggle.";
			}
		}
}
