package dsa.data_structures.strings;

// https://leetcode.com/problems/goal-parser-interpretation/description/
public class Goal_Parser_Interpretation {
    static void main() {
        System.out.println(new Goal_Parser_Interpretation().interpret("G()(al)"));
    }

    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
