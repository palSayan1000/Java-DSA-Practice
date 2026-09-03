package object_oriented_programming.oop_5.interfaces;

public interface Engine {
    int a = 10;
    final static int PRICE = 780_000;
    // it is by default static and final

    void start();
    void stop();
    void acc();
    void type();
}
