package multithreading_and_concurrency.intro.solutions;

public class Demo7 {
    static void main() {
        Testing obj = new Testing();
        Thread.ofPlatform().name("Thread no. 1").priority(5).start(Testing::m1);
        Thread.ofPlatform().name("Thread no. 2").start(obj::m2);
    }
}

class Testing {
    static void m1() {
        synchronized (Testing.class) {
            System.out.println("M1 Entered : " + Thread.currentThread().getName());
            sleep();
            System.out.println("M1 Exit");
        }
    }

    static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException _) {
        }
    }

    void m2() {
        synchronized (this) {
            System.out.println("M2 Entered : " + Thread.currentThread().getName());
            sleep();
            System.out.println("M2 Exit");
        }
    }
}