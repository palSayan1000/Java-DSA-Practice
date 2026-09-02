package object_oriented_programming.oop_3.inheritance.part_2;

public /* final */ class Box {
    // when you declare a class as final it implecitly declares all its methods final too
    double length;
    double height;
    double width;
    private double ll; // this is known as data hiding
    double weight = 9.9;

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!!!");
    }

    double getLL() {
        return ll;
    }

    Box() {
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
        // when old is receving the new BoxWeight obj it can only access the variables
        // that are there in the parent class (concept of the part_1.Main)
        // the accessing part depends on the Box old -> declaration not the object creation

        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information() {
        System.out.println("Running the box");
    }
}