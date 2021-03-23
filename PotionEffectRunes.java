package com.effects1;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PotionEffectRunes implements Listener {
    private final Main main;

    public PotionEffectRunes(Main main) {
        this.main = main;
    }
    @EventHandler
    public void mainMethod(PlayerInteractEvent e){
        Player p = e.getPlayer();
        Inventory inv = p.getInventory();
        PotionEffect potion = new PotionEffect(
                PotionEffectType.SLOW_FALLING,
                750,
                1
        );
        PotionEffect potion2 = new PotionEffect(
                PotionEffectType.REGENERATION,
                750,
                3
        );
        PotionEffect potion3 = new PotionEffect(
                PotionEffectType.ABSORPTION,
                750,
                10
        );
        if (inv.contains(Material.GRASS_BLOCK)) p.addPotionEffect(potion);
        else if (inv.contains(Material.POISONOUS_POTATO)) p.addPotionEffect(potion2);
        else if (inv.contains(Material.PURPLE_STAINED_GLASS_PANE)) p.addPotionEffect(potion3);
    }
}
