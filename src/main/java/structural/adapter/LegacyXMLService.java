package structural.adapter;

public class LegacyXMLService implements IMessagingService {

    @Override
    public void send(String xml) {
        System.out.println("Sending message in XML format: " + xml);
    }
}
