package multithreading_and_concurrency.intro.solutions;

public class Demo3 {
    static void main() {
        Tester obj = new Tester();
        Thread.ofPlatform().name("Thread no. 1").priority(5).start(obj :: m1);
        Thread.ofPlatform().name("Thread no. 2").start(obj :: m2);
    }
}

class Tester {
    synchronized void m1 () {
        System.out.println("M1 Entered : " + Thread.currentThread().getName());
        sleep();
        System.out.println("M1 Exit");
    }
    synchronized void m2 () {
        System.out.println("M2 Entered : " + Thread.currentThread().getName());
        sleep();
        System.out.println("M2 Exit");
    }
    void sleep () {
        try {
            Thread.sleep (2000);
        } catch (InterruptedException _) {}
    }
}