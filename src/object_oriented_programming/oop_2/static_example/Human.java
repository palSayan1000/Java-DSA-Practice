package object_oriented_programming.oop_2.static_example;

public class Human {
    static long population;
    int age;
    String name;
    int salary;
    boolean married;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }
}
