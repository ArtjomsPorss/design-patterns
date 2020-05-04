package creational.factory_method;

public class TruckCreator implements ITransportCreator {
    @Override
    public ITransport createTransport() {
        return new Truck();
    }
}
