package contest.weekly.c288;

import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) {
//        int[][] matchs = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
//        int[][] matchs = {{2,3},{1,3},{5,4},{6,4}};
        System.out.println(new Solution().minimizeResult("5+22"));
    }

    private static class Solution {
        public String minimizeResult(String expression) {
            long sum = 0;
            String min = "(" + expression + ")";
            String[] nums = expression.split("\\+");
            sum = Integer.valueOf(nums[0]) + Integer.valueOf(nums[1]);
            if (nums[0].length() > 1) {
                for (int i = 1; i < nums[0].length(); i++) {
                    for (int j = 1; j <= nums[1].length(); j++) {
                        Integer a = Integer.valueOf(nums[0].substring(0, i));
                        Integer a1 = Integer.valueOf(nums[0].substring(1));
                        Integer b1 = Integer.valueOf(nums[1].substring(0, j));
                        Integer b = 1;
                        if (j!= nums[1].length()) {
                            b = Integer.valueOf(nums[1].substring(j));
                        }
                        long tmp = a * (a1 + b1) * b;
//                        System.out.println(tmp);
                        if (tmp > 0 && sum > tmp) {
                            sum = tmp;
                            min = a + "(" + a1 + "+" + b1 + ")";
                            if (b != 1) {
                                min = a + "(" + a1 + "+" + b1 + ")"+ b;
                            }
                        }
                    }
                }
            } else {
                    for (int j = 1; j <= nums[1].length(); j++) {
                        Integer a = 1;
                        Integer a1 = Integer.valueOf(nums[0]);
                        Integer b1 = Integer.valueOf(nums[1].substring(0, j));
                        Integer b = 1;
                        if (j!= nums[1].length()) {
                            b = Integer.valueOf(nums[1].substring(j));
                            
                        }
                        long tmp = a * (a1 + b1) * b;
//                        System.out.println(tmp);
                        if (tmp > 0 && sum > tmp) {
                            sum = tmp;
                            if (a != 1) {
                                min = a + "(" + a1 + "+" + b1 + ")";
                            } else {
                                min = "(" + a1 + "+" + b1 + ")";
                            }
                            if (b != 1) {
                                min = min + b;
                            }
                        }
                }
            }
            return min;
        }
    }

}
