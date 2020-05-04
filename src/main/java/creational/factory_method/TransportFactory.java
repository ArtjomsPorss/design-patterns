package creational.factory_method;

import java.util.HashMap;
import java.util.Map;

public class TransportFactory {
    private static Map<TransportTypes, ITransportCreator> factories = new HashMap<>();
    static {
        factories.put(TransportTypes.truck, new TruckCreator());
        factories.put(TransportTypes.boat, new BoatCreator());
    }
    public static ITransport make(TransportTypes transportType) throws UnsupportedOperationException {
        ITransportCreator creator = factories.get(transportType);
        if(creator == null) {
            throw new UnsupportedOperationException();
        }
        return creator.createTransport();
    }
}
