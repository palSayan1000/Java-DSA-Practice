package basic_understanding.math_func;

public class IncrementExact {
    public static void main() {
        //static int	incrementExact(int a)
        //Returns the argument incremented by one, throwing an exception if the result overflows an int.
        //static long	incrementExact(long a)
        //Returns the argument incremented by one, throwing an exception if the result overflows a long.
        System.out.println(Math.incrementExact(-1));
        System.out.println(Math.incrementExact(3254));
    }
}
