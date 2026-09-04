package object_oriented_programming.oop_6.comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    @SuppressWarnings("SpellCheckingInspection")
    int rollno;
    float marks;

    @SuppressWarnings("SpellCheckingInspection")
    public Student(int rollno, float marks) {
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        // if diff == 0: means both are equal
        // if diff < 1: means o is bigger
        // else this is bigger
//        return Math.round(this.marks - o.marks);
        return Float.compare(this.marks, o.marks);
        // String     str1.compareTo(str2)   this.name.compareTo(o.name)
        // same for others
    }

    @Override
    public String toString() {
        return "rollno = " + rollno + " ";
    }
}