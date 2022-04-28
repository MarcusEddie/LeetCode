package problems.easy;

public class E1800 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int maxAscendingSum(int[] nums) {
            int rs = 0;
            int sum = 0;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i] < nums[i - 1]) {
                    if (rs < sum) {
                        rs = sum;
                    }
                    sum = 0;
                } else {
                    sum += nums[i];
                }
                if (i == nums.length - 1) {
                    if (rs < sum) {
                        rs = sum;
                    }
                }
            }
            return rs;
        }
    }

}
