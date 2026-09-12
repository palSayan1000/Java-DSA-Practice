package dsa.stacks_queues.understanding_and_notes.implementation.stack;

public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is Full !!!");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot Pop From An Empty Stack Bitch!!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot Peek From An Empty Stack Bitch!!!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
