package object_oriented_programming.oop_1;

public class Final_Finalize_KeyWord {
    // To make a constant
    // once declared with final the value cannot be modified later
    static void main() {
        final int bonus = 3;
//        bonus = 5;
        // error cannot modify
        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "Sayan";
//        kunal = new A("New Object");
        // when a non primitive is final, you cannot resign it.
        // use can use it to access the object and play with it but cannot resign it

        // creating object till getting the finalize method called
        A obj;
        for (int i = 0; i < 50000; i++) {
            obj = new A("Kutta");
        }
        System.out.println("Total obj destroyed: " + kunal.count);
        // you will find this above statement as 22 in the middle as as this segment continues running the
        // destruction of object is going on in on in and on in on in on in on
        // in the above the count is static the below is not static
        System.out.println("Total obj destroyed: " + kunal.ct); // this will print 0 -> lets see in static lecture
        // as non - static have different copy in differnet obj (new copy)
        // so when the obj is destroyed the ct of that destroyed obj  gets ct++
        // but in static every object shares the same copy
        // so change in one changes the others
    }
}
class A {
//    final int a; // always has to initialised while declaring
    // giving an error final variables has to be initialised
    // this is only for premitive data types
    final int num = 10;
    int ct = 0;
    static int count = 0;
    String name;
    public A(String name) {
        this.name = name;
    }
//    static void main() {
//        final Student student = new Student();
//        // here student = other object cannot be done student is fixed to this reference
//        // but
//        student.rno = 1;//this can be done
//        student.name = "new name";
//    }
    // any object of class A is free ed from the memory this finalize memory will be called
    // the object is destroyed automatically unlike in c and c++ where you manually destroy here it is done automatically by the
    // java garbage ccollector and when it destroyes the object it calles this finalize method
    // like while creating an object automatically constructor is called
    @Override
    protected void finalize() throws Throwable { // it is for remouval that is why showing in red
        System.out.println("Object is destroyed");
        count ++;
        ct ++;
    }
}
class Student {
     int rno;
     float marks;
     String name;
     // after making this constructor making the defualt constructor becomes compulsory
     Student(String name, int rno, float marks) {
         this.rno = rno;
         this.marks = marks;
         this.name = name;
     }
     Student(){}
}
