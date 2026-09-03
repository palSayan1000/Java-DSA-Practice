package multithreading_and_concurrency.intro.thread_creation_and_life_cycle;
// First Type of Creating Threads
// using Thread Class
public class Demo {
    static void main() {
        // Threads
        // Defining a task
        MyThread t1 = new MyThread();
        t1.start();// main thread continues here and the t1 thread continues the MyThread class
    }
}
// First Type of Creating Threads
// -> By extending Thread class
// The thread class internally implements the runnable interface
class MyThread extends Thread {
    @Override
    public void run(){ // overriding the in-built method that is already in thread class
        // logic here
        System.out.println("Thread is Running!!!");
    }
}
/*
// Internally what is happening
    t1.start();
    ----> JVM aks OS to create a new thread --> Thread gets Stack/PC space
    --> Thread execute run method
 */