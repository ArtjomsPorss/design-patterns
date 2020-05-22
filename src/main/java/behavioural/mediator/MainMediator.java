package behavioural.mediator;

public class MainMediator {
    public static void main(String[] args) {
        // setup
        IMediator mediator = new ApplicationController_Mediator();
        IComponent button = new ShowDataButtonComponent(mediator);
        IComponent remoteApi = new RemoteDataAPIComponent(mediator);
        IComponent storage = new DataStorageComponent(mediator);
        IComponent display = new DisplayComponent(mediator);
        mediator.setup(remoteApi, storage, display);

        // call
        button.notify("");
    }
}
