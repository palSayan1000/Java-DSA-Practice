package concepts.dsa.data_structures.linked_list.problems.practice.linkedlist;

public class Design_Linked_List {
    static void main() {
        MyLinkedList obj = new MyLinkedList();
        int index = 0, val = 9;
        int param_1 = obj.get(index);
        obj.addAtHead(val);
        obj.addAtTail(val);
        obj.addAtIndex(index, val);
        obj.deleteAtIndex(index);
    }
}

class MyLinkedList {

    int size;
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        size = 0;
        head = tail = null;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        ListNode dummy = head;

        for (int i = 0; i < index; i++) {
            dummy = dummy.next;
        }

        return dummy.val;
    }

    public void addAtHead(int val) {
        if (head == null) {
            head = tail = new ListNode(val);
            size++;
            return;
        }
        head = new ListNode(val, head);
        size++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        tail.next = new ListNode(val, null);
        tail = tail.next;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index > size || index < 0) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        ListNode dummy = head;

        for (int i = 0; i < index - 1; i++) {
            dummy = dummy.next;
        }

        dummy.next = new ListNode(val, dummy.next);
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index >= size || index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }
        ListNode dummy = head;

        for (int i = 0; i < index - 1; i++) {
            dummy = dummy.next;
        }

        dummy.next = dummy.next.next;
        size--;

        if (dummy.next == null) {
            tail = dummy;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

/*
  Your MyLinkedList object will be instantiated and called as such:
  MyLinkedList obj = new MyLinkedList();
  int param_1 = obj.get(index);
  obj.addAtHead(val);
  obj.addAtTail(val);
  obj.addAtIndex(index,val);
  obj.deleteAtIndex(index);
 */


//
//class MyLinkedList {
//
//    LinkedList<Integer> list;
//
//    public MyLinkedList() {
//        list = new LinkedList<>();
//    }
//
//    public int get(int index) {
//        if (index < 0 || index >= list.size()) {
//            return -1;
//        }
//        return list.get(index);
//    }
//
//    public void addAtHead(int val) {
//        list.addFirst(val);
//    }
//
//    public void addAtTail(int val) {
//        list.addLast(val);
//    }
//
//    public void addAtIndex(int index, int val) {
//        if (index > list.size() || index < 0) {
//            return;
//        }
//        list.add(index, val);
//    }
//
//    public void deleteAtIndex(int index) {
//        if (index >= list.size() || index < 0) {
//            return;
//        }
//        list.remove(index);
//    }
//}