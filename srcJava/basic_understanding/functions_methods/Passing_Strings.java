package basic_understanding.functions_methods;

public class Passing_Strings {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your first name: ");
        String personalized = myGreet(sc.next());
        System.out.println("The Message: " + personalized);
    }

    static String myGreet(String str) {
        return "Hello, " + str + "!";
    }
}
