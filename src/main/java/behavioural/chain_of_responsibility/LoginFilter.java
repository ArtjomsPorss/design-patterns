package behavioural.chain_of_responsibility;

public class LoginFilter implements IFilter {

    private final IFilter _next;
    private final IFilter _unauthorised;

    public LoginFilter(IFilter next, IFilter unauthorised){
        this._next = next;
        this._unauthorised = unauthorised;
    }

    @Override
    public void doFilter(Request request, Response response) {
        if (request.getAuthenticationType() == AuthenticationTypes.NONE) {
            return;
        } else {
            if(null != this._next) {
                _next.doFilter(request, response);
            }
        }

    }
}
