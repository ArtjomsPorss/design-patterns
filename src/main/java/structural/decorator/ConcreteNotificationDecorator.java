package structural.decorator;

public class ConcreteNotificationDecorator extends AbstractNotificationDecorator {
    private INotification thisDecoratorBehavior;

    public ConcreteNotificationDecorator(INotification thisBehavior, INotification wrapee) {
        this.thisDecoratorBehavior = thisBehavior;
        setNotification(wrapee);
    }

    @Override
    public void send() {
        this.thisDecoratorBehavior.send();
        super.send();
    }
}
