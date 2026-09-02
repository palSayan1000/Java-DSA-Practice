package object_oriented_programming.oop_3.polymorphism;

public class Square extends Shapes {
    @Override
    void area() {
        System.out.println("I am in Square");
        System.out.println("Area is square of sides");
    }
}
