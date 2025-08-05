package DesignPatterns.Builder.Assignments.dbconfig;

public class DatabaseConfiguration {

    private final String database_url;
    private final String userName;
    private final String password;
    private final String maxConnections;
    private final boolean enable_cache;
    private final boolean is_read_only;

    public DatabaseConfiguration(DatabaseBuilder builder){
        this.database_url = builder.getDatabase_url();
        this.userName = builder.getUserName();
        this.password = builder.getPassword();
        this.maxConnections = builder.getMaxConnections();
        this.enable_cache = builder.isEnable_cache();
        this.is_read_only = builder.isIs_read_only();
    }

    public String getDatabase_url() {
        return database_url;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnable_cache() {
        return enable_cache;
    }

    public boolean isIs_read_only() {
        return is_read_only;
    }
}
