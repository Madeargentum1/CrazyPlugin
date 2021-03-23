package com.effects1;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        getLogger().info("m Enabled!");
        Bukkit.getPluginManager().registerEvents(new setPlayerHP(this), this);
        Bukkit.getPluginManager().registerEvents(new doNotMine(this), this);
        Bukkit.getPluginManager().registerEvents(new BedrockTP(this), this);
        Bukkit.getPluginManager().registerEvents(new PotionEffectRunes(this), this);
        Bukkit.getPluginManager().registerEvents(new AdLight(this), this);
        Bukkit.getPluginManager().registerEvents(new EatEye(this), this);
        Bukkit.getPluginManager().registerEvents(new DoNotFly(this), this);
        Bukkit.getPluginManager().registerEvents(new End(this), this);
        Bukkit.getPluginManager().registerEvents(new SlowAndHero(this), this);
        Bukkit.getPluginManager().registerEvents(new BlockBreak(this), this);
        Bukkit.getPluginManager().registerEvents(new CheckInWater(this), this);
    }
    public void onDisable(){
        getLogger().info("I'm disabled!");
    }
}
