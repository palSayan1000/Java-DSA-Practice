package basic_understanding.conditionals.If;

public class Syntax {
    static void main() {
        /*
            Syntax of if statement
            if (boolean expression true or false) {
                // body
            } else {
                // do this
            }
        */

        int salary = 25400;
//        if (salary >= 10_000)
//            salary = salary + 2_000;
//        else
//            salary += 1_000;
//
        // multiple else-if
        if (salary >= 10_000)
            salary += 2000;
        else if (salary > 20000)
            salary += 3000;
        else
            salary += 1000;
        System.out.println(salary);
    }
}
