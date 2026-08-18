package basic_understanding.arraylists.methods.arraylist;

public class EnsureCapacity {
    static void main() {
        var list = InputList.input();
        System.out.println("The capacity of the list: " + list.size());// prints tthe no.of elements not the capacity
        list.ensureCapacity(100);
        System.out.println("The capacity of the list now: " + list.size()); /// same here but the capacity has incresed intenally do not woorry bro
    }
}
