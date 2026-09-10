package dsa.linked_list.understanding.doubly;

public class Main {
    static void main() {
        DoublyLinkedList list = new DoublyLinkedList();
//        list.insertFirst(10);
//        list.insertFirst(11);
//        list.insertFirst(12);
//        list.insertFirst(13);
//        list.insertFirst(14);
//        list.insertFirst(15);
        list.insertLast(8);
        list.insertLast(2);
        list.insertLast(5);
        list.insertLast(7);

        list.insertAfter(5, 18);
        list.insertAfter(7, 10);

        list.display();
    }
}
