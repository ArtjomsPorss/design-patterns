package behavioural.mediator;

public interface IMediator {
    void perform(Actions action, String data);

    void setup(IComponent remoteApi, IComponent storage, IComponent display);
}
