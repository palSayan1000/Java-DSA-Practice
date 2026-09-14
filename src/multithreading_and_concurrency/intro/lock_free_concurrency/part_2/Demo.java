package multithreading_and_concurrency.intro.lock_free_concurrency.part_2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Demo {
    static void main() {
        LikeCounter likeCount = new LikeCounter();

        for (int i = 100; i > 0; i--)
            Thread.ofPlatform().start(likeCount :: like);

        try { Thread.sleep(1000); } catch (InterruptedException _) {}

        System.out.println("Total Likes Baby: " + likeCount.get());
    }
}

class LikeCounter {

    // private final AtomicReference<Integer> totalCount;
    private final AtomicInteger totalCount;

    LikeCounter() {
        totalCount = new AtomicInteger(0);
    }

    public void like() {
        totalCount.incrementAndGet(); // its internal execution is below
//        while(true) {
//            // 1st point we will capture the latest value of total count
//            Integer currentCount = totalCount.get();
//
//            // 2nd increment like counter by 1
//            Integer finalCount = currentCount + 1;
//
//            // 3rd check again, if the count is still what i saw
//            if (totalCount.compareAndSet(currentCount, finalCount))
//                return;
//
//            // 4th if a thread reaches here, someone else must have updated the counter
//            // re-try
//            System.out.println("Conflict Detected Bitch. Re-Trying......");
//        }
//        totalCount.set(totalCount.get() + 1); -> will not work as race condition will appear
    }

    public int get() {
        return totalCount.get();
    }

}
