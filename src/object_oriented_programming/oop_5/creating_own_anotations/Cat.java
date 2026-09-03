package object_oriented_programming.oop_5.creating_own_anotations;

//@VeryImp
@VeryImp(value = "Extremely important", priority = 10)
public class Cat {
    String name;
    int age;

    // Annotated no-argument constructor
    @Constructors
    public Cat() {
        this.name = "Stray Cat";
        System.out.println("Executed: No-arg constructor");
    }

    @Constructors
    public Cat(String name) { this.name = name; }

    @RunImmediately
    public void eat() {
        System.out.println("Munch");
    }

    public void printName() {
        System.out.println(name);
    }

    public void meow() {
        System.out.println("Meow!");
    }
}