package basic_understanding.strings;

public class Check_Palin {
    public static void main(String[] args) {
        String str = "dada";
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(0) != str.charAt(str.length() - i - 1)) {
                System.out.println("Not Palindrome");
                return;
            }
        System.out.println("Palindrome");
    }
}
