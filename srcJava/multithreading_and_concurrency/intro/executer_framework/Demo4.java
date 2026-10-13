package multithreading_and_concurrency.intro.executer_framework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo4 {
    static void main() {
        // ExecutorService executor = Executors.newFixedThreadPool(2);
        // Creating the above
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,
                5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));

        for (int i = 1; i <= 5; i++) {
            int finalI = i;

            executor.execute(() -> {
                System.out.println("Task : " + finalI + " is performed by : " +
                        Thread.currentThread().getName());
                try {
                    Thread.sleep(0, 1000);
                } catch (InterruptedException _) {
                }
            });
        }

        executor.shutdown();
    }
}
