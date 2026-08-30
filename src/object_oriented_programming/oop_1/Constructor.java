package object_oriented_programming.oop_1;

import java.util.Arrays;

public class Constructor {
    void main() {
        // one student
        Student sayan = new Student(), bal = new Student("bal", 100, 100.0f);
        sayan.name = "Sayan";
        sayan.greeting();
        sayan.changeName();
        sayan.greeting();
        Student random = new Student(sayan);
        System.out.println(sayan.rno + "    " + sayan.name + "    " + sayan.marks);
    }

    // create a class
    // for every single student
    class Student {
        int rno;
        float marks;
        String name;
        // by default constructor
        Student() {
            this.rno = 0;
            this.marks = 0.0f;
            this.name = "";
        } // constructor overloading
        // we need a way to add the above properties object by object
        // we need one word to access every object
        Student(String name, int rno, float marks) {
            this.name = name;
            this.rno = rno;
            this.marks = marks;
        }

        Student(Student std) {
            this.rno = std.rno;
            this.marks = std.marks;
            this.name = std.name;
        }
        void greeting() {
            System.out.println("Hello " + this.name);
        }
        void changeName() {
            this.name = "Palu Da";
        }
    }
}
