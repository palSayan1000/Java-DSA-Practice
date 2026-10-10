package multithreading_and_concurrency.intro.completablefuture;

import java.util.concurrent.CompletableFuture;

public class Demo {
    static void main() {
//        completablefuture<Integer> f1 =
//                completablefuture.supplyAsync(() -> 10)
//                        .thenApply(result -> result * 2);

//        completablefuture<Void> f1 =
//                completablefuture.supplyAsync(() -> 10)
//                        .thenAccept(System.out::println);
//                        .thenAccept(result -> System.out.println(result));

//        completablefuture<Void> f1 =
//                completablefuture.supplyAsync(() -> 10)
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