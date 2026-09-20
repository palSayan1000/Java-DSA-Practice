package dsa.algorithms.recursion.problems;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    static void main() {
        System.out.println(new Generate_Parentheses().generateParenthesis(8));
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateParenthesis(n, n, new StringBuilder(), list);
        return list;
    }
    public void generateParenthesis(int openingParenthesisTracker,
                    int closingParenthesisTracker,
                    StringBuilder sBuilder, List<String> list) {

        if (openingParenthesisTracker == 0 &&
                closingParenthesisTracker == 0) {
            list.add(sBuilder.toString());
            return;
        }
        // for adding the opening parenthesis
        if (openingParenthesisTracker != 0) {
            sBuilder.append('(');
            generateParenthesis(openingParenthesisTracker - 1,
                    closingParenthesisTracker, sBuilder, list);
            sBuilder.deleteCharAt(sBuilder.length() - 1);
        }
        // for adding the closing parenthesis
        if (closingParenthesisTracker != 0 &&
                openingParenthesisTracker < closingParenthesisTracker) {
            sBuilder.append(')');
            generateParenthesis(openingParenthesisTracker,
                    closingParenthesisTracker - 1, sBuilder, list);
            sBuilder.deleteCharAt(sBuilder.length() - 1);
        }
    }
}
