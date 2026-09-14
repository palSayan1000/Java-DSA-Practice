package multithreading_and_concurrency.intro.lock_free_concurrency.part_1;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo {
    static void main() throws InterruptedException {
        Counter count = new Counter();
        Runnable task = () -> {
            for (int i = 1; i <= 10_000; i++)
                count.increment();
        };

        Thread t1 = Thread.ofPlatform().start(task),
            t2 = Thread.ofPlatform().start(task), t3 = Thread.ofPlatform().start(task);

        t1.join();
        t2.join();

        System.out.println(count.count);
    }
}

// Atomic Integer
class Counter {
    // int count = 0;
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.incrementAndGet(); // ++count
    }
}

// t1 & t2 --> concurrently
// t1 & t2 --> parallel

// CAS --> Compare and set operations