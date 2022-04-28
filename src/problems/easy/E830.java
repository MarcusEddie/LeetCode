package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E830 {

    public static void main(String[] args) {
        System.out.println(new Solution().largeGroupPositions("abcdddeeeeaabbbcdddd").toString());
    }
    
    private static class Solution {
        public List<List<Integer>> largeGroupPositions(String s) {
            List<List<Integer>> rs = new ArrayList<List<Integer>>();
            int pre = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
//                    System.out.println(s.substring(pre, i));
                    if (i - pre >= 3) {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(pre);
                        tmp.add(i);
                        rs.add(tmp);
                    }
                    pre = i;
                }
                if (i == s.length() - 1) {
                    if (i - pre >= 3) {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(pre);
                        tmp.add(i);
                        rs.add(tmp);
                    }
                }
            }
            return rs;
        }
    }

}
