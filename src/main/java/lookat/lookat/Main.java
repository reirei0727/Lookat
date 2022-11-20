package lookat.lookat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;
    public static Main instance;
    public Main(){instance = this;}
    public static Main getInstance(){return instance;}
private EventListener listeners;
    @Override
    public void onEnable() {
        this.listeners = new EventListener();
        plugin = this;
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this.listeners, this);
        getCommand("az").setExecutor(new command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getPlugin(){
        return plugin;
    }
}
