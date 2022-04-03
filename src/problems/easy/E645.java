package problems.easy;

public class E645 {

    public static void main(String[] args) {
        int[] nums = {1,1};
        int[] rs = new Solution().findErrorNums(nums);
        for (int i : rs) {
            System.out.println(i);
        }
    }
    
    private static class Solution {
        public int[] findErrorNums(int[] nums) {
            int[] rs = new int[2];
            int[] slot = new int[nums.length + 1];
            rs[1] = ((1 + nums.length) * nums.length) / 2;
            for (int i = 0; i < nums.length; i++) {
                if (slot[nums[i]] != 1) {
                    rs[1] = rs[1] - nums[i];
                    slot[nums[i]] = 1;
                } else {
                    rs[0] = nums[i];
                }
            }
            return rs;
        }
    }

}
