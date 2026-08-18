package basic_understanding.functions_methods;

public class Swap {
    static void main() {
        int a = 10, b = 20;
//        // swaping
//        a ^= b;
//        b ^= a;
//        a ^= b;
        swap(a, b);
        System.out.println("a: " + a + " b: " + b);

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println("The name is: " + name);
    }

    static void swap(int a, int b) {
        a += b;
        b = a - b;
        ;
        a = a - b;
        System.out.println("a: " + a + " b: " + b);
        // this change will only be available in this function only
    }

    static void changeName(String name) {
        name = "Sayan";
    }
}
