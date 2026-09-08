package multithreading_and_concurrency.intro.thread_creation_and_life_cycle;

public class Demo3 {
    static void main() {
        // printing the name of the current thread (the name of the main thread)
        System.out.println(Thread.currentThread().getName()); // give the name of the current thread
//        System.out.println(Thread.currentThread().getId());     // works, but IDE will warn "deprecated"
//        System.out.println(Thread.currentThread().threadId());  // preferred going forward // gives the id of the current thread
        // but this has no value in real life as threads run in a non-deterministic way
        // threadId() -> introduced in java 19;

        // making my own thread
        Thread t1 = new Thread (() -> {
            System.out.println("Name of my first thread is: " + Thread.currentThread().getName());
            System.out.println("Id of my first thread is: " + Thread.currentThread().threadId());
        });
        Thread t2 = new Thread (() -> {
            System.out.println("Name of my second thread is: " + Thread.currentThread().getName());
            System.out.println("Id of my second thread is: " + Thread.currentThread().threadId());
        });
        t1.start(); // if i do not call thread my thread will never run;
        t2.start();
    }

    static void others () {
        System.out.println(Thread.currentThread()); // Thread.currentThread() -> gives the reference of the current thread that is the main thread

        System.out.println(Thread.currentThread().isAlive()); // checks if the thread is running
        // a thread is alive if it has started and not yet terminated

        System.out.println(Thread.currentThread().isDaemon()); // false
        // daemon thread is a low-priority background thread that provides supporting services to user threads

        System.out.println(Thread.currentThread().isInterrupted()); // checks if the running of thread is being interrupted

        System.out.println(Thread.currentThread().isVirtual()); // it returns false so it is scheduled by the OS
        // Returns true if this thread is a virtual thread. A virtual thread is scheduled by the Java virtual machine rather than the operating system
    }
}
// Thread ID and Thread name