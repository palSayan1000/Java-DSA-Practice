package basic_understanding.recursion;

public class NumbersExp_Recursion {
    static void main() {
        print(1);
    }
    static void print(int i) {
        if (i == 6)
            return;
        System.out.println(i);

        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack
        print(i + 1);
        // this is the last function call
        // this is called tail recursion
    }
}