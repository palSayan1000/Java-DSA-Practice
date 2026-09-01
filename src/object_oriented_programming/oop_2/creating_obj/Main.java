package object_oriented_programming.oop_2.creating_obj;

public class Main {
    static void main() {
//        Human sayan = new Human(19, "Sayan Pal", 1_00_00_000, false),
//                kunal = new Human(22, "Kunal Kushwaha", 10_000, false),
//                rahul = new Human(34, "Rahul", 15_000, true);
//        System.out.println(Human.population);
        Main m = new Main();
        m. fun2();
    }

    void greeting() {
        System.out.println("Hello World");
    }

    static void func() {
//        greeting();
        Main obj = new Main();
        obj.greeting();
        // you cannot access without referencing there instances in a static context
        // hence i am referencing it
    }
    void fun2() {
        greeting();
    }
}