package multithreading_and_concurrency.intro.methods;

public class Demo5 {
    static void main() {
        Thread t1 = new Thread(() -> {
            sleep(0, 500);
        });
        System.out.println(t1.isAlive()); // false
        t1.start();
        System.out.println(t1.isAlive()); // true
//        System.out.println(t1.toString());
//        System.out.println(t1.getState());
        try {
            sleep(1000);
        } catch (InterruptedException _) {
        }
        System.out.println(t1.isAlive()); // false
    }

    static void sleep(int milliseconds, int nanoseconds) {
        try {
            Thread.sleep(milliseconds, nanoseconds);
        } catch (InterruptedException _) {
        }
    }

    static void sleep(int milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }
}
/*
    isAlive() ---> START - to - TERMINATED -> out thread is alive(true) else it is dead(false)
 */
