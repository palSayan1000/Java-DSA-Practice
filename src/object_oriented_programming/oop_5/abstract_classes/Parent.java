package object_oriented_programming.oop_5.abstract_classes;

public abstract class Parent {
    // abstract class can also not be final for ovious reasons
    private int myAge;
    private final String myName;
    final int val; // for show
//    abstract Parent();
//  abstract constructors could not be created

    public Parent(int age, String name) {
        myAge = age;
        this.myName = name;
        val = 12345;
    }
    /* abstract methods */
    abstract void career(String name); // why cannot create body of abstract classes // it does not have a body how could i call it
    abstract void partner(String name, int age, String type);
    abstract void home(String house);
    // abstract static methods could not be created as static methods could not be overridden

    public int getMyAge() {
        return myAge;
    } // this is a normal method so abstract classes can contain simple and static methods

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyName() {
        return myName;
    }

}
