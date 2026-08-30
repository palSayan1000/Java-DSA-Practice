package basic_understanding.strings;

public class Performance {
    static void main() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
//            System.out.print(ch);
            series += ch; // everytime new string gets created
        }
        System.out.println(series);
    }
}
