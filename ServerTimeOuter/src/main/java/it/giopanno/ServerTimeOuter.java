package it.giopanno;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Date;

public final class ServerTimeOuter extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        new BukkitRunnable(){

            public void run() {
                Date date = new Date(System.currentTimeMillis());
                if (date.getHours() == 6 && date.getMinutes() == 0) {
                    Bukkit.shutdown();
                }
            }
        }.runTaskTimer(this, 1200L, 1200L);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
