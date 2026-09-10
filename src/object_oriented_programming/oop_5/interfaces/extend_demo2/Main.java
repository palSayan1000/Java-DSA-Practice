package object_oriented_programming.oop_5.interfaces.extend_demo2;

public class Main implements A, B {
    static void main() {
        Main main = new Main();
        A.greeting(); // static method have to called by there class name
        // here i am calling it by the interface name A
    }
    // default method -> in interfaces -> expand the interfaces without breaking existing code

    @Override
    public void greet() {// nothing less  restrictive could be available over here

    }
}
