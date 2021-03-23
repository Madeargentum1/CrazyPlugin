package com.effects1;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DoNotFly implements Listener {
    private final Main main;

    public DoNotFly(Main main) {
        this.main = main;
    }
    @EventHandler
    public void method(PlayerMoveEvent e){
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        Block b = loc.getBlock();
        PotionEffect pot = new PotionEffect(
                PotionEffectType.HERO_OF_THE_VILLAGE,
                10,
                1
        );
        PotionEffect pot2 = new PotionEffect(
                PotionEffectType.SLOW,
                750,
                2
        );
        PotionEffect pot3 = new PotionEffect(
                PotionEffectType.SLOW_DIGGING,
                750,
                5
        );
        if (loc.getY() >= 160){
            p.sendMessage(ChatColor.AQUA + "Кислородное голодание!");
            p.addPotionEffect(pot2);
            p.addPotionEffect(pot3);
        }

    }
}
