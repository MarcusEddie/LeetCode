package problems.medium;

public class M81 {

    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        int target = 3;
        System.out.println(new Solution().search(nums, target));
    }
    
    private static class Solution {
        public boolean search(int[] nums, int target) {
            boolean rs = false;
            for (int i = 0; i < nums.length; i++) {
                if (target == nums[i]) {
                    rs = true;
                }
            }
            return rs;
        }
    }

}
