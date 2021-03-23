package com.effects1;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;

import java.util.*;

public class setPlayerHP implements Listener {
    private final Main main;

    public setPlayerHP(Main main) {
        this.main = main;
    }

    @EventHandler
    public void setHP(PlayerToggleSprintEvent e){
        Player p = e.getPlayer();
        Random r = new Random();
        boolean chance = (r.nextInt((100 - 1) + 1) + 1 == 1) ? true : false;
        if (chance) p.setHealth(0.5);
    }
}
