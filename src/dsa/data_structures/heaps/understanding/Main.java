package dsa.data_structures.heaps.understanding;

public class Main {
    static void main() {
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);
        heap.insert(94);

        // smallest element in the heap
        System.out.println(heap.remove());

        // the sorted array -> basically the heap sort
        System.out.println(heap.heapSort());
    }
}
