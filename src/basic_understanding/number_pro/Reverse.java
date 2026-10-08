package basic_understanding.number_pro;

public class Reverse {
    static void main() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        long reverse = 0;
        ;
        for (int i = num; i > 0; i /= 10)
            reverse = reverse * 10 + i % 10;
        System.out.println("The reverse of that number: " + reverse);
        input.close();
    }
}
