package structural.adapter;

/**
 * Adapter that accepts json message, transforms into XML and sends via legacy message service.
 * Takes in LegacyService
 */
public class JsonToXMLLegacyServiceAdapter implements IMessagingService {

    private IMessagingService legacyService;

    public JsonToXMLLegacyServiceAdapter(IMessagingService legacyService) {
        this.legacyService = legacyService;
    }

    private String transformJSONToXML(String json) {
        return "JSON changed to XML in Adapter: " + json;
    }

    /**
     * Accepts json, transforms to XML and sends via Legacy Service
     * @param json
     */
    @Override
    public void send(String json) {
        legacyService.send(transformJSONToXML(json));
    }
}
