package behavioural.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class CachedResponseFilter implements IFilter {

    private final WebController controller;
    private Map<String, String> cache;

    public CachedResponseFilter(WebController controller) {
        this.controller = controller;
        this.cache = new HashMap<>();
    }

    @Override
    public void doFilter(Request request, Response response) {
        if(cache.containsKey(request.getRequestData())) {
            response.setResponseData(getCached(request.getRequestData()));
        } else {
            this.controller.process(request, response);
            addToCache(request.getRequestData(), response.getResponseData());
        }
    }

    private void addToCache(String requestData, String responseData) {
        this.cache.put(requestData, responseData);
    }

    private String getCached(String requestData) {
        return this.cache.get(requestData);
    }
}
