package behavioural.chain_of_responsibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnauthorisedRequestFilter implements IFilter {

    private class TimeCount {
        public final long _startingTime;
        public int count;

        public TimeCount() {
            this._startingTime = now();
            count = 1;
        }
    }

    /**
     * Max requests allowed during timespan
     */
    private final int MAX_REQUESTS = 3;
    private final long TIMESPAN = 3000;


    /**
     * Contains IP, Starting Time, Request Count
     */
    private Map<String, TimeCount> log;

    private static List<String> blockedIps = new ArrayList<>();

    public UnauthorisedRequestFilter() {
        this.log = new HashMap<>();
    }

    @Override
    public void doFilter(Request request, Response response) {
        if(isIpBlocked(request.getIp())) {
            return;
        } else if (log.containsKey(request.getIp())) {
            TimeCount timeCount = log.get(request.getIp());
            // compare times
            if(now() - timeCount._startingTime < TIMESPAN && timeCount.count >= MAX_REQUESTS) {
                // multiple requests during short period
                blockedIps.add(request.getIp());
            } else {
                // incorrect requests are not during short period - reset counter
                resetTimer(request.getIp());
            }
        } else {
            log.put(request.getIp(), new TimeCount());
        }
    }

    private long now() {
        return System.currentTimeMillis();
    }

    private void resetTimer(String ip) {
        this.log.put(ip, new TimeCount());
    }

    public boolean isIpBlocked(String ip) {
        return blockedIps.contains(ip);
    }


}




























