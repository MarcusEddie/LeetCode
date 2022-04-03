package problems.easy;

public class E1365 {

    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7 };
        int[] rs = new Solution().smallerNumbersThanCurrent(nums);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] rs = new int[nums.length];
            int[] slot = new int[101];
            int max = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                slot[nums[i]] = slot[nums[i]] + 1;
                if (max < nums[i]) {
                    max = nums[i];
                }
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
            int tmp = 0;
            for (int i = 0; i <= max; i++) {
                if (i <= min) {
                    tmp = slot[i];
                    slot[i] = 0;
                } else {
                    int tmp2 = slot[i];
                    slot[i] = slot[i - 1] + tmp;
                    tmp = tmp2;
                }
            }

            for (int i = 0; i < nums.length; i++) {
                rs[i] = slot[nums[i]];
            }
            return rs;
        }
    }

}
