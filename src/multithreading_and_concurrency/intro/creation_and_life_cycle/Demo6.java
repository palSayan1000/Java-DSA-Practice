package multithreading_and_concurrency.intro.creation_and_life_cycle;

public class Demo6 {
    static void main() {
        // Thread creation stages ->

        // Thread new stage
        Thread  mainThread = Thread.currentThread(),
                t1 = new Thread(() -> {
            System.out.println("Name of the current thread: " + Thread.currentThread().getName());
            System.out.println("Main Thread State: " + mainThread.getState());// TIMED_WAITING
        });
        System.out.println(t1.getState());
        // Runnable stage
        t1.start();
        System.out.println(t1.getState()); // RUNNABLE, BLOCKED, TERMINATED

        try {
            Thread.sleep(2000 /* 1 -> also works */); // main thread sleeping
        } catch (Exception e) {}

        System.out.println(t1.getState()); // TERMINATED
//        while (t1.getState() != Thread.State.TERMINATED) // The terminated is an Enum variable in the state
//            System.out.println(t1.getState());
    }
}
// Thread lifecycle