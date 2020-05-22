package behavioural.mediator;

public class ShowDataButtonComponent implements IComponent{

    private IMediator mediator;

    public ShowDataButtonComponent(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void notify(String message) {
        System.out.println("ShowDataButtonComponent: clicking button to view data");
        mediator.perform(Actions.GET_DATA, "");
    }
}
