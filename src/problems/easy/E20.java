package problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class E20 {

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(()"));
    }
    
    private static class Solution {
        public boolean isValid(String s) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(41, 40);
            map.put(93, 91);
            map.put(125, 123);
            boolean rs = true;
            Stack<Integer> stack = new Stack<Integer>();
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    stack.push((int) s.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        rs = false;
                        break;
                    }
                    Integer tmp = stack.pop();
                    if (tmp.intValue() != map.get(Integer.valueOf(s.charAt(i)).intValue())) {
                        rs = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                rs = false;
            }
            return rs;
        }
    }

}
