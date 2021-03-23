package com.effects1;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class End implements Listener {
    private final Main main;

    public End(Main main) {
        this.main = main;
    }
    @EventHandler
    public void endMethod(PlayerMoveEvent e){
        Player p = e.getPlayer();
        World w = p.getWorld();
        PotionEffect pot = new PotionEffect(
                PotionEffectType.BLINDNESS,
                250,
                2
        );
        PotionEffect pot2 = new PotionEffect(
                PotionEffectType.SLOW,
                250,
                3
        );
        if (w.getWorldFolder().getName().equalsIgnoreCase("world_the_end")){
            p.addPotionEffect(pot);
            p.addPotionEffect(pot2);
        }
    }
}
