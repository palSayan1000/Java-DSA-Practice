package multithreading_and_concurrency.intro.methods;

public class Demo3 {
    static void main() {
        Thread t1 = new Thread ( () -> {
            for (int i = 1; i <= 10; i ++) {
                System.out.println("T1 : " + i);
//                Thread.yield();
            }
        });

        Thread t2 = new Thread ( () -> {
//            try {t1.join();} catch (InterruptedException _){}
            for (int i = 1; i <= 10; i ++)
                System.out.println("T2 : " + i);
        });

        t1.start();
        t2.start();
//        Thread t2 = new Thread (t1);
//        t1.start();
//        t2.start();
    }
}
/*
    Thread.yield(); // Very interesting method that is never using in production
    (it is a static method)
    ----> Meaning -> I am willing to give my cpu time  to someone else with same priority and that wants to run

    ---> Why not used in production as the operating system can reject this
    --> This method is just a request --> a suggestion to the OS
    --> Current thread does not go to WAITING, TIMED_WAITING, BLOCKED.
    --> It does only go to RUNNABlE state
 */
