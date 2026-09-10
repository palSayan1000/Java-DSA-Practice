package basic_understanding.arraylists.methods.arraylist;

public class GetLast {
    public static void main() {
        var list = InputList.input();
        System.out.println("The entered list: " + list);
        System.out.println("The last element: " + list.getLast());
    }
}
