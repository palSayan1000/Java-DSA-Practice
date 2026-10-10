package in.coderarmy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

//        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.pay();
    }
}


//    static void main() {
//        OrderService orderService = new OrderService(new  PaymentService());
//        orderService.placeOrder();

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // passing the reflection of the AppConfig class
        // this line means that start a spring container with Annotation based container
        // but it cannot start untill i pass the rules for it
        // the rules i will mae and pass the refection of the class in that

//        Student s1 = new Student();
//
//        // Class (like class Object there is another class called Class that holds the metadata of a class)
//
//        Class<Student> c1 = Student.class; // Student.class -> return type Class of type student
//    }


/*
class Name = Student
fields = name, age
constructors = Student(), Student(String name, int age)
method, public data, private data and basically all the info about the class
annotations
 */
//
//class Student {
//    private String name;
//    private int age;
//
//    public Student() {
//    }
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void getAttendance() {
//    }
//
//    public void print(){
//    }
//}
