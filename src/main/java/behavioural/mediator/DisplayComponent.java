package behavioural.mediator;

public class DisplayComponent implements  IComponent {

    private IMediator mediator;

    public DisplayComponent(IMediator iMediator) {
        this.mediator = iMediator;
    }

    @Override
    public void notify(String message) {
        System.out.println("DisplayComponent displays data: " + message);
    }
}
