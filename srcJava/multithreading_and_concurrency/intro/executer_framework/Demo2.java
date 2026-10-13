package multithreading_and_concurrency.intro.executer_framework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo2 {
    static void main() throws InterruptedException, ExecutionException {
        // Future and Callable

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(() -> {
            Thread.sleep(1000);
            return 10;
        });

        System.out.println(f1.get());
        executor.shutdown();
    }
}
