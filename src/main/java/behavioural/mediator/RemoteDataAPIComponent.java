package behavioural.mediator;

public class RemoteDataAPIComponent implements IComponent {

    private IMediator mediator;


    public RemoteDataAPIComponent(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void notify(String message) {
        System.out.println("RemoteDataAPIComponent: getting data");
        mediator.perform(Actions.STORE_DATA, formatData(getData()));
    }

    private String getData() {
        //calling some URL to get data
        return "Data from the API";
    }

    private String formatData(String data) {
        return "FORMATTED " + data;
    }
}
