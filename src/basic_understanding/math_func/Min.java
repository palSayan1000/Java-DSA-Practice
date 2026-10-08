package basic_understanding.math_func;

public class Min {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("The min of the three numbers: " + Math.min(c, Math.min(a, b)));
    }
}
//static double	min(double a, double b)
//Returns the smaller of two double values.
//static float	min(float a, float b)
//Returns the smaller of two float values.
//static int	min(int a, int b)
//Returns the smaller of two int values.
//static long	min(long a, long b)
//Returns the smaller of two long values.