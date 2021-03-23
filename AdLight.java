package com.effects1;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class AdLight implements Listener {
    private final Main main;

    public AdLight(Main main) {
        this.main = main;
    }
    @EventHandler
    public void netherMethod(PlayerInteractEvent e){
        Player p = e.getPlayer();
        Inventory inv = p.getInventory();
        World w = p.getWorld();
        PotionEffect pot = new PotionEffect(
                PotionEffectType.GLOWING,
                750,
                10
        );
        if (w.getWorldFolder().getName().equalsIgnoreCase("world_nether")){
            if (inv.contains(Material.NETHERITE_SCRAP)){
                p.addPotionEffect(pot);
            }
        }
    }
}
