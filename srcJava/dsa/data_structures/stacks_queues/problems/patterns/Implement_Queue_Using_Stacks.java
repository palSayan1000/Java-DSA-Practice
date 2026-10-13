package dsa.data_structures.stacks_queues.problems.patterns;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/description/
public class Implement_Queue_Using_Stacks {
    static void main() {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println("peek: " + queue.peek());   // expected 1
        System.out.println("pop: " + queue.pop());      // expected 1
        System.out.println("empty: " + queue.empty());  // expected false
        System.out.println("pop: " + queue.pop());      // expected 2
        System.out.println("empty: " + queue.empty());  // expected true
    }
}
// Push Efficiently

class MyQueue {

    private final Stack<Integer> main;
    private final Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        while (!main.empty())
            helper.push(main.pop());
        int val = helper.pop();
        while (!helper.empty())
            main.push(helper.pop());
        return val;
    }

    public int peek() {
        while (!main.empty())
            helper.push(main.pop());
        int val = helper.peek();
        while (!helper.empty())
            main.push(helper.pop());
        return val;
    }

    public boolean empty() {
        return main.empty();
    }
}

// Remove Efficiently

// import java.util.Stack;
//
//public class QueueUsingStackRemove {
//  private Stack<Integer> first;
//  private Stack<Integer> second;
//
//  public QueueUsingStackRemove() {
//    first = new Stack<>();
//    second = new Stack<>();
//  }
//
//  public void add(int item) throws Exception {
//    while (!first.isEmpty()) {
//      second.push(first.pop());
//    }
//    first.push(item);
//    while (!second.isEmpty()) {
//      first.push(second.pop());
//    }
//  }
//
//  public int remove() throws Exception {
//    return first.pop();
//  }
//
//  public int peek() throws Exception {
//    return first.peek();
//  }
//
//  public boolean isEmpty() {
//    return first.isEmpty();
//  }
//
//}
/*
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
