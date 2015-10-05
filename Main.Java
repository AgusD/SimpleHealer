
package com.agusd.simplehealer;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    
    public static Main instance;
    
    @Override
    public void onEnable() {
        instance = this;
        
        this.getCommand("k").setExecutor(new Kill(this));
        this.getLogger().info("El plugin se ha cargado");
}
    
    @Override
    public void onDisable() {
        this.getLogger().info("El plugin se ha descargado");
    }
    

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(label.equalsIgnoreCase("h"));
            if (sender.hasPermission("sh.h")) {
                p.setHealth(20D);
                p.setFoodLevel(20);
                p.sendMessage(ChatColor.AQUA+"Has sido curado magicamente.");
        } else {
                p.sendMessage(ChatColor.DARK_RED+"No tienes permisos!");
            }
        
        
        
        
        return true;  
    }    
    
}
    

