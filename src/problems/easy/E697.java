package problems.easy;

public class E697 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int findShortestSubArray(int[] nums) {
            int rs = 50001;
            int[][] slot = new int[50000][3];
            int max = 0;
            int left = 50000;
            int right = 0;
            for (int i = 0; i < nums.length; i++) {
                slot[nums[i]][0]++;
                if (max < slot[nums[i]][0]) {
                    max = slot[nums[i]][0];
                }
                if (slot[nums[i]][1] == 0) {
                    slot[nums[i]][1] = i + 1;
                } else {
                    slot[nums[i]][2] = i + 1;
                }
                if (right < nums[i]) {
                    right = nums[i];
                }
                if (left > nums[i]) {
                    left = nums[i];
                }
            }
            for (int i = left; i <= right; i++) {
                if (slot[i][0] == max) {
                    if(rs > slot[i][2] - slot[i][1]) {
                        rs = slot[i][2] - slot[i][1];
                    }
                }
            }
            return rs;
        }
    }

}
