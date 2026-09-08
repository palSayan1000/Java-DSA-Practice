package multithreading_and_concurrency.intro.methods;

import org.w3c.dom.ls.LSOutput;

public class Demo6 {
    static void main() {
        Thread t1 = new Thread ( () -> {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
        });
        t1.setName("Paully Da");
        t1.start ();
    }
}
/*
    currentThread() --> is a static method and provides the reference of the current running thread
 */
