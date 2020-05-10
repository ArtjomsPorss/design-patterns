package behavioural.chain_of_responsibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnauthorisedRequestFilter implements IFilter {

    private class RequestCounter {
        public final long _startingTime;
        public int count;

        public RequestCounter() {
            this._startingTime = now();
            this.count = 1;
        }

        public void increment() {
            this.count += 1;
        }
    }

    /**
     * Max requests allowed during timespan
     */
    private final int MAX_REQUESTS = 3;
    private final long TIMESPAN = 10000;


    /**
     * Contains IP, Starting Time, Request Count
     */
    private Map<String, RequestCounter> requestLog;

    private static List<String> blockedIps = new ArrayList<>();

    public UnauthorisedRequestFilter() {
        this.requestLog = new HashMap<>();
    }

    @Override
    public void doFilter(Request request, Response response) {
        if(isIpBlocked(request.getIp())) {
            response.setResponseType(ResponseType.FORBIDDEN);
        } else if (requestLog.containsKey(request.getIp())) {
            RequestCounter timeCount = requestLog.get(request.getIp());
            // compare times
            long timeDiff = now() - timeCount._startingTime;
            if (timeDiff < TIMESPAN && timeCount.count >= MAX_REQUESTS) {
                // multiple requests during short period
                setBlocked(request.getIp(), response);
            } else if (timeDiff < TIMESPAN && timeCount.count < MAX_REQUESTS) {
                // yet another unauthorised request, but within time and MAX_REQUESTS limits
                timeCount.increment();
            } else {
                // incorrect requests are not during short period - restart timer
                resetTimer(request.getIp());
                setUnauthorised(response);
            }
        } else {
            startTimer(request.getIp());
            setUnauthorised(response);
        }
    }

    private long now() {
        return System.currentTimeMillis();
    }

    private void resetTimer(String ip) {
        this.requestLog.put(ip, new RequestCounter());
    }

    public boolean isIpBlocked(String ip) {
        return blockedIps.contains(ip);
    }

    private void setBlocked(String ip, Response response) {
        blockedIps.add(ip);
        response.setResponseType(ResponseType.FORBIDDEN);
    }

    private void setUnauthorised(Response response) {
        response.setResponseType(ResponseType.UNAUTHORISED);
    }

    private void startTimer(String ip) {
        requestLog.put(ip, new RequestCounter());
    }
}




























