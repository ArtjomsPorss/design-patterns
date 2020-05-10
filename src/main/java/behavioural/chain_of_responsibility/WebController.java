package behavioural.chain_of_responsibility;

public class WebController {
    /**
     * Performs some work on request and returns a response
     * @param request
     * @param response
     */
    public void process(Request request, Response response) {
        // dummy work, just reverses request string
        response.setResponseData(new StringBuilder(request.getRequestData()).reverse().toString());
    }
}
