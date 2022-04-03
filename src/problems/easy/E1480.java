package problems.easy;

public class E1480 {

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] rs = new Solution().runningSum(nums);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int[] runningSum(int[] nums) {
            int[] rs = new int[nums.length];
            rs[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                rs[i] = rs[i - 1] + nums[i];
            }
            return rs;
        }
    }

}
