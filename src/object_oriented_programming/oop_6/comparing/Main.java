package object_oriented_programming.oop_6.comparing;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static void main() {
        Student[] arrayStud = getArrayStud();
        Student kunal = new Student(12, 89.76f),
                rahul = new Student(5, 99.345f);

        System.out.println(Arrays.toString(arrayStud));
        Arrays.sort(arrayStud);
        System.out.println(Arrays.toString(arrayStud));

//        Arrays.sort(arrayStud, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });

//        int compareTo = kunal.compareTo(rahul);
//        if (compareTo > 0) {
//            System.out.println("Kunal has more marks");
//        } else if (compareTo == 0) {
//            System.out.println("Kunal has same marks as Rahul");
//        } else {
//            System.out.println("Rahul has more marks");
//        }
    }

    private static Student @NotNull [] getArrayStud() {
        Student kunal = new Student(12, 89.76f),
                rahul = new Student(5, 99.345f),
                sayan = new Student(42, 90.25f),
                ram = new Student(1, 20f),
                sham = new Student(2, 200f),
                jodhu = new Student(3, 9f),
                madhu = new Student(4, 33f),
                karan = new Student(5, 49),
                krishna = new Student(Integer.MIN_VALUE, Integer.MIN_VALUE);
        Student[] arrayStud = {kunal, rahul, sayan, ram, sham, jodhu, madhu, karan, krishna};
        return arrayStud;
    }
}
