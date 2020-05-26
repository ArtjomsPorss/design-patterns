package structural.adapter;

public interface IMessagingService {

    /**
     * Sends message in XML format
     * @param xml
     */
    public void send(String xml);
}
