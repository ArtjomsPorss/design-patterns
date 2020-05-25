package structural.decorator;

public class AppNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Send notification over App");
    }
}
