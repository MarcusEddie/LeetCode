package contest.weekly.c292;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = { { 3, 1, 2 }, { 4, 5, 6 } };

        System.out.println(solution.largestGoodInteger("677713333999"));
        System.out.println(solution.largestGoodInteger("23000019"));

    }

    private static class Solution {
        public String largestGoodInteger(String num) {
            String ans = "";
            int idx = 0;
            int max = -1;
            while (idx < num.length()) {
                if(num.charAt(idx) == num.charAt(idx+1) && num.charAt(idx + 1) == num.charAt(idx + 2)) {
                    String tmp = num.substring(idx, idx + 3);
                    if (Integer.valueOf(tmp).compareTo(max) > 0) {
                        max = Integer.valueOf(tmp);
                        ans = tmp;
                    }
                    idx = idx + 3;
                    if (idx + 3 > num.length()) {
                        break;
                    }
                } else {
                    idx++;
                    if (idx + 3 > num.length()) {
                        break;
                    }
                }
            }
            return ans;
        }
    }

}
