package ml.projectevo.mgm.listeners.player;

import ml.projectevo.mgm.GameState;
import ml.projectevo.mgm.MGM;
import ml.projectevo.mgm.handlers.Game;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit {

    public PlayerQuit(MGM pl) {
        super(pl);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        if (GameState.isState(GameState.IN_LOBBY))
            Game.setCanStart(Bukkit.getOnlinePlayers().length - 1 >= 8);
    }
}
