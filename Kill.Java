package com.agusd.simplehealer;

import com.agusd.simplehealer.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {
    
    private final Main plugin; 
    
    public Kill(Main instance) {
        plugin = instance;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(label.equalsIgnoreCase("k")) ;
        if(sender.hasPermission("sh.k")){
            p.setHealth(0D);
            p.sendMessage(ChatColor.GOLD+"Has muerto!");
                    
        } else {
            p.sendMessage(ChatColor.DARK_RED+"No tienes permisos!");
        }
        return true;
    }
    
}
