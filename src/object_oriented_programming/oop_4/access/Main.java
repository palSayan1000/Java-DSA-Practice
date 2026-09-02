package object_oriented_programming.oop_4.access;

import java.util.ArrayList;

public class Main {
    static void main() {
        A obj = new A(10, "Sayan Pal");
        // need to do a few things
        // 1. access the data members
        // 2. modifying the data member; etc.

//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY; // CANT ABLE TO ACCESS IT -> it is static final int

//        obj.num -> it does not provides us this as it is private
        // this provides us with a bit of security
        // this is data hiding
    }
}
