package dsa.linked_list.making_my_own;

public class Main {
    static void main() {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(99);
        list.addFirst(100);
        list.add(1, 19);
//        list.remove(100);
//        list.display();
        System.out.println(list.toString());
//        for (int i = 0; i < 10000000; i ++)
//            list.add(i);
        list.display();
    }
}
