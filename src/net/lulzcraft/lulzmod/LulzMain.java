package net.lulzcraft.lulzmod;

import org.bukkit.plugin.PluginManager;

import net.lulzcraft.lulzmod.commands.Command_lam;
import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import net.pravian.aero.config.YamlConfig;
import net.pravian.aero.plugin.AeroPlugin;
import net.pravian.aero.util.Loggers;

public class LulzMain extends AeroPlugin<LulzMain> {

    public static LulzMain plugin;

    public static AeroCommandHandler handler;
    public Loggers logger;
    public static YamlConfig config;

    @Override
    public void load() {
        LulzMain.plugin = this;

        Loggers.info("[Utils] Loading!");
        this.config = new YamlConfig(plugin, "config.yml", true);
    }

    @Override
    public void enable() {

        LulzMain.plugin = this;

        // Load Configs
        config.load();

        // Register command class 
        handler = new SimpleCommandHandler(plugin);
        handler.setCommandClassPrefix("Command_");
        handler.loadFrom(Command_lam.class.getPackage());
        handler.registerAll(handler.getCommandClassPrefix(), true);

        // Register Listeners
        final PluginManager pm = plugin.getServer().getPluginManager();

        Loggers.info("[LulzAero] Enabling v1.1 by Adaptified and Prozza!");
    }

    @Override
    public void disable() {

        LulzMain.plugin = this;

        // Save
        Loggers.info("[LulzAero] Disabling!");
    }

}
