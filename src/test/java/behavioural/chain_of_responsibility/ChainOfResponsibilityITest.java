package behavioural.chain_of_responsibility;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ChainOfResponsibilityITest {

    private static IFilter filters;

    @BeforeAll
    public static void chainSetup() {
        IFilter unauthorised = new UnauthorisedRequestFilter();
        IFilter cached = new CachedResponseFilter(new WebController());
        filters = new LoginFilter(cached, unauthorised);
    }


    @Test
    public void testBanIp() {
        Request q1 = new Request("127.113.10.1", AuthenticationTypes.NONE, "Request Data");
        Response s1 = new Response();
        filters.doFilter(q1, s1);
        assertTrue(s1.getResponseType() == ResponseType.UNAUTHORISED, "Response type must be UNAUTHORISED");
        filters.doFilter(q1, s1);
        assertTrue(s1.getResponseType() == ResponseType.UNAUTHORISED, "Response type must be UNAUTHORISED");
        filters.doFilter(q1, s1);
        assertTrue(s1.getResponseType() == ResponseType.UNAUTHORISED, "Response type must be UNAUTHORISED");
        filters.doFilter(q1, s1);
        assertTrue(s1.getResponseType() == ResponseType.FORBIDDEN, "Response type must be FORBIDDEN");
    }

    @Test
    public void testLoginUserResponseOk() {
        Request q1 = new Request("127.113.10.1", AuthenticationTypes.USER, "Request Data");
        Response s1 = new Response();
        filters.doFilter(q1, s1);
        assertTrue(s1.getResponseType() == ResponseType.OK, "Response type must be OK");
    }

    @Test
    public void testResponseProcessed() {
        Request q1 = new Request("127.113.10.1", AuthenticationTypes.USER, "Request Data");
        Response s1 = new Response();
        filters.doFilter(q1, s1);
        assertTrue(s1.getResponseData().equals(new StringBuilder(q1.getRequestData()).reverse().toString())
                , "Response data must be equal to reversed request data");
    }
}
