package contest.weekly.c288;

import java.util.Arrays;

public class C {

    public static void main(String[] args) {
//        int[][] matchs = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
//        int[][] matchs = {{2,3},{1,3},{5,4},{6,4}};
        int[] nums= {21,100};
        System.out.println(new Solution().maximumProduct(nums, 58));
    }

    private static class Solution {
        public int maximumProduct(int[] nums, int k) {
            double rs = 1;
            Arrays.sort(nums);
            while (k > 0) {
                if (k == nums[1] - nums[0]) {
                    k = 0;
                    nums[0] = nums[1];
                } else if (k < nums[1] - nums[0]) {
                    nums[0] = nums[0] + k;
                    k = 0;
                }else {
                    k = k - (nums[1] - nums[0]) - 1;
                    nums[0] = nums[1] + 1;
                }
                Arrays.sort(nums);
//                System.out.println(k + " + " + Arrays.toString(nums));
            }
            for (int i = 0; i < nums.length; i++) {
                rs = rs * nums[i];
            }
            return (int) (rs % (Math.pow(10, 9) + 7));
        }
    }

}
