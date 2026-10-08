package dsa.data_structures.heaps.understanding;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>> {

    final private List<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void insert(T value) {
        list.add(value);
        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0) {
            return;
        }
        int p = parent(index);
        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() throws RuntimeException {
        if (list.isEmpty()) {
            throw new RuntimeException("Removing from an empty heap!!!!!!!!");
        }
        T temp = list.getFirst();
        T last = list.removeLast();
        if (!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    public List<T> heapSort() throws RuntimeException {
        List<T> list = new ArrayList<>();

        while (!this.list.isEmpty()) {
            list.add(this.remove());
        }

        return list;
    }
}
