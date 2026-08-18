package basic_understanding.functions_methods;

public class Return_Str {
    static void main() {
        String messege = greet();
        System.out.println(messege);
    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }
}
