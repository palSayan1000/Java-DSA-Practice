package object_oriented_programming.oop_2.singleton_classes;

public class Singleton {
    // classes where only one object can be created
    // if you want to only create only one object you should not allow it to
    // call the constructor of the class
    // and u want to stop people from creating new object
    // hence you should not allow then to use the construtor
    // what i will do it to make it private
    private Singleton() {
        // private basically means it will be used in this file only
        // in this class only basically
        // you can call the constructor in this fileonly
    }
    private static Singleton instance;
    public static Singleton getInstance() {
        // check wheather if one object iscreated or not
        if (instance == null) {
            instance = new Singleton(); // since its private it can be called in the same file
        }
        return instance;
    }
    static void main() {
        Singleton obj = new Singleton();
        // can only create the obj inthis file only
    }
}
