package ml.projectevo.mgm;

import ml.projectevo.mgm.listeners.player.PlayerJoin;
import ml.projectevo.mgm.threads.StartCountdown;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MGM extends JavaPlugin{

    public void onEnable() {
        GameState.setState(GameState.IN_LOBBY);
        new Thread(new StartCountdown()).start();
    }

    public static void start(){

    }

    public void registerListeners() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(new PlayerJoin(this), this);
    }

    public static void stop(){

    }

}
