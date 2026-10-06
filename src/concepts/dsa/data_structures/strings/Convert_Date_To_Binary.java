package concepts.dsa.data_structures.strings;

// https://leetcode.com/problems/convert-date-to-binary/description/
public class Convert_Date_To_Binary {
    static void main() {
        System.out.println(new Convert_Date_To_Binary().convertDateToBinary("2080-02-29"));
    }

    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        date += "-";

        for (char ch : date.toCharArray()) {
            if (ch == '-') {
                sb.append(Integer.toBinaryString(num)).append("-");
                num = 0;
                continue;
            }
            num = num * 10 + (ch - 48);
        }

        return sb.substring(0, sb.length() - 1);
    }
}
