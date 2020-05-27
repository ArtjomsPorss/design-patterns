package creational.singleton;

public class UserRepository {
    private static UserRepository repo;

    private UserRepository() {}

    public static UserRepository get() {
        if(repo == null) {
            repo = new UserRepository();
        }
        return repo;
    }

    public String getUser(String name) {
        System.out.println(String.format("Getting user[%s]", name));
        DatabaseConnection.get().execute("SQL to get user by name");
        // assuming it returned a user
        return "someuser";
    }

}
