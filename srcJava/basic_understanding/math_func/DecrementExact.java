package basic_understanding.math_func;

public class DecrementExact {
    public static void main() {
        //static int	decrementExact(int a)
        //Returns the argument decremented by one, throwing an exception if the result overflows an int.
        //static long	decrementExact(long a)
        //Returns the argument decremented by one, throwing an exception if the result overflows a long.
        System.out.println(Math.decrementExact(234));
        System.out.println(Math.decrementExact(-3456));
        // System.out.println(Math.decrementExact(-345846644658765445687656554656464786)); // error overflow
    }
}
