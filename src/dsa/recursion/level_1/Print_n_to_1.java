package dsa.recursion.level_1;

public class Print_n_to_1 {
    static void main() {
        funcBoth(5);
    }
    static void func(int n) {
        if (n == 0)
            return;
        System.out.println(n); // you print 4 then you call the recursion call
        func(n - 1);
    }
    static void funcRev(int n) {
        if (n == 0) return;
        funcRev(n - 1); // calling first goes n = 1 and then reverses and prints
        System.out.println(n);
    }
    // 5 4 3 2 1 1 2 3 4 5
    static void funcBoth(int n) {
        if (n == 0) return;
        System.out.println(n);
        funcBoth(n - 1);
        System.out.println(n);
    }
}
