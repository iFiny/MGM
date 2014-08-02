package ml.projectevo.mgm.listeners.player;

import ml.projectevo.mgm.MGM;
import ml.projectevo.mgm.handlers.Game;
import ml.projectevo.mgm.listeners.MGListener;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin extends MGListener{

    public PlayerJoin(MGM pl) {
        super(pl);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Game.setCanStart(Bukkit.getOnlinePlayers().length >= 8);
    }

}
