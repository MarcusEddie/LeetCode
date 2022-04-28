package problems.easy;

public class E1437 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean kLengthApart(int[] nums, int k) {
            Boolean rs = true;
            int idx = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    if (idx == -1) {
                        idx = i;
                    } else {
                        if (i - idx < k) {
                            rs = false;
                            break;
                        }
                        idx = i;
                    }
                }
            }
            return rs;
        }
    }

}
