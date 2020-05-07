package behavioural.chain_of_responsibility;

public interface IFilter {
    void doFilter(Request request, Response response);
}
