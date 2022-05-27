package contest.weekly.c292;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class D {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.appealSum("abbca"));
    }

    private static class Solution {
        public long appealSum(String s) {
            long rs = 0;
            int[] slot = new int[26];
            rs = s.length();
            for (int i = 0; i < s.length(); i++) {
                int tmp = s.charAt(i) - 97;
                slot[tmp]++;
            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] != 0) {
                    rs++;
                }
            }
            int len = 2;
            System.out.println(rs);
            while (len < s.length()) {
                int cnt = 0;
                for (int i = 0; i <= s.length() - len; i++) {
                    String str = s.substring(i, i + len);
                    System.out.println(str);
                    if (i == 0) {
                        Set<Integer> set = new HashSet<Integer>();
                        for (int j = 0; j < str.length(); j++) {
                            set.add((int) str.charAt(j));
                        }
                        cnt = set.size();
                        rs += cnt;
                    } else {
                        if (cnt != 1) {
                            cnt--;
                        }
                        if (str.indexOf(s.charAt(i + len - 1)) == str.length() - 1) {
                            cnt++;
                        }
                        rs += cnt;
                    }
                    System.out.println(rs);
                }
                
                len++;
            }
            return rs;
        }
    }

}
