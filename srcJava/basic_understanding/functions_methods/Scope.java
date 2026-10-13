package basic_understanding.functions_methods;

public class Scope {
    static void main() {
        int a = 10;
        int b = 20;
        {
            // already initialized outside the block in the same method, hence you cannot reinitialize it again
            // int a = 78; // you can change the value of a but u cannot redeclare a gives error as it is already declared above
            int num = 99;
            a = 78;
            System.out.println(a);
            // values initialized in the block will remain in the block
        }
        System.out.println(a);
        // System.out.println(num); // cannot use outside the block
        // this above gives error as it is outside the block and is being removed from the stack
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(marks);
        System.out.println(num);
    } // num and marks are only available in this function
}
