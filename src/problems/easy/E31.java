package problems.easy;

public class E31 {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        new Solution().nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public void nextPermutation(int[] nums) {
            int cnt = -1;
            int[] slot = new int[101];
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    cnt = i;
                }
            }
            for (int i = cnt; i < nums.length; i++) {
                slot[nums[i]] = slot[nums[i]] + 1;
            }
            if (cnt == nums.length - 2) {
                nums[cnt] = nums[cnt] + nums[cnt + 1];
                nums[cnt + 1] = nums[cnt] - nums[cnt + 1];
                nums[cnt] = nums[cnt] - nums[cnt + 1];
            } else if (0 <= cnt && cnt < nums.length - 2) {
                nums[cnt] = nums[cnt] + 1;
                for (int i = 1; i < nums.length; i++) {
                    nums[i] = 1 + i - 1;
                }
            } else {
                for (int i = 0; i < nums.length / 2; i++) {
                    nums[i] = nums[i] + nums[nums.length - 1 - i];
                    nums[nums.length - 1- i] = nums[i] - nums[nums.length - 1- i];
                    nums[i] = nums[i] - nums[nums.length - 1 - i];
                }
            }
        }
    }

}
