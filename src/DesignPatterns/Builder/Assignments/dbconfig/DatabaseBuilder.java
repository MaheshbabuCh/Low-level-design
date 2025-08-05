package DesignPatterns.Builder.Assignments.dbconfig;

public class DatabaseBuilder implements Builder{

    private String database_url;
    private String userName;
    private  String password;
    private String maxConnections;
    private boolean enable_cache;
    private boolean is_read_only;

    public DatabaseBuilder with_database_url(String database_url) {
        this.database_url = database_url;
        return this;
    }

    public DatabaseBuilder with_username(String userName) {
        this.userName = userName;
        return this;
    }

    public DatabaseBuilder with_password(String password) {
        this.password = password;
        return this;
    }

    public DatabaseBuilder setMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }

    public DatabaseBuilder setEnable_cache(boolean enable_cache) {
        this.enable_cache = enable_cache;
        return this;
    }

    public DatabaseBuilder setIs_read_only(boolean is_read_only) {
        this.is_read_only = is_read_only;
        return this;
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

    @Override
    public DatabaseConfiguration build() {
        return new DatabaseConfiguration(this);
    }
}
