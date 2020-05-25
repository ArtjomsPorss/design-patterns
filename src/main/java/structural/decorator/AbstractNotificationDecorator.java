package structural.decorator;

public abstract class AbstractNotificationDecorator implements INotification {
    private INotification decorated;

    protected void setNotification(INotification notification) {
        this.decorated = notification;
    }

    @Override
    public void send() {
        if(this.decorated != null ) {
            this.decorated.send();
        }
    }

}
