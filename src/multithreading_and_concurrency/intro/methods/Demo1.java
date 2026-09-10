package multithreading_and_concurrency.intro.methods;

public class Demo1 {
    static void main() {
        System.out.println("Main thread starts:-----> ");
        // Thread.sleep() -> cannot write here simple as it gives che ked exception and there will be compilation error
        try {
            Thread.sleep(2000);
        } catch (InterruptedException _) {
        }

        System.out.println("Main thread ends:------->");
    }
}
// Thread important methods
/*
    Thread.sleep(milliseconds) -> TIMED_WAITING
    RUNNABLE --> TIMED_WAITING --> RUNNABLE --> TERMINATED
 */