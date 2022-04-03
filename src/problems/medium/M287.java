package problems.medium;

public class M287 {

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(new Solution().findDuplicate(nums));
    }
    
    private static class Solution {
        public int findDuplicate(int[] nums) {
            int sum = 0;
            int[] tmp = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (tmp[nums[i]] == 1) {
                    sum = nums[i];
                    break;
                }
                tmp[nums[i]] = 1;
            }
            return sum;
        }
    }

}
