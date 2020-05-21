package behavioural.iterator;

/**
 * Custom exception for our custom iterable.
 * Required to translated different internal out-of-bounds exceptions into common exception for common API purposes.
 */
public class OutOfElementsException extends RuntimeException {
    public OutOfElementsException(String message) {
        super(message);
    }
}
