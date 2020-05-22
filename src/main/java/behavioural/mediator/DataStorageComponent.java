package behavioural.mediator;

public class DataStorageComponent implements IComponent {

    private final IMediator mediator;

    public DataStorageComponent(IMediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public void notify(String message) {
        System.out.println("DataStorageComponent: storing data");
        // code to store the data
        mediator.perform(Actions.DATA_READY, message);
    }
}
