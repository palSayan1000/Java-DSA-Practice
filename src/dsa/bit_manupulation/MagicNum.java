package dsa.bit_manupulation;

public class MagicNum {
    static void main() {
        int n = 5, sum = 0, count = 1;
        while (n > 0){
            sum += (n & 1) * (int) Math.pow(5, count++);
            n >>= 1;
        }
        System.out.println(sum);
    }
}
