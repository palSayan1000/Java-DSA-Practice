package basic_understanding.switchcase;

public class Enhanced_Switch {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Please enter the fruit: ");
        String fruit = sc.next();
        switch (fruit) {
            case "Mango", "mango", "MANGO" -> System.out.println("King of fruits.");
            case "Apple", "apple", "APPLE" -> System.out.println("A sweet red fruit.");
            case "Orange", "orange", "ORANGE" -> System.out.println("Round fruit.");
            case "Grape", "grape", "GRAPE" -> System.out.println("Small sweet fruit.");
            default -> System.out.println("Invalid fruit");
        } // in this enhanced switch you can give multiple parameter using a (,) and this works for one parameter as well
        sc.close();
    }
}
