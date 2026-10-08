package object_oriented_programming.oop_5.interfaces.nested;

public class A {
    // nested interface
    public interface NestedInterface {
        // the nested interface can be declared as public private or protected
        // ----> but the top level interface
        // -> not the nested one basically
        // has to be declared as public or the default one
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}