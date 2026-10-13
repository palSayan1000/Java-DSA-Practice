package multithreading_and_concurrency.intro.creation_and_life_cycle;

public class Demo4 {
    static void main() {
        Thread t1 = new Thread(() -> {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            System.out.println(("Current Thread: " + Thread.currentThread().getClass()));
        });
//        t1.start(); // gives a new thread to the t1 obj to run
//        t1.setName("Sayan Pal"); // this set name has no order in execution
//        System.out.println(t1.getName());
//        System.out.println(t1.isAlive());
        // t1.setName("Sayan Pal");
        Thread.currentThread().setName("Palu da"); // converts the name of the current thread
        t1.run(); // this does not gives a new thread to the t1 and the things in the t1 runs in the main thread
    }
}

// start () or run ()
// can we start the same thread twice -> no Illegal thread safe exception
// one thread can only be started once and once it is run its life cycle ends
