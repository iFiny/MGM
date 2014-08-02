package ml.projectevo.mgm.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import static org.bukkit.ChatColor.GOLD;
import static org.bukkit.ChatColor.WHITE;

public class ChatUtilities {

    public static void broadcast(String msg) {
        for (Player player : Bukkit.getOnlinePlayers())
            player.sendMessage(starter() + msg);
    }

    private static String starter() {
        return GOLD + ">> " + WHITE;
    }

}
