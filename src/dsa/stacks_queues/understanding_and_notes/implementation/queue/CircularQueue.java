package dsa.stacks_queues.understanding_and_notes.implementation.queue;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size ++;
        return true;
    }

    public int remove() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty Bitch!!!!");
        }

        int removed = data[front++];
        front = front % data.length;
        size --;

        return removed;
    }

    public int front() throws RuntimeException {
        if (isEmpty()) {
            throw new RuntimeException("Queue is Empty Bitch!!!");
        }

        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("The Circular Queue is Empty Bitch!!!!");
            return;
        }
        for (int i = front, count = 0; count < size; i = ++i % data.length, count ++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("End");
    }
}
