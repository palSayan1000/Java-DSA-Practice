package dsa.stacks_queues.understanding_and_notes;

import java.util.ArrayDeque;
import java.util.Deque;

public class InBuiltExamples_Deque {
    static void main() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();
        // etc etc
    }
}
