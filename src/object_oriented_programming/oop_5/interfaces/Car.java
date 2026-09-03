package object_oriented_programming.oop_5.interfaces;

public class Car implements Engine, Media, Brake, CarType{
    int a = 100;
    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void type() {
        System.out.println("I am a normal car");
    }

    @Override
    public void brake() {
        System.out.println("I brake like a notmal car");
    }
}