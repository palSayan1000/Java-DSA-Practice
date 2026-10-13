package basic_understanding.conditionals;

public class Is_Up_Or_Low {
    static void main() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().trim().charAt(0);
        // By precedency
        // ! - > Not
        // && - > And
        // || - > Or
        if (ch >= 'a' && ch <= 'z')
            System.out.println("The character is in lower case!!!");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("The character isa in upper case!!!");
        else
            System.out.println("The character is not an alphabet!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
