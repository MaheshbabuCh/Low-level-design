package DesignPatterns.Builder.Assignments.dbconfig;

public class dbconfig {

    public static void main(String[] args) {

        DatabaseConfiguration config = new DatabaseBuilder()
                .with_database_url("jdbc:postgresql://localhost:5432/mydb")
                .with_username("user")
                .with_password("password")
                .build();
    }
}
