package object_oriented_programming.oop_3.polymorphism;

public class ObjectPrint /*extends Object*/ {
    // every class by default extends Object class
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        // overriding the inbuilt toString() method
        // this will be decided at runtime
        // runtime polymorphism
        System.out.println("ObjectPrint { num = " + num + " }");
        return super.toString();
    }

    static void main() {
        ObjectPrint obj = new ObjectPrint(10);
        System.out.println(obj);
    }
}
