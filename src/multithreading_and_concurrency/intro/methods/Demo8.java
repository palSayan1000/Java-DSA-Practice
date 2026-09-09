package multithreading_and_concurrency.intro.methods;

public class Demo8 {
    static void main() {
        Thread t1 = new Thread ( () -> { // just a normal thread
            while (true)
                System.out.println("Running Bitch!!!!"); // even though the main threads stops running it will not stop as one thread is running
        });

        t1.setDaemon(true); // made it a daemon thread // and declared it as a background running task so when the main thread stops t1 will also stop
        // t1.start();
        try { Thread.sleep(0, 1); } catch (InterruptedException _) {}

                // Start immediately
        // another way of declaring visual threads
        Thread thread = Thread.ofVirtual().start(() -> { // started and declared the thread on the go
            System.out.println("Running in a virtual thread");
        });

        // Or create without starting
        Thread thread1 = Thread.ofVirtual().unstarted(() -> { // using unstarted
            System.out.println("Virtual thread created");
        });
//        thread1.start();
        // For a quick start, Java 21 provides a static convenience method:
        Thread.startVirtualThread(() -> {
            System.out.println("Running in a virtual thread");
        });
    }
}
/*
    Daemon Threads --> Background running threads are called daemon threads
    ---> Stop immediately when the main thread is completed

    Threads ---> User threads, Daemon threads ( till now all the threads that we made are called daemon threads )

    Garbage Collection --> runs on the daemon thread -> background running task

 */