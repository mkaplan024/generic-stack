package stack;

/**
 * Thrown when an element is pushed onto a full stack.
 */
public class StackFullException extends RuntimeException {

    public StackFullException(String message) {
        super(message);
    }
}