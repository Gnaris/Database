package chn.gnaris.database.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Connection db_sperias = null;

    public Connection getDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        if(this.db_sperias == null)
        {
            String host = "localhost";
            String database = "sperias";
            String username = "root";
            String password = "";
            this.db_sperias = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, username, password);
        }
        return this.db_sperias;
    }
}
