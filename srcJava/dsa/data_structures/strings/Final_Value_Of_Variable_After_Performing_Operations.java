package dsa.data_structures.strings;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
public class Final_Value_Of_Variable_After_Performing_Operations {
    public static void main(String[] args) {
        System.out.println(new Final_Value_Of_Variable_After_Performing_Operations()
                .finalValueAfterOperations(
                        new String[]{"--X", "X++", "X++"}
                ));
    }

    public int finalValueAfterOperations(String[] operations) {
        int count = 0;

        for (String op : operations) {
            if (op.charAt(1) == '+') {
                count++;
            } else {
                count--;
            }
        }

        return count;
    }
}
