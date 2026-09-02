package object_oriented_programming.oop_3.polymorphism;

public class Circle extends Shapes {
     @Override // this is called annotations // to check if a method is overridden or not
    // this is known as overriding
    // child class is overriding the func in the parent class
    // this func is getting priority
    void area() {
        // this will run when the object of Circle is created
//        / hence it is overriding the parent method
        System.out.println("I am in circle");
        System.out.println("Area is pie * r * r");
    }
}
