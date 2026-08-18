package basic_understanding.math_func;

public class Rint {
    public static void main(){
        //Math.rint(2.5) returns 2.0 (because 2 is an even number).
        //
        //Math.rint(3.5) returns 4.0 (because 4 is an even number).
        //
        //Math.rint(-2.5) returns -2.0.
        //static double	rint(double a)
        //Returns the double value that is closest in value to the argument and is equal to a mathematical integer.
        System.out.println(Math.rint(2.5));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.rint(3.3));
        System.out.println(Math.rint(-2.5));
        System.out.println(Math.rint(32.9));
    }
}
