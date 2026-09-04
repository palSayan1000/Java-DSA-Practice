package object_oriented_programming.oop_6;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public CustomArrayList(int size) {
        this.data = new int[this.size = size];
    }

    public void add(int num) {
        if (isFull()) {
            reSize();
        }
        data[size ++] = num;
    }

    private void reSize() {
        int[] temp = new int[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i ++)
            temp[i] = data[i];
        //System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int getFirst() {
        return data[0];
    }

    public int getLast() {
        return data[size - 1];
    }

    public int removeFirst() {
        int temp = data[0];
        for (int i = 1; i < size; i ++)
            data[i - 1] = data[i];
        size--;
        return temp;
    }

    public int removeLast() {
        int temp = data[size - 1];
        size --;
        return temp;
    }

    public int remove(int index) {
        int temp = data[index];
        for (int i = index + 1; i < size; i++)
            data[i - 1] = data[i];
        return temp;
    }

    public int get(int index) {
        return data[index];
    }

    public int size(){
        return size;
    }

    public int set(int index, int value) {
        int temp = data[index];
        data[index] = value;
        return temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    static void main() {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);

        System.out.println(list);
    }
}
// Methods to add
//        list.add(45);
//        list.add(66);
//        list.remove(0);
//        list.get(0);
//        list.set(1, 4567);
//        list.size();
//        list.isEmpty();
//        list.getFirst();
//        list.getLast();
//        list.removeLast();
//        list.removeFirst();
//        list.clear();