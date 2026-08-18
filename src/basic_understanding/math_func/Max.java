package basic_understanding.math_func;

public class Max {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("The max of the three: " + Math.max(c, Math.max(a, b)));
    }
}
//static double	max(double a, double b)
//Returns the greater of two double values.
//static float	max(float a, float b)
//Returns the greater of two float values.
//static int	max(int a, int b)
//Returns the greater of two int values.
//static long	max(long a, long b)
//Returns the greater of two long values.
//static double	min(double a, double b)
