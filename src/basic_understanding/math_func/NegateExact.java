package basic_understanding.math_func;

public class NegateExact {
    public static void main () {
        //static int	negateExact(int a)
        //Returns the negation of the argument, throwing an exception if the result overflows an int.
        //static long	negateExact(long a)
        //Returns the negation of the argument, throwing an exception if the result overflows a long.
        System.out.println(Math.negateExact(-32487));
        System.out.println(Math.negateExact(432));
    }
}
