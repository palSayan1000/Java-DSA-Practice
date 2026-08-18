package basic_understanding.math_func;

public class Random {
    public static void main () {
        //static double	random()
        //Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
        System.out.println(Math.random());
        //If you want to get a number from 1 to 100
        System.out.println((int) (Math.random() * 100));

    }
}
