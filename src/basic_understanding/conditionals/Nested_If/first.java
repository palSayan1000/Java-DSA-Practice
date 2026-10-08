package basic_understanding.conditionals.Nested_If;

public class first {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        // largest between three numbers
        // && means and second highest
        // || names or last or third highest
        // ! names not - highest precidence
        System.out.println("Enter the three numbers respectively:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > b)
            if (a > c)
                System.out.println("The largest: " + a);
            else
                System.out.println("The largest: " + c);
        else if (b > c)
            System.out.println("The largest: " + b);
        else
            System.out.println("The largest: " + c);
    }
}
