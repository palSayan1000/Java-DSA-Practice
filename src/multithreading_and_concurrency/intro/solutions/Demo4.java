package multithreading_and_concurrency.intro.solutions;

public class Demo4 {
    public static void main(String[] args) {
        Counter_ count = new Counter_();

        Runnable incrementTask = () -> {
            for (int i = 1; i <= 10_000; i++)
                count.increment();
        };

        Thread t1 = Thread.ofPlatform().name("Thread-1").priority(5).daemon(false).start(incrementTask);
        Thread t2 = Thread.ofPlatform().name("Thread-2").priority(5).daemon(false).start(incrementTask);

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException _) {}

        System.out.println(count.count); // Always 20000, because increment() is synchronized
    }
}

class Counter_ {
    public int count = 0;

    // so i can use both a synchronized method or a synchronized block
    // it is better only to use synchronized block as synchronized as a over head
    /**/ void increment() { // critical section — only one thread at a time
        // normal code

        synchronized (this) { // Here only the part in the method that needs to be synchronized that is being synchronized
            count++; // 3 operations
        }

        // normal code
    }
}