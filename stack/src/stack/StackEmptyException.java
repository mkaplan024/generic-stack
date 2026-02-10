package stack;

/**
 * Thrown when an operation is performed on an empty stack.
 */
public class StackEmptyException extends RuntimeException {

    public StackEmptyException(String message) {
        super(message);
    }
}