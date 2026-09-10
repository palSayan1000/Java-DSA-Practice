package multithreading_and_concurrency.intro.inter_thread_communication;

public class Demo {
    static void main() {
        Box box = new Box ();

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

class Box {
    Integer item;
    Boolean flag = false;

    void producer (int value) {
        item = value;
        flag = true;
        System.out.println("Producer produces: " + item);
    }

    void consumer () {
        System.out.println("Consumer consumes: " + item);
        item = null;
        flag = false;
    }

}
