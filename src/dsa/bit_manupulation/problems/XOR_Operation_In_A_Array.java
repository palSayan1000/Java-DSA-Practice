package dsa.bit_manupulation.problems;
// https://leetcode.com/problems/xor-operation-in-an-array/?envType=problem-list-v2&envId=prshgx6i
public class XOR_Operation_In_A_Array {
    static void main() {
        System.out.println(new XOR_Operation_In_A_Array().xorOperation(4, 3));
    }

    private int xorOperation(int n, int start) {
        int XOR = 0;
        for (int i = 0; i < n; i ++)
            XOR ^= (start + 2 * i);
        return XOR;
    }
}
