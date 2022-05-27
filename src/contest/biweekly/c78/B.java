package contest.biweekly.c78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B {

    public static void main(String[] args) {
        int[] nums = {0, -1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        Solution solution = new Solution();
        System.out.println(solution.waysToSplitArray(nums));
    }
    
    private static class Solution{
        public int waysToSplitArray(int[] nums) {
            int rs = 0;
            long[] slot = new long[nums.length];
            slot[0] = nums[0];
            for (int i = 1; i < slot.length; i++) {
                slot[i] = slot[i - 1] + nums[i];
            }
            System.out.println(Arrays.toString(slot));
            for (int i = 0; i < slot.length - 1; i++) {
                if (slot[i] >= slot[slot.length - 1] - slot[i]) {
                    System.out.println(slot[i]);
                    rs++;
                }
            }
            return rs;
        }
    }

}
