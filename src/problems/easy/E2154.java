package problems.easy;

public class E2154 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int findFinalValue(int[] nums, int original) {
            int rs = 0;
            int[] slot = new int[1001];
            for (int i = 0; i < nums.length; i++) {
                slot[nums[i]] = 1;
            }
            while (original <= 1000 && slot[original] == 1) {
                original = original << 1;
            }    
            return original;
        }
    }

}
