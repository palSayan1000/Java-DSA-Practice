package object_oriented_programming.oop_5.abstract_classes;

public class Daughter extends Parent{

    public Daughter(int age, String name) {
        super(age, name);
        /*
        this.myAge = age;
        this.myName = name
         */
    }

    @Override
    void career(String career) {
        System.out.println("I am going to be a " + career);
    }

    @Override
    void partner(String name, int age, String type) {
        System.out.println("I love " + name + ".\nHe is " + type + " and his age is: " + age);
    }

    @Override
    void home(String house) {
        System.out.println("We live in a " + house);
    }
}
