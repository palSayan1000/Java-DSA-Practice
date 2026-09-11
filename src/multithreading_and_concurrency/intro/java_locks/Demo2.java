package multithreading_and_concurrency.intro.java_locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo2 {
    static void main() {
        SharedResource resource = new SharedResource();

        Thread.ofPlatform().name("First Thread Of Reading").start(resource :: read);
        Thread.ofPlatform().name("Second Thread Of Reading").start(resource :: read);
        Thread.ofPlatform().name("Third Thread Of Reading").start(resource :: read);

        Thread.ofPlatform().name("First Thread Of Writing").start( () -> resource.write(7));
        Thread.ofPlatform().name("First Thread Of Writing").start( () -> resource.write(5));
        Thread.ofPlatform().name("First Thread Of Writing").start( () -> resource.write(10));

    }
}

class SharedResource {

    ReadWriteLock rwLock = new ReentrantReadWriteLock();
    Lock writeLock = rwLock.writeLock(); // exclusive lock
    Lock readLock = rwLock.readLock(); // shared lock

    private int value = 0;

    public void read () {
        readLock.lock();
        try {
            sleep (1000);
            // return value;
            System.out.println(Thread.currentThread().getName() + " ---> Value Read ---> " + value);
        } finally {
            readLock.unlock();
        }
    }

    public void write (int newValue) {
        writeLock.lock();
        try {
            sleep(1000);
            value = newValue;
            System.out.println(Thread.currentThread().getName() + " ---> Value Wrote ---> " + value);
        } finally {
            writeLock.unlock();;
        }
    }

    public void sleep (int value) {
        try {
            Thread.sleep (value);
        } catch (InterruptedException _) {}
    }
}
