package com.effects1;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SlowAndHero implements Listener {
    private final Main main;

    public SlowAndHero(Main main) {
        this.main = main;
    }
    @EventHandler
    public void method2(PlayerMoveEvent e){
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
        if (b.getType() == Material.HAY_BLOCK){
            p.addPotionEffect(pot);
        }
        else if (b.getType() == Material.GRAVEL){
            p.addPotionEffect(pot2);
            p.addPotionEffect(pot3);
        }
    }
}
