package multithreading_and_concurrency.intro.solutions;

public class Demo6 {
    static void main() {
        Runnable task = CounterBaby::increment;

        Thread t1 = Thread.ofPlatform()
                .name("Thread-1")
                .start(task);

        Thread t2 = Thread.ofPlatform()
                .name("Thread-2")
                .start(task);

        // Thread t1 = new Thread ( () -> Counter.increment()); --> using lambdas
    }
}

// Static Synchronization

class CounterBaby {

    static int count = 0;

    synchronized static void increment() { // here it is taking lock in class
        try {
            Thread.sleep(1000);
        } catch (InterruptedException _) {
        }
        count++;
        System.out.println(count);
        // or
//        synchronized (CounterBaby.class) { // taking lock in class for this block of statement of code
//            try { Thread.sleep(1000); } catch (InterruptedException _) {}
//            count ++;
//            System.out.println(count);
//        }
    }

    // static void increment() {
    //    synchronized (CounterBaby.class) {
    //        // method body
    //    }
    // }
}