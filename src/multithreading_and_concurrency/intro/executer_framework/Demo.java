package multithreading_and_concurrency.intro.executer_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    static void main() {

        // Executor framework
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // number of task = 5
        for (int i = 1; i < 5; i++) {
            int finalI = i;
            executor.execute(() -> {
                System.out.println("Task : " + finalI + " is performed by : " +
                        Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
