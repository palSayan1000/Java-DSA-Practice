package dsa.math.problems;

public class A_Number_After_A_Double_Reversal {
    static void main() {
        System.out.println(new A_Number_After_A_Double_Reversal().isSameAfterReversals(526));
    }
    public boolean isSameAfterReversals(int num) {
        if (num < 10) return true;
        if (num % 10 == 0) return false;
//        return reverse(reverse(num)) == num;
        return true;
    }
    public int reverse(int num) {
        int reverse = 0;
        for (int i = num; i > 0; i /= 10)
            reverse = reverse * 10 + i % 10;
        return reverse;
    }
}
