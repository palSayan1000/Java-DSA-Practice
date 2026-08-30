package basic_understanding.strings.methods_strings;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String name = "Sayan Bal";
        System.out.println(java.util.Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('p'));
        System.out.println("                    Sayan                   ".strip());
        System.out.println(java.util.Arrays.toString(name.split(" ")));
    }
}
