package cc.art.bukkit.skills;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getLogger().info("start...");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new Waterwalk(this), this);
	}

	@Override
	public void onDisable(){
		getLogger().info("close...");
	}
}
