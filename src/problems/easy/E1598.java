package problems.easy;

import java.util.Stack;

public class E1598 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int minOperations(String[] logs) {
            Stack<String> stack = new Stack<String>();
            for (int i = 0; i < logs.length; i++) {
                if (logs[i].equals("../")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (logs[i].equals("./")) {
                    continue;
                } else {
                    stack.push(logs[i]);
                }
            }
            return stack.size();
        }
    }

}
