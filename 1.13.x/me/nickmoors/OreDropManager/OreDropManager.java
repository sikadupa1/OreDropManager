package me.nickmoors.OreDropManager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.nickmoors.OreDropManager.Commands.Command;
import me.nickmoors.OreDropManager.Config.ConfigFile;
import me.nickmoors.OreDropManager.Events.Event;

public class OreDropManager extends JavaPlugin {
	
	public static OreDropManager instance;
	public static String version = "Unknown";
	
	@Override
	public void onEnable() {
		version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
		
		instance = this;
		ConfigFile.enable();
		Reference.oreList();
		Command.enable();
		Event.enable();
		//checkForUpdate();	
		Reference.Enable();
	}
	
	@Override
	public void onDisable() {
		ConfigFile.disable();
		instance = null;
	}
	
	/*public static void checkForUpdate(){
	    try {
	        HttpURLConnection c = (HttpURLConnection)new URL("http://www.spigotmc.org/api/general.php").openConnection();
	        c.setDoOutput(true);
	        c.setRequestMethod("POST");
	        c.getOutputStream().write(("key=98BE0FE67F88AB82B4C197FAF1DC3B69206EFDCC4D3B80FC83A00037510B99B4&resource=43563").getBytes("UTF-8"));
	        String oldVersion = OreDropManager.instance.getDescription().getVersion();
	        String newVersion = new BufferedReader(new InputStreamReader(c.getInputStream())).readLine().replaceAll("[a-zA-Z ]", "");
	        if(!newVersion.equals(oldVersion)) {
	        	Bukkit.getConsoleSender().sendMessage("[OreDropManager] §aNew update found!" + "(v" + newVersion + ")");
	        	JoinEvent.Update = true;
	        } else {
	        	JoinEvent.Update = false;
	        }
	      }
	      catch(Exception e) {
	        //Bukkit.getConsoleSender().sendMessage("[OreDropManager] §cCould not check for updates!");
	      }
	}*/
}
