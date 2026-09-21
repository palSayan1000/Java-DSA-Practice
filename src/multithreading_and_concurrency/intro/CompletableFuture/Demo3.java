package multithreading_and_concurrency.intro.CompletableFuture;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo3 {
    static void main() {
        // Thread t1 = Thread.ofVirtual().start(() -> System.out.println(Thread.currentThread()));
        ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        for (int i = 1; i <= 5; i++) {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException _) {}

        executor.shutdown();
    }
}
