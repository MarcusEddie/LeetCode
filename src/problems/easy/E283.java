package problems.easy;

public class E283 {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new Solution().moveZeroes(nums);
    }
    
    private static class Solution {
        public void moveZeroes(int[] nums) {
            int idx = 0;
            while(idx < nums.length) {
                if (nums[idx] == 0) {
                    for (int j = idx; j < nums.length - 1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    nums[nums.length - 1] = 0;
                } else {
                    idx++;
                }
            }
        }
    }

}
