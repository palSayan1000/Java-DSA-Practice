package object_oriented_programming.oop_3.inheritance.part_2;

public class Main {
    static void main() {
//        Box box5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.length + "  " + box5.width + "  " + box5.height);
        // reference type (Box) decides what's accessible, not the actual object type (BoxWeight)

        BoxPrice box = new BoxPrice();
        Box box1 = new Box();
        int temp = (int) box1.getLL();
//        box1.greeting();
//        Box.greeting(); // convention
        Box boxW = new BoxWeight();
        boxW.greeting(); // calls the one of the parent class
        // why because it is static not dependent on objects it is beyond objects
        // so static methods can be inherited but not overriden

        BoxWeight box2 = new BoxWeight();
        box2.greeting(); // calls the one of the child class
    }
}