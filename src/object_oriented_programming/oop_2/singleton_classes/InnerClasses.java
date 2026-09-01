package object_oriented_programming.oop_2.singleton_classes;

public class InnerClasses {
    // only inner classes can be static
    // static methods are done during compile time
    static class Test { // if you do static like this internally everything inside becomes static
        // if this was not it cannot be reference adn this class itself is dependent on the outside class
        String name;
        Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static void main() {
//        Test obj = new Test("Bal");
        // the above will give an error if the Test class is not static

//        InnerClasses obj = new InnerClasses();
//        obj.Test ob = new obj.Test("Pal");
        // this also does not works
        Test obj = new Test("Bal");
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(obj.name); // Bal
        System.out.println(a.name); // Kunal
        System.out.println(b.name); // Rahul

        // overriding the inbuilt println function
        System.out.println(a);
        // It gives  different values not like
        // the result if the class Test was outside and not an inner class

        // static inner class means that the Test is not dependent of the outer class
        // but the main the test  can have instances of each other
    }
}

// Error outside classes cannot be static
//static class A{
//
//}