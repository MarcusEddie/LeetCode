package problems.easy;

public class E2016 {

    public static void main(String[] args) {
        int[] nums = { 87, 68, 91, 86, 58, 63, 43, 98, 6, 40 };
        System.out.println(new Solution().maximumDifference(nums));
    }

    private static class Solution {
        public int maximumDifference(int[] nums) {
            int rs = 0;
            int min = Integer.MAX_VALUE;
            int idx = -1;
            int max = -1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > nums[i - 1]) {
                    idx++;

                } else {
                    for (int j = i - idx; j < i; j++) {
                        System.out.print(nums[j] + " ");
                    }
                    idx = 1;
                    System.out.println();
                }
                if (i == nums.length - 1) {
                    for (int j = i - idx + 1; j < i + 1; j++) {
                        System.out.print(nums[j] + " ");
                    }
                    idx = 1;
                    System.out.println();
                }
            }
            System.out.println(max + " " + min);
            if (min == Integer.MAX_VALUE && max == -1) {
                return -1;
            }
            return max - min;
        }
    }

}
