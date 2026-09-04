package object_oriented_programming.oop_6.exceptionhandling;

public class Main {
    static void main() {
        int a = 5;
        int b = 0;
//        try {
////            int c = a / b;
//            int c = divide(a, b);
//        } catch (Exception /* ArithmeticException also works */ e) {
//            System.err.println(e.getMessage());
//        } finally {
//            // no matter what happens this will always execute
//            System.out.println("This will always execute");
//        }
        try {
//            int c = divide(a, b);
            // mimicking an exception
//            throw new Exception("Just for fun");
            String name = "Kunal";
            if (name.equals("Kunal")) {
                throw new MyException("name is kunal");
            }
        } catch (MyException e) { // it catches my created exception
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){ // this multiple catch you have to provide the strict exceptions at firsts
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            // no matter what happens this will always execute
            System.out.println("This will always execute");
        }
    }

    static int divide (int a, int b) throws ArithmeticException{ // when ever you throw an exception you have to explicitly declare it here as well
        // in case of explicitly throwing something
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
