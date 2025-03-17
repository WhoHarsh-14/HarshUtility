package me.harsh.harshutility;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class HarshUtility extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("EZ4ENCE STARTED!");
    }

    public static String colorize(String raw){
        return ChatColor.translateAlternateColorCodes('&', raw);
    }
}
