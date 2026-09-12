package dsa.stacks_queues.understanding_and_notes.implementation.queue;

public class CustomQueue {
    private final int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty Bitch!!!!!");
        }

        int removed = data[0];
        // shifting the elements to left
        System.arraycopy(data, 1, data, 0, end - 1);
        end --;

        return removed;
    }

    public int front() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty Bitch!!!!");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }
}
