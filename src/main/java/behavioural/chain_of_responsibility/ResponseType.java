package behavioural.chain_of_responsibility;

public enum ResponseType {
    OK(202), UNAUTHORISED(401), FORBIDDEN(403);

    private final int _code;

    private ResponseType(int code) {
        _code = code;
    }
}
