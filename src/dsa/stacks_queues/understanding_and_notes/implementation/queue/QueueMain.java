package dsa.stacks_queues.understanding_and_notes.implementation.queue;

public class QueueMain {
    static void main() {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
