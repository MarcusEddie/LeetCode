package problems.easy;

public class E2210 {

    public static void main(String[] args) {
        int[] nums = {5,7,7,1,7};
        System.out.println(new Solution().countHillValley(nums));
    }
    
    private static class Solution {
        public int countHillValley(int[] nums) {
            int rs = 0;
            int[] slot = new int[nums.length];
            int idx = 1;
            slot[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    slot[idx++] = nums[i];
                }
            }
            for (int i = 1; i < idx - 1; i++) {
                if (slot[i - 1] < slot[i] && slot[i] > slot[i + 1]) {
                    rs++;
                }else if (slot[i - 1] > slot[i] && slot[i] < slot[i + 1]) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
