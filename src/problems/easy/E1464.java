package problems.easy;

public class E1464 {

    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(new Solution().maxProduct(nums));
    }
    
    private static class Solution {
        public int maxProduct(int[] nums) {
            int[] slot = new int[2];
            slot[1] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] >= slot[1]) {
                    slot[0] = slot[1];
                    slot[1] = nums[i];
                } else if (nums[i] <= slot[1]) {
                    if (nums[i] > slot[0]) {
                        slot[0] = nums[i];
                    }
                }
            }
            
            return (slot[0] - 1)*(slot[1] - 1);
        }
    }

}
