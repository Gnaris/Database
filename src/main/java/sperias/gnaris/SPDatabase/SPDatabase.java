package sperias.gnaris.SPDatabase;

import org.bukkit.plugin.java.JavaPlugin;
import sperias.gnaris.database.Database;

public class SPDatabase extends JavaPlugin {

    private Database SPDatabase;

    @Override
    public void onEnable() {
         this.SPDatabase = new Database();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public Database getSPDatabase()
    {
        return this.SPDatabase;
    }
}
