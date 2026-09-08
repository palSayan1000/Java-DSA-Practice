package multithreading_and_concurrency.intro.methods;

public class Demo7 {
    static void main() {
        Thread t1 = new Thread ( () -> {
            System.out.println("Custom thread running!!!");
        });
        t1.start();
        System.out.println(t1.getPriority());
        t1.setPriority(10);
        System.out.println(t1.getPriority());
        // Higher priority does not give a garenty that it will run first it is whole decided by the os and the os can ignore the priority
    }
}
/*
    Thread Priority
    In threads in Java Threads can have three types of Priority --->
    MAX_PRIORITY = 10
    MIN_PRIORITY = 1
    NORM_PRIORITY = 5 -> NORMAL ONE

    Depends on OS
    -> may respect Priority
    -> may partially respect
    -> may not at all
 */
