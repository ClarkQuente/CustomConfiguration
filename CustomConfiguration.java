package me.clarkquente.API;

import me.clarkquente.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class CustomConfiguration {

    private File file;
    private FileConfiguration fileConfiguration;

    private String name;

    public CustomConfiguration(String name) {
        this.name = name;
        this.file = new File(Main.getInstance().getDataFolder(), name.endsWith(".yml") ? name : name + ".yml");
        this.fileConfiguration = YamlConfiguration.loadConfiguration(file);

        if(!file.exists()) {
            try {
                Main.getInstance().saveResource(name.endsWith(".yml") ? name : name + ".yml", false);
            } catch (IllegalArgumentException e) {

                try {
                    file.createNewFile();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        }
    }

    public FileConfiguration getConfig() {
        return fileConfiguration;
    }

    public void save() {
        try {
            fileConfiguration.save(file);
        } catch (IOException e) {
            Bukkit.getConsoleSender().sendMessage("§cOcorreu um erro ao salvar o arquivo " + name);
        }
    }

}
