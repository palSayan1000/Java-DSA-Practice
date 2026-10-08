package basic_understanding.number_pro;

public class Count_Freq {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number: ");
        long num = sc.nextLong();
        System.out.print("Enter the target digit: ");
        int target = sc.nextInt(), count = 0;
        for (long i = num; i > 0; i /= 10)
            if (i % 10 == target)
                count++;
        System.out.println("The frequency of the digit: " + count);
    }
}
