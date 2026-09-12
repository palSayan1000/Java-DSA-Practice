package dsa.stacks_queues.understanding_and_notes;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltExamples_Queue {
    static void main() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
