package creational.factory_method;

import java.util.HashMap;
import java.util.Map;

public class MainFactoryMethod {
    public static void main(String[] args) {
        ITransport truck = TransportFactory.make(TransportTypes.truck);
        ITransport boat = TransportFactory.make(TransportTypes.boat);

        truck.deliver();
        boat.deliver();
    }
}