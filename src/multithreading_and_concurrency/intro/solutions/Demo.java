package multithreading_and_concurrency.intro.solutions;

// Using synchronized keyword -----> solution for the race condition that occurs in non-atomic operation
public class Demo {
    static void main() {
        Counter count = new Counter();

        // Thread t1 = new Thread (count::increment), t2 = new Thread (count :: increment);
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10_000; i++)
                count.increment();
        }), t2 = new Thread(() -> {
            for (int i = 1; i <= 10_000; i++)
                count.increment();
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // when main thread executes this statement it goes into TIMED_WAIT state and stops till t1 executes
            t2.join();
        } catch (InterruptedException _) {
        }

        System.out.println(count.count); // Every time gives different answer due to race condition
    }
}

class Counter {
    public int count = 0;

    // as it is declared synchronized only one thread will enter at a time and complete all the autonomic operations then leave
    // it cannot leave without completing the three atomic task in the middle like it was doing before without the synchronized keyword
    // and in this part of the program only one thread will run at a time
    synchronized void increment() { // Critical section (as two threads can access it at the same time)
        count++;// shared resource
    }
}
