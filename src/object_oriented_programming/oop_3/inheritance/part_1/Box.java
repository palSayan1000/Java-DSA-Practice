package object_oriented_programming.oop_3.inheritance.part_1;

public class Box {
    double length;
    double height;
    double width;
    private double ll;
    double weight = 9.9;

    Box() {
        // super(); // calling super() in parent class // object class
        // Class Object is the root of the class hierarchy.
        // Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.
        // this happens when you call super in parent class
        // the super() keyword also works in multi level inheritance
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    // cube
    Box(double side) {
        this.height = this.width = this.length = side;
    }

    // normal
    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    // passing old box
    Box(Box old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
