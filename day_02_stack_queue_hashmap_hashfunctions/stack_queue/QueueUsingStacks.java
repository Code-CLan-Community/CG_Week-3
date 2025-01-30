import java.util.Stack;

public class QueueUsingStacks {
    private final Stack<Integer> inputStack = new Stack<>();
    private final Stack<Integer> outputStack = new Stack<>();

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.peek());    // Output: 2
    }

    // Enqueue operation
    public void enqueue(int x) {
        inputStack.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (outputStack.isEmpty()) {
            if (inputStack.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }

    // Peek front element
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}


