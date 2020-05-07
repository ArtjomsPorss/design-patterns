package behavioural.chain_of_responsibility;

public class MainChainOfResponsibility {
    public static void main(String[] args) {
        IFilter unauthorised = new UnauthorisedRequestFilter();
        IFilter cached = new CachedResponseFilter();
        IFilter login = new LoginFilter(cached, unauthorised);

        // TODO implement test
    }
}
