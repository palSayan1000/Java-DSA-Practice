package multithreading_and_concurrency.intro.inter_thread_communication;

public class Demo3 {
    static void main() {
        Boxing box = new Boxing();

        Runnable task1 = () -> {
            for (int i = 1; i <= 20; i++)
                box.producer(i);
        }, task2 = () -> {
            for (int i = 1; i <= 20; i++)
                box.consumer();
        };

        Thread.ofPlatform().start(task1);
        Thread.ofPlatform().start(task2);
    }
}

class Boxing {
    volatile Integer item;
    volatile Boolean flag = false;

    synchronized void producer(int value) {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException _) {
            }
        }
        item = value;
        flag = true;
        System.out.println("Producer produces: " + item);
        notify();
    }

    synchronized void consumer() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException _) {
            }
        }
        System.out.println("Consumer consumes: " + item);
        item = null;
        flag = false;
        notify();
        // notifyAll();
    }

}
