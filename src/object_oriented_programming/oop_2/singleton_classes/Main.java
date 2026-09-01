package object_oriented_programming.oop_2.singleton_classes;

public class Main {
    static void main() {
//        Singleton obj = new Singleton();
        // i cannot access it as the Singleton class is private
        // why it is a private constructor you cannot call it
        //
        // the way to get the instance
        Singleton obj = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        Singleton obj4 = Singleton.getInstance();
        // here only one object is created in the memory
        // in no way you can call the constructor so no new object is created
        // here obj = obj2 = obj3 = obj4 -> all points to the same instance
    }
}
