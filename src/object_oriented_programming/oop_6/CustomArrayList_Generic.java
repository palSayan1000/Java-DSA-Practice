package object_oriented_programming.oop_6;

//import java.util.ArrayList;
import org.jetbrains.annotations.Contract;

import java.util.Arrays;

public class CustomArrayList_Generic<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomArrayList_Generic() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public CustomArrayList_Generic(int size) {
        this.data = new Object[this.size = size];
    }

    public void add(T num) {
        if (isFull()) {
            reSize();
        }
        data[size ++] = num;
    }

    private void reSize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        System.arraycopy(data, 0, temp, 0, data.length);
        //System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    @SuppressWarnings("unchecked assignment")
    public T getFirst() {
        return (T) data[0];
    }

    @SuppressWarnings("unchecked assignment")
    public T getLast() {
        return (T) data[size - 1];
    }

    @SuppressWarnings("unchecked assignment")
    public T removeFirst() {
        T temp = (T) data[0];
        for (int i = 1; i < size; i ++)
            data[i - 1] = data[i];
        size--;
        return temp;
    }

    @SuppressWarnings("unchecked assignment")
    public T removeLast() {
        T temp = (T) data[size - 1];
        size --;
        return temp;
    }

    @SuppressWarnings("unchecked assignment")
    public T remove(int index) {
        T temp = (T) data[index];
        for (int i = index + 1; i < size; i++)
            data[i - 1] = data[i];
        return temp;
    }

    @SuppressWarnings("unchecked assignment")
    public T get(int index) {
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    @SuppressWarnings("unchecked assignment")
    public T set(int index, int value) {
        T temp = (T) data[index];
        data[index] = value;
        return temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    static void main() {
//        ArrayList list = new ArrayList();
        CustomArrayList_Generic<Integer> list = new CustomArrayList_Generic<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(10);

        CustomArrayList_Generic<String> lst = new CustomArrayList_Generic<>();
        lst.add("Sayan");
        lst.add("Bal");
        lst.add("Pal");
        System.out.println(lst);

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