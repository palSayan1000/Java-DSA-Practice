package multithreading_and_concurrency.intro.CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Demo {
    static void main() {
//        CompletableFuture<Integer> f1 =
//                CompletableFuture.supplyAsync(() -> 10)
//                        .thenApply(result -> result * 2);

//        CompletableFuture<Void> f1 =
//                CompletableFuture.supplyAsync(() -> 10)
//                        .thenAccept(System.out::println);
//                        .thenAccept(result -> System.out.println(result));

//        CompletableFuture<Void> f1 =
//                CompletableFuture.supplyAsync(() -> 10)
//                        .thenRun(() -> System.out.println("Done"));
//        try {
//            System.out.println(f1.get());
//        } catch (Exception _){}

        // thenCombine
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10),
                f2 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<Void> f3 = f1.thenCombine(f2, Integer::sum)
                .thenAccept(System.out::println);
    }
}
// fork - join pool executor