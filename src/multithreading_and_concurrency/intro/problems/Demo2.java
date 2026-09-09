package multithreading_and_concurrency.intro.problems;

import java.util.concurrent.atomic.AtomicBoolean;

// Visibility Problem
public class Demo2 {
    // to avoid this visibility problem we use the keyword volatile
    // static volatile boolean flag = false; // true //forces every read/write to go through main memory (visibility fix only).

    // the volatile keywords states that when ever a
    // thread tries to read a value it will always read from the ram not from the cache
    // so in this case when ever thread 2 tries to read the value of the flag it will read it from the ram not from the
    // cache therefore avoiding the error of infinite loop

    // * the volatile keyword only solves this visibility problem not the race one it has no relation with the race problem

    static void main() {
        AtomicBoolean flag = new AtomicBoolean(false); // — internally, this also uses a volatile field under the hood, so you get the same visibility guarantee. But it wraps it in an object with atomic methods like get(), set(), compareAndSet().
        Thread t1 = new Thread ( () -> {
            try { Thread.sleep(1000); } catch (InterruptedException _) {}
            flag.set(true); // cache --> flag = true --> ram --> flag = true -> but thread two does not know this
        });

        Thread t2= new Thread ( () -> { // cache --> flag = false;
            while (!flag.get()); // this flag value is stored in cache so it is false even after the value in the ram has changed
            // the above is an infinite loop
                // System.out.println("Second Thread is Running!!!!"); //synchronized
            System.out.println("Thread two finished!!!!");
        });

        t1.start();
        t2.start();
    }
}
