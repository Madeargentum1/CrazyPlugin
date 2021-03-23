package com.effects1;

import net.minecraft.server.v1_16_R3.ItemStack;
import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EatEye implements Listener {
    private final Main main;

    public EatEye(Main main) {
        this.main = main;
    }
    @EventHandler
    public void eatMethod(PlayerInteractEvent e){
        Action ac = e.getAction();
        Player p = e.getPlayer();
        PotionEffect pot = new PotionEffect(
                PotionEffectType.FIRE_RESISTANCE,
                250,
                1
        );
        if (!e.hasItem()) return;
        if ((e.getAction() != Action.RIGHT_CLICK_AIR) && (e.getAction() != Action.RIGHT_CLICK_BLOCK)) return;
        org.bukkit.inventory.ItemStack item = e.getItem();
        if (item.getType() == Material.SPIDER_EYE) {
            p.addPotionEffect(pot);
        }
    }
}
