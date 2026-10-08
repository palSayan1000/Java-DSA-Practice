package multithreading_and_concurrency.intro.methods;

public class Demo4 {
    static void main() {
        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted())
                System.out.println("Running!!!!");
        });
        t1.start();
        try {
            Thread.sleep(0, 500);
        } catch (InterruptedException _) {
        }
        // any thread that is in join, sleep, wait cannot be interrupted cannot be called on that thread then it gives InterruptedException
        // Sleeping the thread in nano seconds
//        System.nanoTime(); // getting the time in nao seconds
//        System.currentTimeMillis(); // getting the time in milliseconds
        t1.interrupt();
    }
}
/*
    Thread --> every thread has a flag inside called interrupt() (default false)

    t1.interrupt() --> not a static method -> Sends a signal to t1 thread that it should stop doing what its doing.
    t1.interrupt() goes and makes the default to true

    We can gracefully handle
    ---> You can make a thread run until a condition
    ---> Cancelling a long running task
    ---> Used to stop our thread pool

    isInterrupted() or interrupted()

    isInterrupted() --> returns interrupt flag value(True/False);
    interrupted() --> return interrupt flag value (T/F) but also set it back to false;

    --> sleep(), join(), wait() : TIMED_WAITING, WAITING --> interrupt() method
 */
