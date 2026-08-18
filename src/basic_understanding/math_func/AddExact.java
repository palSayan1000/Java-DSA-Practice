package basic_understanding.math_func;

public class AddExact {
    public static void main(){
//        static int	addExact(int x, int y)
//        Returns the sum of its arguments, throwing an exception if the result overflows an int.
//        static long	addExact(long x, long y)
//        Returns the sum of its arguments, throwing an exception if the result overflows a long.
        System.out.println(Math.addExact(2, 3));
        System.out.println(Math.addExact(7, 3));
    }
}
