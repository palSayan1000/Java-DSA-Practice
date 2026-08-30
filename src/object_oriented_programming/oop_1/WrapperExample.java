package object_oriented_programming.oop_1;

public class WrapperExample {
    static void main() {
//        int a = 10;
//        int b = 20;
//        swap(a, b);
//        Integer num = 45;

        Integer a = 10, b = new Integer(20);
        swap(a, b); // Not swapping because Integer class is a final class
        System.out.println(a + " " + b);// still not swapping
    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}