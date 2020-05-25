package structural.decorator;

public class SMSNotification implements INotification {
    @Override
    public void send() {
        System.out.println("Send notification over SMS");
    }
}
