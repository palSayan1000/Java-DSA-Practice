package object_oriented_programming.oop_2.creating_obj;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    public static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
        Human.message();
    }

    static void message() { // part of theclass not the part of the object
        System.out.println("Hello World!");
//        System.out.println(this.name); // you cannot use this inside static as it does not contains an instance
    }
}