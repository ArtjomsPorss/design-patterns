package behavioural.chain_of_responsibility;

import java.util.Map;

public class CachedResponseFilter implements IFilter {

    private Map<String, String> cache;

    @Override
    public void doFilter(Request request, Response response) {
        if(cache.containsKey(request.getRequestData())) {
            response.setResponseData(cache.get(request.getRequestData()));
            return;
        }
    }
}
