package dsa.strings;

public class Robot_Return_To_Origin {
    static void main() {
        System.out.println(new Robot_Return_To_Origin().judgeCircle("LDRRLRUULR"));
    }
    public boolean judgeCircle(String moves) {
        int UD = 0, LR = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L')
                LR ++;
            else if (ch == 'R')
                LR --;
            else if (ch == 'U')
                UD ++;
            else if (ch == 'D')
                UD --;
        }
        return UD == 0 && LR == 0;
    }
}
