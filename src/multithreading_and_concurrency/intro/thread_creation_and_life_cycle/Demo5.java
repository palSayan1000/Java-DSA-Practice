package multithreading_and_concurrency.intro.thread_creation_and_life_cycle;

public class Demo5 {
    static void main() {
        // 1 to 100 (even numbers)
        Thread t1 = new Thread ( () -> {
            for (int i = 0; i < 100; System.out.println("T1: " + (i += 2)));
        });

        // 1 to 100 (odd numbers)
        Thread t2 = new Thread ( () -> {
            for (int i = -1; i < 100-1; System.out.println("T2: " + (i += 2)));
        });

        t1.start();
        t2.start();
//        Thread t2 = new Thread(t1);
//        t1.start();
//        t2.start();
    }
}

// Execution order -> Non determinism (property)