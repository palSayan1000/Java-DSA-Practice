package object_oriented_programming.oop_5.creating_own_anotations;

public class Dog {
    String name;
    int age;

    public Dog(String name) { this.name = name; }

//    @Constructor // if u place constructor here it gives error
    public void eat() {
       System.out.println("Bhow Bhow");
    }

    public void printName() {
        System.out.println(name);
    }

    @RunImmediately
    public void bark() {
       System.out.println("Bark Bitch!");
    }
}
