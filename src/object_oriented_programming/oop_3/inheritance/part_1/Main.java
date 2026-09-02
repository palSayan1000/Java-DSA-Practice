package object_oriented_programming.oop_3.inheritance.part_1;

public class Main {
    static void main() {
//        Box box1 = new Box(), box2;
//        //  with the object of the parent class you cannot access the things in child class
        // so you can only access above untill and unless it is private
//        System.out.println(box.length + "\t" + box.width + "\t" + box.height);

//        BoxWeight box3 = new BoxWeight();

//        BoxWeight box4 = new BoxWeight(2, 3, 4, 6); // error as parent constructor not called

//        System.out.println(box3.height + " " + box3.width + " " + box3.length + " " + box3.weight);

        Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.length + "  " + box5.width + "  " + box5.height);
        // can access the members of the box class;

//        System.out.println(box5.weight);
        // you cannot do this
        // -> point -> it is important to understand that it is actually the type of the reference variable
        // Box box5 -> this part -> that determeans what members can be accessed

        // if i try the reverse
        // there are many variables in both parent and child classes
        // you are given access to variables that are in the reference type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means that the ones you are trying to access should be initialized
        // but here when the object itself is of type parent class how will you call the constructor of child class

//        BoxWeight obj = new Box(2, 3, 4, 8);// hence it is giving error

        // that is why the above gives error // parent class has no idea about weight
        // the above classes doesnot know what classes are below but the below class know what classes are above
    }
}
