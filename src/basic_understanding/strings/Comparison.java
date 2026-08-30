package basic_understanding.strings;

public class Comparison {
    static void main() {
        String a = "Kunal";
        String b = "Kunal";
        String c = a;
//        System.out.println(a == c);
        // ==
//        System.out.println(a == b);

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");
        String name3 = new String("Kunal    ");
//        System.out.println(name1 == name2);
//        System.out.println(name1.equals(name2));
        System.out.println(name1 == name3);
        // System.out.println(name[0]) // cannot be done
        System.out.println(name1.charAt(0));
    }
}
