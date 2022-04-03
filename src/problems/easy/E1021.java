package problems.easy;

import java.util.Stack;

public class E1021 {

    public static void main(String[] args) {
        System.out.println(new Solution().removeOuterParentheses("()()"));
    }
    
    private static class Solution {
        public String removeOuterParentheses(String s) {
            StringBuilder builder = new StringBuilder();
            Stack<String> stack = new Stack<String>();
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push("(");
                } else {
                    if (stack.size() > 2) {
                        tmp.append(")");
                        tmp.insert(0,  stack.pop());
                    } else if (stack.size() == 2) {
                        tmp.append(")");
                        tmp.insert(0,  stack.pop());
                        builder.append(tmp.toString());
                        tmp = new StringBuilder();
                    } else {
                        stack.pop();
                        builder.append(tmp.toString());
                        tmp = new StringBuilder();
                    }
                }
            }
            return builder.toString();
        }
    }

}
