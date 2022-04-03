package problems.easy;

import java.util.HashSet;
import java.util.Set;

public class E942 {

    public static void main(String[] args) {
        int[] rs = new Solution().diStringMatch("IDD");
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int[] diStringMatch(String s) {
            int[] rs = new int[s.length() + 1];
            Set<Integer> set = new HashSet<Integer>();
            if (s.indexOf("I") == 0) {
                set.add(0);
            } else {
                set.add(s.length());
                rs[0] = s.length();
            }
            int max = s.length();
            int min = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 73) {
                    rs[i] = min;
                    rs[i+1] = min + 1;
                    min++;
                    set.add(rs[i+1]);
                } else {
                    rs[i] = max;
                    rs[i+1] = max - 1;
                    max--;
                }
            }
            return rs;
        }
    }

}
