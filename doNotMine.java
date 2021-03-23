package com.effects1;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class doNotMine implements Listener {
    private final Main main;

    public doNotMine(Main main) {
        this.main = main;
    }
    @EventHandler
    public void doNotMineMethod(PlayerMoveEvent e){
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        PotionEffect potion = new PotionEffect(
                PotionEffectType.POISON,
                750,
                2

        );
        if (loc.getY() <= 12){
            p.addPotionEffect(potion);
        }
    }
}
