package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E821 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().shortestToChar("loveleetcode", 'e')));
    }
    
    private static class Solution {
        public int[] shortestToChar(String s, char c) {
            int[] rs = new int[s.length()];
            List<Integer> idxs = new ArrayList<Integer>();
            for (int i = 0; i < s.length(); i++) {
                rs[i] = -1;
                if (s.charAt(i) == c) {
                    idxs.add(i);
                    rs[i] = 0;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != c) {
                    int diff = 11111;
                    for (Integer integer : idxs) {
                        if (diff > Math.abs(integer - i)) {
                            diff = Math.abs(integer - i);
                        }
                    }
                    rs[i] = diff;
                }
            }
            return rs;
        }
    }

}
