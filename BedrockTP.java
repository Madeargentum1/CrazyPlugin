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

public class BedrockTP implements Listener {
    private final Main main;

    public BedrockTP(Main main) {
        this.main = main;
    }
    @EventHandler
    public void tpMethod(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        Location loc2 = new Location(
                p.getWorld(),
                loc.getX(),
                -10,
                loc.getZ()
        );
        Block b = loc.getBlock();
        PotionEffect potion = new PotionEffect(
                PotionEffectType.INCREASE_DAMAGE,
                100,
                20
        );
        if (b.getType() == Material.BEDROCK) p.teleport(loc2);
        else if (b.getType() == Material.CACTUS) p.addPotionEffect(potion);
    }
}
