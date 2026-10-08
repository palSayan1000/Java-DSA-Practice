package multithreading_and_concurrency.intro.executer_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo3 {
    static void main() {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> {
            int x = 10 / 0; // exception lost in runnable task
        });

        Future<Integer> f1 = executor.submit(() -> {
            return 10 / 0;
        });

        try {
            System.out.println(f1.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();
    }
}
