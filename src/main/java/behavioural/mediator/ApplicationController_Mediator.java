package behavioural.mediator;

public class ApplicationController_Mediator implements IMediator {
    IComponent remoteDataAPI;
    IComponent dataStorage;
    IComponent display;

    @Override
    public void perform(Actions action, String data) {
        switch (action) {
            case GET_DATA: remoteDataAPI.notify(""); break;
            case STORE_DATA: dataStorage.notify(data); break;
            case DATA_READY: display.notify(data); break;
            default: throw new UnsupportedOperationException("Operation not supported");
        }
    }

    @Override
    public void setup(IComponent remoteApi, IComponent storage, IComponent display) {
        this.remoteDataAPI = remoteApi;
        this.dataStorage = storage;
        this.display = display;
    }


}
