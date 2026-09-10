package basic_understanding.strings_and_string_builder.builder;

public class Palin_Check {
    static void main() {
        String str = "DaDa";
        System.out.println(new StringBuilder(str).reverse().toString().equals(str)?"Palindrome":"Not Palindrome");
    }
}
