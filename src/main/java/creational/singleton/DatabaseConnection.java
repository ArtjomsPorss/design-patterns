package creational.singleton;

public class DatabaseConnection {
    private static DatabaseConnection connection;

    private DatabaseConnection() {}

    public static DatabaseConnection get(){
        if(connection == null) {
            connection = new DatabaseConnection();
        }
        return connection;
    }

    public Object execute(String sqlQuery) {
        // db call
        return "done";
    }
}
