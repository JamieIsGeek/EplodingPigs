package dev.jamieisgeek.exploding_pigs;

import dev.jamieisgeek.exploding_pigs.events.ExplodingPigsListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Exploding_Pigs extends JavaPlugin {

    private static Exploding_Pigs plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic

        Logger logger = Bukkit.getLogger();
        

        getServer().getPluginManager().registerEvents(new ExplodingPigsListener(), this);

        logger.info("=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        logger.info("Exploding Pigs is Enabled");
        logger.info("Creator: JamieIsGeek");
        logger.info("Version: 1.0");
        logger.info("=+=+=+=+=+=+=+=+=+=+=+=+=+=+");

    }

    @Override
    public void onDisable() {
        Logger logger = Bukkit.getLogger();

        logger.info("=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
        logger.info("Exploding Pigs is Disabled");
        logger.info("Creator: JamieIsGeek");
        logger.info("Version: 1.0");
        logger.info("=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
    }
}
