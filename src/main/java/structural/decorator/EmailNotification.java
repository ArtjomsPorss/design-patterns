package structural.decorator;

public class EmailNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Send notification over Email");
    }
}
