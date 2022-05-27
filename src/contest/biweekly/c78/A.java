package contest.biweekly.c78;

import java.util.Arrays;

public class A {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        Solution solution = new Solution();
        System.out.println(solution.divisorSubstrings(430043, 2));
    }

    private static class Solution {

        public int divisorSubstrings(int num, int k) {
            int ans = 0;
            String numStr = String.valueOf(num);
            for (int i = 0; i <= numStr.length() - k; i++) {
                int tmp = Integer.valueOf(numStr.substring(i, i + k));
                if(0 != tmp && num % tmp == 0) {
                    ans++;
                }
            }
            return ans;
        }
    }

}
