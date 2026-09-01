package object_oriented_programming.oop_2.static_example;

public class Main {
    static void main() {
        Human sayan = new Human(19, "Sayan Pal", 1_00_00_000, false),
                kunal = new Human(22, "Kunal Kushwaha", 10_000, false),
                rahul = new Human(34, "Rahul", 15_000, true);
//        System.out.println(sayan.population);// dont do it
        System.out.println(Human.population);// this is the convention
//        greeting();// this gives an error if greeting is not static
        // it is telling that non static method greeting cannot be referenced  from a static content
        // so it means that inside a static method you cannot use anything that is non static
        // so a static method can only access static data
    }
    // a non static method liek this actually belongs to an instance
    // we know that something that is non static belongs to an object
    void greeting() {
//        func();// you can do this
        System.out.println("Hello World");
    }
    // this is not dependent on objects
    static void func() { // this does not belong to an instance
//        greeting(); // u cannot use it as it requires an object instance
        // but the function you are using it in does not depend on objects
        // so without specifying which instance greeting()
        // belongs to i cannot use it over here
    }
}
        // so what is a static variable
        // when a member is static it can be accessed before any of the objects of the class being created
        // and without referencing to that object and can be directly called through the class name
        // has the same same copy in every object
        // you can declare both the methods like the functions
        // and what ever and the variables as static so you can create static methods as well
        // most common static method is the public static void main()

        // Why is this static
        // because - static means you can use the main function without creating a object of the class
        // and main is actually the very first program that java runs if main is not there you will not be able to run it
        // so if main is the first thing that you have to run then if you dont put it as static oviously
        // so if you have to create an object of that class
        // so how can you create an object to run the program if main is the very first thing that is running
        // so you should be able to run this main function without creating an object of the main function
        // that is why it is static

        // so this static method variables they actually belong to the class not to the object
        // this is basic defination of static