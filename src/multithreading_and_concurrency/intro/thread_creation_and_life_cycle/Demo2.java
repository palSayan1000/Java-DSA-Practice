package multithreading_and_concurrency.intro.thread_creation_and_life_cycle;
// Second types of creating threads
// Thread using Runnable Interface
public class Demo2 {
    static void main() {
        // Defining a task
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj); // in the thread class passing my obj (as a constructor)
        t1.start();
//        t1.start(); // gives  error in this line as the t1 is already running

    }
}
// Second types of creating threads
// Thread using Runnable Interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable interface");
    }
    public void run2(){
        System.out.println("My thread");
    }
}