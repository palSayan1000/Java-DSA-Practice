package dsa.data_structures.arrays;

public class Number_Of_Employees_Who_Met_The_Target {
    static void main() {
        System.out.println(new Number_Of_Employees_Who_Met_The_Target().
                numberOfEmployeesWhoMetTarget(new int[]{0, 1, 2, 3, 4}, 2));
    }

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int countMetTarget = 0;

        for (int i : hours) {
            countMetTarget += i >= target ? 1 : 0;
        }

        return countMetTarget;
    }
}
