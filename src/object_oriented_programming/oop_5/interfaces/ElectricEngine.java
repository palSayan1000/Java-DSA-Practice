package object_oriented_programming.oop_5.interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerate");
    }

    @Override
    public void type() {
        System.out.println("Electric Engine");
    }
}
