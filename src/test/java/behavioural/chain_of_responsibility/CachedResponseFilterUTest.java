package behavioural.chain_of_responsibility;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class CachedResponseFilterUTest {

    @Test
    public void testCachedResponseIsReturned() {
        // create mock controller
        WebController controller = Mockito.mock(WebController.class);
        IFilter crFilter = new CachedResponseFilter(controller);

        // setup request/response
        Request q1 = new Request("127.113.10.1", AuthenticationTypes.NONE, "Request Data");
        Response s1 = new Response();
        // call filter with data 2 times
        crFilter.doFilter(q1, s1);
        crFilter.doFilter(q1, s1);
        // expect controller to be called only first time, as then data is cached and for second request with same data cached response comes back
        verify(controller, times(1)).process(q1, s1);
    }
}
