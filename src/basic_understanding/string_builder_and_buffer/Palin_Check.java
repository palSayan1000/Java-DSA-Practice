package basic_understanding.string_builder_and_buffer;

public class Palin_Check {
    static void main() {
        String str = "DaDa";
        System.out.println(new StringBuilder(str).reverse().toString().equals(str)?"Palindrome":"Not Palindrome");
    }
}
