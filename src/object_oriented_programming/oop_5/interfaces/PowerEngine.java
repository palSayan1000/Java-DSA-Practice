package object_oriented_programming.oop_5.interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine acc");
    }

    @Override
    public void type() {
        System.out.println("Family Power Engine");
    }
}
