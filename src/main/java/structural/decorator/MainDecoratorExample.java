package structural.decorator;

/**
 * GoF Definition: Attach additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 *
 * INotification is base interface for actual functionality such as EmailNotification, SMSNotification..
 * INotification has one method X.
 * AbstractNotificationDecorator implements INotification and has a field with INotificaiton
 * AbstractNotificationDecorator has method X as INotification and delegates call to field INotification.
 * ConcreteNotificationDecorator takes in concrete notification such as EmailNotification and
 * other decorator.
 *
 * ConcreteNotificationDecorator calls X on its own INotification and then calls X on decorated INotification
 * This way decorator not just calls method X on its own,
 * but also expands functionality calling X on a wrapped INotification
 */
public class MainDecoratorExample {
    public static void main(String[] args) {
        INotification email = new EmailNotification();
        INotification sms = new SMSNotification();
        INotification app = new AppNotification();
        INotification smsDec = new ConcreteNotificationDecorator(sms, null);
        INotification appDec = new ConcreteNotificationDecorator(app, smsDec);
        INotification emailDec = new ConcreteNotificationDecorator(email, appDec);

        System.out.println("::: Decorator Example :::");
        emailDec.send();
    }
}
