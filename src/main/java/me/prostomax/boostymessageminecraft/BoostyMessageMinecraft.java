package me.prostomax.boostymessageminecraft;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class BoostyMessageMinecraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getScheduler().scheduleSyncRepeatingTask(this, () -> {
            for (Player player : Bukkit.getOnlinePlayers()) {
                String playerName = player.getName();
                player.sendMessage(ChatColor.YELLOW + "----------------------");
                player.sendMessage(ChatColor.YELLOW + "Привет, " + playerName + "!");
                player.sendMessage(ChatColor.YELLOW + "Хочешь помочь проекту развиваться быстрее?");
                player.sendMessage(ChatColor.YELLOW + "Тогда зови друзей на проект!");
                player.sendMessage(ChatColor.YELLOW + "Также ты можешь помочь нам в финансовом плане.");
                player.sendMessage(ChatColor.YELLOW + "Подробности по ссылкам ниже:");
                player.sendMessage(ChatColor.YELLOW + "----------------------");
                player.sendMessage(ChatColor.YELLOW + "Бусти Томата:");
                player.sendMessage(ChatColor.RED + "https://boosty.to/sortoftomats");
                player.sendMessage(ChatColor.YELLOW + "Бусти Макса:");
                player.sendMessage(ChatColor.RED + "https://boosty.to/prostomax_mt");
                player.sendMessage(ChatColor.YELLOW + "----------------------");

            }
        }, 600, 72000);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
