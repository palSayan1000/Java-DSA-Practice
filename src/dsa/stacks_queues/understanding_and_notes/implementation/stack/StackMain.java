package dsa.stacks_queues.understanding_and_notes.implementation.stack;

public class StackMain {
    static void main() throws StackException {
//        CustomStack stack = new CustomStack(5);
//        stack.push(34);
//        stack.push(45);
//        stack.push(2);
//        stack.push(9);
//        stack.push(18);
        CustomStack stack = new DynamicStack(3);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
