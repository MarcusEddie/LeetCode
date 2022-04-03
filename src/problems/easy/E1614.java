package problems.easy;

import java.util.Stack;

public class E1614 {

    public static void main(String[] args) {

        System.out.println((int)'(');
        System.out.println((int)')');
        System.out.println(new Solution().maxDepth("(1)+((2))+(((3)))"));
    }
    
    private static class Solution {
        public int maxDepth(String s) {
            int rs = 0;
            Stack<Integer> stack = new Stack<Integer>();
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 40) {
                    stack.push(40);
                    if (rs < stack.size()) {
                        rs = stack.size();
                    }
                } else if (s.charAt(i) == 41) {
                    stack.pop();
                }
            }
            return rs;
        }
    }

}
