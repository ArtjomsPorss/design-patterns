package structural.adapter;

/**
 * GoF Definition: Convert the interface of a class to another intherface that clients expect.
 * The adapter pattern lets classes work together that couldn't otherwise because of incompatible interfaces
 */
public class MainAdapterExample {
    public static void main(String[] args) {
        String jsonMessage = "JSON message";

        IMessagingService legacyService = new LegacyXMLService();
        IMessagingService jsonToXmlAdapter = new JsonToXMLLegacyServiceAdapter(legacyService);
        jsonToXmlAdapter.send(jsonMessage);
    }
}
