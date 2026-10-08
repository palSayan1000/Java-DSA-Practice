package basic_understanding.arraylists.methods.arraylist;

public class TrimToSize {
    static void main() {
        var list = InputList.input();
        System.out.println("The entered list: " + list);
        list.ensureCapacity(100);
        // sets the capacity to 100;
        list.trimToSize();
        // this sets the capacity to the size
    }
}
