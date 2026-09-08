package dsa.linked_list.understanding.circular;

public class Main {
    static void main() {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(8);
        list.insert(9);
        list.insert(2);
        list.insert(7);
        list.insert(17);
        list.delete(17);
        list.display();
    }
}
