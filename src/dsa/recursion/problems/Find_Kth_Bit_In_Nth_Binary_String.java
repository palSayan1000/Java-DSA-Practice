package dsa.recursion.problems;

public class Find_Kth_Bit_In_Nth_Binary_String {
    static void main() {
        System.out.println("Find_Kth_Bit_In_Nth_Binary_String : " + new Find_Kth_Bit_In_Nth_Binary_String().findKthBit(4, 11));
    }
    char findKthBit(int n, int k) {
        return generateBinaryString(n).charAt(k - 1);
    }
    StringBuilder generateBinaryString(int index) {
        if (index == 1)
            return new StringBuilder("0");
        StringBuilder binaryString = generateBinaryString(index - 1);
        String temp = binaryString.toString();
        invert(binaryString);
        binaryString.reverse();
        binaryString.insert(0, '1');
        binaryString.insert(0, temp);
        return binaryString;
    }
    void invert(StringBuilder str) {
        for (int i = 0; i < str.length(); i++)
            str.setCharAt(i, (char) ((str.charAt(i) - 48) ^ 1 + 48));
    }
}
