package basic_understanding.strings_and_string_builder.builder;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            builder.append((char) ('a' + i));
        }
        // System.out.println(builder.toString());
        System.out.println(builder); // this is mutable string and not creating a new string
        builder.reverse();
        System.out.println(builder);
    }
}
