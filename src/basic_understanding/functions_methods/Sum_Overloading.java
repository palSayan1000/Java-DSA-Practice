package basic_understanding.functions_methods;

public class Sum_Overloading {
    static void main() {
        int sum = sum(3, 4, 5, 10);
        System.out.println("The Sum: " + sum);
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static int sum(int... nums){
        // System.out.println("Executed");
        int sum = 0;
        for(int i : nums)
            sum += i;
        return sum;
    }
}
