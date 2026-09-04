package object_oriented_programming.oop_6.cloning.shallow;

public class Human implements Cloneable{
    // implements Cloneable -> just tells the jvm that there is method clone in this class and is allowed to clone
    // the Cloneable interface is empty inside
    public int age;
    public String name;
    int[] arr;

    public Human() {
        this.age = 0;
        this.name = "";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        arr = new int[] {3, 4, 5, 6, 0, 1, 9};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = new int[5];
    }

    @Override
    public Object clone() throws CloneNotSupportedException{ // the clone method throws and exception
        return super.clone(); // this is actually doing shallow copy of the object
    }
}
