package dsa.data_structures.stacks_queues.problems.practice;

//import java.util.AbstractMap;
//import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/online-stock-span/description/
public class Online_Stock_Span {
    static void main() {
        StockSpanner stockSpanner = new StockSpanner();
        int[] ans = {stockSpanner.next(100), // return 1
        stockSpanner.next(80),  // return 1
        stockSpanner.next(60),  // return 1
        stockSpanner.next(70),  // return 2
        stockSpanner.next(60),  // return 1
        stockSpanner.next(75),  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        stockSpanner.next(85)};  // return 6

        System.out.println(java.util.Arrays.toString(ans));
    }
}

class StockSpanner {
    // Stack<Map.Entry<Integer, Integer>> stack = new Stack<>();
    final Stack<int[]> stack;
    int index;

    public StockSpanner() {
        stack = new Stack<>();
        index = 0;
    }

    public int next(int price) {
        // while ((!stack.isEmpty()) && stack.peek().getKey() <= price) {
        //     stack.pop();
        // }
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            stack.pop();
        }
        int ans = ++index - (!stack.isEmpty() ? stack.peek()[1] : 0);
        // stack.push(new AbstractMap.SimpleImmutableEntry<>(price, index));
        stack.push(new int[] {price, index});
        return ans;
    }
}

/*
  Your StockSpanner object will be instantiated and called as such:
  StockSpanner obj = new StockSpanner();
  int param_1 = obj.next(price);
 */