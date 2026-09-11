package multithreading_and_concurrency.intro.java_locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    static void main() {
        Resource r1 = new Resource();

        Thread.ofPlatform().start(r1 :: f1);
        Thread.ofPlatform().start(r1 :: f1);
        Thread.ofPlatform().start(r1 :: f1);
    }
}

class Resource {

    Lock lock = new ReentrantLock();

    void f1 () {
        lock.lock();

        try {
//            lock.lock();

            System.out.println(Thread.currentThread().getName() + " ---> Entered");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException _) {
            }

            System.out.println(Thread.currentThread().getName() + " ---> Exited");
        } finally {
            lock.unlock();
        }
    }
}