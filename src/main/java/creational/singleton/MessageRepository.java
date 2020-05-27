package creational.singleton;

public class MessageRepository {

    private static MessageRepository repo;

    private MessageRepository(){}

    public static MessageRepository get() {
        if(null == repo) {
            repo = new MessageRepository();
        }
        return repo;
    }

    public void save(String message, String user) {
        System.out.println(String.format("Saving message[%s] for user[%s]", message , user));
        DatabaseConnection.get().execute("SQL query inserting the message");
    }
}
