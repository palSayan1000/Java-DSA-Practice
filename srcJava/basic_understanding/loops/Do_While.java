package basic_understanding.loops;

public class Do_While {
    static void main() {
        /*
            Syntax for do-while
            do {
                // body
            } while (condition);
        */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
        // there is one difference between do-while and while
        // in do-while the loop will execute atleast once

    }
}
