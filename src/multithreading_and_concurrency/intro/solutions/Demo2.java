package multithreading_and_concurrency.intro.solutions;

public class Demo2 {
    static void main() {
        Test test = new Test();
        //Thread.ofPlatform() is a builder for creating platform threads
        // (the traditional OS-backed threads, as opposed to virtual threads).
        // It's part of the same Thread.Builder API introduced in Java 21 alongside
        // Thread.ofVirtual() — both implement the common Thread.Builder interface, just producing different thread types.

        /*Thread t1 = */Thread.ofPlatform().start(test::show);   // started immediately
        Thread t2 = Thread.ofPlatform().unstarted(test::show); // created, not started

        t2.start();
    }
    // old way ->

    // Thread t = new Thread(test::show);
    //  t.setName("worker-1");
    //  t.setPriority(5);
    //  t.setDaemon(true);
    //  t.start();

    // New Way Of Doing It Sleek Sexy Modern --> (Java 21+)
    // Thread.ofPlatform()          // returns a Thread.Builder.OfPlatform
    //      .name("worker-1")      // optional: name the thread
    //      .priority(5)           // optional: set priority
    //      .daemon(true)          // optional: mark as daemon
    //      .start(test::show);    // build + start in one call
}

class Test {

    synchronized void show () {
        System.out.println(Thread.currentThread().getName() + " --> Inside Show!!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException _) {}

        System.out.println(Thread.currentThread().getName() + " --> Show Finish!!");
    }

    public static void Test() {
    }
}