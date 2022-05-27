package problems.medium;

import java.util.Stack;

public class M844 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean backspaceCompare(String s, String t) {
            Stack<String> stack = new Stack<String>();
            for(int i = 0; i < s.length(); i++) {
                char cur = s.charAt(i);
                if (cur == '#') {
                    if (stack.size() > 0) {
                        stack.pop();
                    }
                } else {
                    stack.push(String.valueOf(cur));
                }
            }
            StringBuilder builder = new StringBuilder();
            while (!stack.isEmpty()) {
                builder.append(stack.pop());
            }
            
            for(int i = 0; i < t.length(); i++) {
                char cur = t.charAt(i);
                if (cur == '#') {
                    if (stack.size() > 0) {
                        stack.pop();
                    }
                } else {
                    stack.push(String.valueOf(cur));
                }
            }
            StringBuilder builder1 = new StringBuilder();
            while (!stack.isEmpty()) {
                builder1.append(stack.pop());
            }
            
            return builder.toString().equals(builder1.toString());
        }
    }

}
