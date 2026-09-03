package object_oriented_programming.oop_5.interfaces;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }
}
