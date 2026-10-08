package basic_understanding.conditionals.If;

public class IsAdult {
    public static void main() {
        System.out.println("Enter the age: ");
        int age = new java.util.Scanner(System.in).nextInt();
        if (age < 13)
            IO.println("You are a child!!");
        else if (age < 19)
            IO.println("You are a teenager!!");
        else if (age < 120)
            IO.println("You are an adult!!");
        else
            System.err.println("You are dead Bitch!!!!");
    }
}
