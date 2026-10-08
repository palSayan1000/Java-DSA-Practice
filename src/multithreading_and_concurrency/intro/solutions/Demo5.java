package multithreading_and_concurrency.intro.solutions;

public class Demo5 {
    static void main() {
        Bank axis = new Bank();

        Thread.ofPlatform().start(axis::deposit);
        Thread.ofPlatform().start(axis::withdraw);

//        Thread.ofPlatform().start(axis :: m1);
//        Thread.ofPlatform().start(axis :: m1);
    }
}

class Bank {

    Object lock1 = new Object(), lock2 = new Object();

    // With this type of execution threads can enter both the methods at the same time as well cannot overlap each other
    void deposit() {
        synchronized (lock1) {
            System.out.println("Deposit Logic!!!");
            sleep(2000);
            System.out.println("Deposit Done!!!");
        }
    }

    void withdraw() {
        synchronized (lock2) {
            System.out.println("Withdraw Logic!!!");
            sleep(2000);
            System.out.println("Withdraw Done!!!");
        }
    }

    void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException _) {
        }
    }

    /*synchronized*/ void m1() {
        synchronized (new Object() /*this*/ /*lock1*/) {
            System.out.println(Thread.currentThread().getName() + " --> Entered M1");
            sleep(2000);
            System.out.println(Thread.currentThread().getName() + " --> Exits M1");
        }
    }
}
