package multithreading_and_concurrency.intro.problems;

public class Demo {
    static void main() {
        Counter count = new Counter();

        // Thread t1 = new Thread (count::increment), t2 = new Thread (count :: increment);
        Thread t1 = new Thread ( () -> {
            for (int i = 1; i <= 10_000; i ++)
                count.increment();
        }), t2 = new Thread ( () -> {
            for (int i = 1; i <= 10_000; i ++)
                count.increment();
        });

        t1.start();
        t2.start();

        try {
            t1.join(); // when main thread executes this statement it goes into TIMED_WAIT state and stops till t1 executes
            t2.join();
        } catch (InterruptedException _) {}

        System.out.println(count.count); // Every time gives different ans due to race condition
    }
}
class Counter {
    public int count = 0;

    void increment () { // Critical section (as two threads can access it at the same time)
        count ++;// shared resource
    }
}
