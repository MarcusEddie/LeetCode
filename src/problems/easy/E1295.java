package problems.easy;

public class E1295 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int findNumbers(int[] nums) {
            int rs = 0;
            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                if ((num % 100 == num && num >= 10)||(num % 10000 == num && num >= 1000)) {
                    rs++;
                }
            }
            return rs;
        }
    }

    
}
