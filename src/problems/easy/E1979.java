package problems.easy;

public class E1979 {

    public static void main(String[] args) {
        int[] nums = {2,5,6,9,10};
        System.out.println(new Solution().findGCD(nums));
    }
    
    private static class Solution {
        public int findGCD(int[] nums) {
            int rs = 0;
            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                if (max < nums[i]) {
                    max = nums[i];
                }
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
            System.out.println(max);
            System.out.println(min);
            if (max % min == 0) {
                return min;
            }
            
            return gcd(max, min);
        }
        
        private int gcd(int max, int min) {
            if (min == 0) {
                return max;
            } else {
                return gcd(min, max % min);
            }
        }
    }

}
