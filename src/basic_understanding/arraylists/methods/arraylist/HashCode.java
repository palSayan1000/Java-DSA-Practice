package basic_understanding.arraylists.methods.arraylist;

public class HashCode {
    public static void main() {
        var list = InputList.input();
        System.out.println("The entered list: " + list);
        System.out.println("the hashcode: " + list.hashCode());
    }
}
