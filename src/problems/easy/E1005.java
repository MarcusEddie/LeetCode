package problems.easy;

import java.util.Arrays;

public class E1005 {

    public static void main(String[] args) {
        int[] nums = { -8, 3, -5, -3, -5, -2 };
        System.out.println(new Solution().largestSumAfterKNegations(nums, 6));
    }

    private static class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {

            int negIdx = 0;
            int sum = 0;
            Arrays.sort(nums);
            int hasZero = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                if (nums[i] < 0) {
                    negIdx = i;
                }
                if (nums[i] == 0) {
                    hasZero = 1;
                }
            }
            System.out.println(Arrays.toString(nums));
            if (nums[0] >= 0) {
                if ((k & 1) == 1) {
                    sum = sum - nums[0] - nums[0];
                }
            } else if (nums[nums.length - 1] <= 0) {
                int len = k < nums.length ? k : nums.length;
                for (int i = 0; i < len; i++) {
                    sum = sum - nums[i] - nums[i];
                }
                k = k - len;
                if ((k > 0) && (k & 1) == 1) {
                    sum = sum + nums[nums.length - 1] + nums[nums.length - 1];
                }
            } else {
                if (k <= negIdx + 1) {
                    for (int i = 0; i < k; i++) {
                        sum = sum - nums[i] - nums[i];
                    }
                } else {
                    for (int i = 0; i <= negIdx; i++) {
                        sum = sum - nums[i] - nums[i];
                    }
                    k = k - negIdx - 1;
                    if (hasZero == 0) {
                        if ((k & 1) == 1) {
                            if (-nums[negIdx] < nums[negIdx + 1]) {
                                sum = sum + nums[negIdx] + nums[negIdx];
                            } else {
                                sum = sum - nums[negIdx + 1] - nums[negIdx + 1];
                            }

                        }
                    }
                }
            }
            return sum;
        }
    }

}
