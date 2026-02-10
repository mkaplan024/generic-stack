package stack;

/**
 * Test class for the generic Stack.
 * Tests a number stack and a text stack.
 */
public class StackTest {

    public static void main(String[] args) {

        // Test with Integer stack
        System.out.println("Testing Integer Stack");
        Stack<Integer> numberStack = new Stack<>(3);

        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);

        System.out.println("Stack content: " + numberStack.list());
        System.out.println("Peek: " + numberStack.peek());
        System.out.println("Pop: " + numberStack.pop());
        System.out.println("After pop: " + numberStack.list());

        try {
            numberStack.push(40);
        } catch (StackFullException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println();

        // Test with String stack
        System.out.println("Testing String Stack");
        Stack<String> textStack = new Stack<>(2);

        textStack.push("Hello");
        textStack.push("World");

        System.out.println("Stack content: " + textStack.list());
        System.out.println("Peek: " + textStack.peek());
        System.out.println("Pop: " + textStack.pop());
        System.out.println("After pop: " + textStack.list());

        try {
            textStack.pop();
            textStack.pop();
        } catch (StackEmptyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
