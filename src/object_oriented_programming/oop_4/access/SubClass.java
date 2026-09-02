package object_oriented_programming.oop_4.access;

public class SubClass extends A{

    SubClass(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubClass obj = new SubClass(10, "Sayan Pal");
        obj.number = 20;// working // can access protected variables from the subclass of the same package
        // can also in different package
        // cannot access in the world -> different package and not subclass
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof SubClass);
        System.out.println(obj instanceof Object);
        // obj is an instance of A is a subclass of A
        // so indirectly belongs to type A as well
        Object ob = 67; // Boxing not requied auto boxing (new Integer(67) -> Integer.valueOf(67) -> 67 -> same due to auto boxing)
        System.out.println(ob instanceof String);
    }
}
class SubSubClass extends A{
    SubSubClass(int num, String name) {
        super(num, name);
    }
    static void main() {
        SubSubClass obj = new SubSubClass(10, "Sayan Pal");
        obj.number = 0; // sub-sub-class can also access protected variables
    }
}
class SubClass2 extends A{
    SubClass2(int num, String name) {
        super(num, name);
    }

    static void main() {
        SubClass2 obj = new SubClass2(10, "Sayan Pal");
        obj.number = 30;
    }
}