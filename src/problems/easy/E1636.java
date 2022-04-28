package problems.easy;

import java.util.Arrays;

public class E1636 {

    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        int[] rs = new Solution().frequencySort(nums);
        System.out.println(Arrays.toString(rs));
    }
    
    private static class Solution {
        public int[] frequencySort(int[] nums) {
            int[] rs = new int[nums.length];
            int[] slot = new int[201];
            for (int i = 0; i < nums.length; i++) {
                slot[nums[i] + 100]++;
            }
            int[][] freq = new int[101][102];
            for (int i = 0; i < freq.length; i++) {
                freq[i][0] = 1;
            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] > 0) {
                    freq[slot[i]][freq[slot[i]][0]] = i - 100;
                    freq[slot[i]][0]++;
                }
            }
            int idx = 0;
            for (int i = 1; i < freq.length; i++) {
                if (freq[i][0] != 1) {
                    for (int j = freq[i][0] - 1; j > 0; j--) {
                        for (int j2 = 0; j2 < i; j2++) {
                            rs[idx++] = freq[i][j];
                        }
                    }
                }
            }
            return rs;
        }
    }

}
