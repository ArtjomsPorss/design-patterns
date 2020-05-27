package creational.singleton;

/**
 * GoF Definition: Ensure the class has only one instance and provide a global point of access to it.
 * Singleton is the object which must be of only one instance in whole application.
 *
 * Here Singletons are UserRepository, MessageRepository and DatabaseConnection. It is used in both repository classes - called on demand.
 */
public class MainSingletonExample {
    public static void main(String[] args) {

        String user = UserRepository.get().getUser("someuser");
        MessageRepository.get().save("somemessage", user);
    }
}
