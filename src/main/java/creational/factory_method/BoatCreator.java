package creational.factory_method;

public class BoatCreator implements ITransportCreator {

    @Override
    public ITransport createTransport() {
        return new Boat();
    }
}
