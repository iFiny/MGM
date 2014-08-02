package ml.projectevo.mgm;

import ml.projectevo.mgm.threads.StartCountdown;
import org.bukkit.plugin.java.JavaPlugin;

public class MGM extends JavaPlugin{

    public void onEnable() {
        GameState.setState(GameState.IN_LOBBY);
        new Thread(new StartCountdown()).start();
    }

    public static void start(){

    }

    public static void stop(){

    }

}
