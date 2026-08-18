package basic_understanding.math_func;

public class MultiplyExact {
    public static void main () {
        //static int	multiplyExact(int x, int y)
        //Returns the product of the arguments, throwing an exception if the result overflows an int.
        //static long	multiplyExact(long x, long y)
        //Returns the product of the arguments, throwing an exception if the result overflows a long.
        System.out.println(Math.multiplyExact(2, 3));
        System.out.println(Math.multiplyExact(4, 5));
    }
}