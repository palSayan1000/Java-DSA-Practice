package dsa.math;

public class Newton_Raphson_SQRT {
    static void main() {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n) {
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + n / x);

            if (Math.abs(root - x) < 0.000001) {
                break;
            }

            x = root;
        }

        return root;
    }
}
