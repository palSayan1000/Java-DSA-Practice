package object_oriented_programming.oop_3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();
        Triangle triangle = new Triangle();

//        shape.area();
//        circle.area();
        square.area();
//        triangle.area();

        // Polymorphism -> the act of representing the same thing in multiple ways
        // the multiple constructor in the inheritance examples are also an example of the polymorphism
    }
}
