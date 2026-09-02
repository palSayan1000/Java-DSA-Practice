package object_oriented_programming.oop_3.polymorphism;

import java.awt.*;

public class Triangle extends Shapes {
    @Override
    void area() {
        System.out.println("I am in triangle");
        System.out.println("Area is 0.5 * h * b");
    }
}
