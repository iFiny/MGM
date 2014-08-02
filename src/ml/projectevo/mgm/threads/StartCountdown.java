package ml.projectevo.mgm.threads;

import ml.projectevo.mgm.GameState;
import ml.projectevo.mgm.MGM;
import ml.projectevo.mgm.handlers.Game;
import ml.projectevo.mgm.utils.ChatUtilities;
import org.bukkit.Bukkit;

public class StartCountdown implements Runnable {

    private static int timeUntilStart;

    public void run() {
        timeUntilStart = 20;
        while (true) {
            if (GameState.isState(GameState.IN_LOBBY))
                if (Game.canStart()) {
                timeUntilStart = 20;
                ChatUtilities.broadcast("Minimum players reached. Match will start.");
                for (;timeUntilStart >= 0; timeUntilStart--) {

                    if (timeUntilStart == 0) {
                        //TODO START GAME
                        MGM.start();
                        break;
                    }

                    if(timeUntilStart % 10 == 0 || timeUntilStart < 10) {
                        ChatUtilities.broadcast(timeUntilStart + " seconds until the match starts.");
                    }

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        Bukkit.shutdown();
                    }
                }
            }
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Bukkit.shutdown();
        }

    }
}
