package chn.gnaris.database;

import chn.gnaris.database.database.Database;
import org.bukkit.plugin.java.JavaPlugin;

import java.sql.Connection;
import java.sql.SQLException;

public class Main extends JavaPlugin {

    private Database database;

    @Override
    public void onEnable() {
         this.database = new Database();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        return this.database.getDatabase();
    }
}
