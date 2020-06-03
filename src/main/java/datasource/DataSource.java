package datasource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSource {
    private final static HikariConfig config = new HikariConfig("src/main/resources/datasource.properties");
    private static final HikariDataSource db = new HikariDataSource(config);

   /* static {
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        config.setUsername("postgres");
        config.setPassword("password");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
        db = new HikariDataSource(config);
    }

    private DataSource() {
    }*/

    public static Connection getConnection() throws SQLException {
        return db.getConnection();
    }
}
