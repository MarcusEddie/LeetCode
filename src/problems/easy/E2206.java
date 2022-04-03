package problems.easy;

public class E2206 {

    public static void main(String[] args) {
        
    }
    
    private static class Solution {
        public boolean divideArray(int[] nums) {
            boolean rs = true;
            int[] slot = new int[501];
            for (int i = 0; i < nums.length; i++) {
                slot[nums[i]] = slot[nums[i]] + 1;
            }
            for (int i = 0; i < slot.length; i++) {
                if ((slot[i] & 1) == 1) {
                    rs = false;
                    break;
                }
            }
            return rs;
        }
    }

}
