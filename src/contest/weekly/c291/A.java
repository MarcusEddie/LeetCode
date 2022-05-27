package contest.weekly.c291;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = { { 3, 1, 2 }, { 4, 5, 6 } };
        System.out.println(solution.removeDigit("123", '3'));
        System.out.println(solution.removeDigit("1231", '1'));
        System.out.println(solution.removeDigit("551", '5'));
        System.out.println(solution.removeDigit("1234251", '2'));
        System.out.println(solution.removeDigit("1214251", '2'));
        System.out.println(solution.removeDigit("133235", '3'));
        System.out.println(solution.removeDigit("743", '7'));
        System.out.println(solution.removeDigit("3619552534", '5'));

//        System.out.println(solution.intersection(nums));

    }

    private static class Solution {
        public String removeDigit(String number, char digit) {
            String ans = "";
            if (number.indexOf(digit) == number.lastIndexOf(digit)) {
                int idx = number.indexOf(digit);
                ans = number.substring(0, idx) + number.substring(idx + 1);
                return ans;
            }
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == digit) {
                    String tmp = "";
                    if (i == number.length() - 1) {
                        tmp = number.substring(0, i);
                        if (ans.compareTo(tmp) < 0) {
                            ans = tmp;
                        }
                        break;
                    }
                    tmp = number.substring(0, i) + number.substring(i + 1);
                    if (ans.compareTo(tmp) < 0) {
                        ans = tmp;
                    }
                }
            }

            return ans;
        }
    }

}
