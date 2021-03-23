package com.effects1;

import jdk.nashorn.internal.ir.Block;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {
    private final Main main;
    Silverfish sv;
    Spider sp;
    Creeper cr;
    Zombie zm;
    Enderman em;

    public BlockBreak(Main main) {
        this.main = main;
    }
    @EventHandler
    public void blockMethod(BlockBreakEvent e){
        Player p = e.getPlayer();
        World w = p.getWorld();
        Location loc = e.getBlock().getLocation();
        if (e.getBlock().getType() == Material.STONE){
            sv = w.spawn(loc, Silverfish.class);
        }
        else if (e.getBlock().getType() == Material.BLACK_BED){
            sp = w.spawn(loc, Spider.class);
            w.strikeLightning(loc);
        }
        else if (e.getBlock().getType() == Material.GREEN_BED ||
                e.getBlock().getType() == Material.LIME_BED
        ){
            cr = w.spawn(loc, Creeper.class);
            w.strikeLightning(loc);
        }
        else if (e.getBlock().getType() == Material.PURPLE_BED ||
                e.getBlock().getType() == Material.PINK_BED){
            em = w.spawn(loc, Enderman.class);
            w.strikeLightning(loc);
        }
        else if (e.getBlock().getType() == Material.BROWN_BED) {
            zm = w.spawn(loc, Zombie.class);
            w.strikeLightning(loc);
        }

    }
}
