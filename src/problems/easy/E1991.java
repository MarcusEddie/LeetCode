package problems.easy;

public class E1991 {

    public static void main(String[] args) {
        int[] nums = {10,-1,1};
        System.out.println(new Solution().findMiddleIndex(nums));
    }
    
    private static class Solution {
        public int findMiddleIndex(int[] nums) {
            int rs = -1;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
            }
            int tmp = 0;
            for(int i = 0;i < nums.length; i++) {
                if (tmp == sum - nums[i] - tmp) {
                    rs = i;
                    break;
                }
                tmp += nums[i];
            }
            return rs;
        }
    }

}
