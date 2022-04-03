package problems.easy;

public class E1748 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int sumOfUnique(int[] nums) {
            int rs = 0;
            int[] slot = new int[101];
            for (int i = 0; i < nums.length; i++) {
                if (slot[nums[i]] == 1) {
                    rs = rs - nums[i];
                    slot[nums[i]] = slot[nums[i]] + 1;
                }else if (slot[nums[i]] > 1) {
                    continue;
                } else {
                    rs = rs + nums[i];
                    slot[nums[i]] = slot[nums[i]] + 1;
                }
            }
            return rs;
        }
    }

}
