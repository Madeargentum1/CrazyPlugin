package com.effects1;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class CheckInWater implements Listener {
    private final Main main;

    public CheckInWater(Main main) {
        this.main = main;
    }
    @EventHandler
    public void CheckInWaterPlayer(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if (p.getLocation().getBlock().getType().equals(Material.WATER)
                &&  p.getEyeLocation().getBlock().getType().equals(Material.WATER)){
            if (p.getLocation().getY() <= 30){
                PotionEffect pot = new PotionEffect(
                        PotionEffectType.CONFUSION,
                        250,
                        2
                );
                p.addPotionEffect(pot);
            }
        }
    }
}
