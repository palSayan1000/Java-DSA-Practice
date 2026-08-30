package dsa.recursion.level_1;

public class Concept {
    static void main() {
        fun(5);
    }
    static void fun(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        fun(n--);// infinite recursion baby

        // n-- vs --n -> not similar
        // n-- pass the value of n the decrement by one
        // --n decrement the value first then pass the val
    }
}
