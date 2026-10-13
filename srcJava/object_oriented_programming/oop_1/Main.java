package object_oriented_programming.oop_1;

import java.util.Arrays;

public class Main {
    void main() {
        int[] nums = new int[5];
        // names of 5 students and roll numbers
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        int[] marks = new int[5];

        // this above will not work i want a single data type that will store all the things

        // I create my own data type
        Student[] students = new Student[5];

        // one student
        Student sayan;
        sayan = new Student();
        System.out.println(Arrays.toString(students));
        System.out.println(sayan);
        sayan.rno = 1;
        sayan.name = "Bal";
        System.out.println(sayan.marks);
        sayan.marks = 100.00f;
        System.out.println(sayan.rno + "    " + sayan.name + "    " + sayan.marks);
    }

    // create a class
    // for every single student
    class Student {
        int rno;
        float marks = 90.0f;
        String name;
    }
}
