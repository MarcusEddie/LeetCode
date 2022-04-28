package problems.easy;

public class E896 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean isMonotonic(int[] nums) {
            boolean rs = true;
            int pos = 0;
            int neg = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                int diff = nums[i + 1] - nums[i];
                if (diff > 0) {
                    pos = 1;
                } else if (diff < 0) {
                    neg = 1;
                }
            }
            if (pos + neg == 2) {
                rs = false;
            }
            return rs;
        }
    }

}
