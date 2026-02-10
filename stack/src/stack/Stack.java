package stack;

/**
 * A generic stack implementation using an array.
 * The stack follows the LIFO principle (Last In, First Out).
 *
 * @param <T> the type of elements stored in the stack
 */
public class Stack<T> {

    private Object[] elements;
    private int top;

    /**
     * Creates a stack with default capacity of 10.
     */
    public Stack() {
        this(10);
    }

    /**
     * Creates a stack with the given capacity.
     *
     * @param capacity maximum number of elements
     */
    public Stack(int capacity) {
        elements = new Object[capacity];
        top = 0;
    }

    /**
     * Pushes an element onto the stack.
     *
     * @param value element to push
     * @throws StackFullException if the stack is full
     */
    public void push(T value) {
        if (top == elements.length) {
            throw new StackFullException("Stack is full");
        }
        elements[top++] = value;
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return top element
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        T value = (T) elements[--top];
        elements[top] = null;
        return value;
    }

    /**
     * Returns the top element without removing it.
     *
     * @return top element
     * @throws StackEmptyException if the stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() {
        if (top == 0) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top - 1];
    }

    /**
     * Returns all elements as a single string separated by semicolons.
     *
     * @return string representation of the stack
     */
    public String list() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < top; i++) {
            result.append(elements[i]);
            if (i < top - 1) {
                result.append(";");
            }
        }
        return result.toString();
    }
}