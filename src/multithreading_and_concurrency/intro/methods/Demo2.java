package multithreading_and_concurrency.intro.methods;

public class Demo2 {
    static void main() throws InterruptedException {
        System.out.println("Main Thread starts: ");

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "----> Starts");
        });

        t1.start();

        t1.join(); // let the t1 thread first complete its execution then the main thread will continue
        t1.join(1000); // this is like wait for one second for the t1 thread to finish if it finishes it is fine but it it does not then continue execution

        System.out.println("Main Thread ends: ");
    }
}
/*
    // join()
    // When the main thread sees the join method
    Main Thread --> WAITING
    t1 Thread --> RUNNABLE --> TERMINATED
    Main Thread --> WAITING --> RUNNABLE --> TERMINATED
 */