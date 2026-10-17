package dsa.algorithms.math.problems;

// https://leetcode.com/problems/convert-the-temperature/description/
public class Convert_The_Temperature {
    static void main() {
        System.out.println(java.util.Arrays.toString(new Convert_The_Temperature()
                .convertTemperature(36.50)));
    }

    public double[] convertTemperature(double Celsius) {
        return new double[]{Celsius + 273.15, Celsius * 1.80 + 32.00};
    }
}
