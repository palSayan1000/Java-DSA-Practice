package multithreading_and_concurrency.intro.java_locks;

import java.util.concurrent.locks.StampedLock;

public class Demo3 {
    static void main() {
        SharedResources resource = new SharedResources();

        Thread.ofPlatform().name("First Thread Of Reading").start(resource::read);
        Thread.ofPlatform().name("Second Thread Of Reading").start(resource::read);
        Thread.ofPlatform().name("Third Thread Of Reading").start(resource::read);

        Thread.ofPlatform().name("First Thread Of Writing").start(() -> resource.write(7));
        Thread.ofPlatform().name("First Thread Of Writing").start(() -> resource.write(5));
        Thread.ofPlatform().name("First Thread Of Writing").start(() -> resource.write(10));

    }
}

class SharedResources {

    StampedLock lock = new StampedLock();

    private int value = 0;

    public int read() {

        long stamp = lock.tryOptimisticRead();

        int currentVal = value;

        sleep(1000);

        if (!lock.validate(stamp)) {
            // fall-over logic
            // try pessimistic read
            stamp = lock.readLock();
            try {
                currentVal = value;
            } finally {
                lock.unlockRead(stamp);
            }
        }
        System.out.println(Thread.currentThread().getName() + " ---> Value Read ---> " + currentVal);
        return currentVal;
    }

    public void write(int newValue) {
        long stamp = lock.writeLock();
        try {
            sleep(1000);
            value = newValue;
            System.out.println(Thread.currentThread().getName() + " ---> Value Wrote ---> " + value);
        } finally {
            lock.unlockWrite(stamp);
        }
    }

    public void sleep(int value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException _) {}
    }
}
