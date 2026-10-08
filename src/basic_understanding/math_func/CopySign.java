package basic_understanding.math_func;

public class CopySign {
    public static void main() {
        //static double	copySign(double magnitude, double sign)
        //Returns the first floating-point argument with the sign of the second floating-point argument.
        System.out.println(Math.copySign(4.56, -346.988));
        System.out.println(Math.copySign(-3456, 4.56));
        //static float	copySign(float magnitude, float sign)
        //Returns the first floating-point argument with the sign of the second floating-point argument.
    }
}
