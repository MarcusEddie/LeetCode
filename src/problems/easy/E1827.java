package problems.easy;

public class E1827 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public int minOperations(int[] nums) {
            int rs = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    int tmp = nums[i];
                    nums[i] = nums[i - 1] + 1;
                    rs = rs + nums[i] - tmp;
                } else if (nums[i] == nums[i - 1]) {
                    rs++;
                    nums[i] = nums[i] + 1;
                }
            }
            return rs;
        }
    }

}
