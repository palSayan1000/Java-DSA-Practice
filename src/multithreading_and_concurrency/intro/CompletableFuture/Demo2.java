package multithreading_and_concurrency.intro.CompletableFuture;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Demo2 {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        ForkJoinPool pool = new ForkJoinPool();

        SumTask task = new SumTask(arr, 0, arr.length - 1);

        int result = pool.invoke(task);

        System.out.println(result);

        pool.shutdown();
    }
}

// Fork join pool
class SumTask extends RecursiveTask<Integer> {

    private int[] arr;
    private int start, end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // base condition
        if (end - start <= 2) {
            int sum = 0;
            for (int i = start; i <= end; i++)
                sum += arr[i];
            return sum;
        }
        // main logic --> fork
        int mid = start + (end - start) / 2;
        SumTask leftTask = new SumTask(arr, start, mid),
                rightTask = new SumTask(arr, mid + 1, end);

        leftTask.fork();
        int sum2 = rightTask.compute();
        // join
        int sum1 = leftTask.join();
        return sum1 + sum2;
    }
}