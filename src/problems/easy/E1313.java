package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1313 {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        int[] rs = new Solution().decompressRLElist(nums);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int[] decompressRLElist(int[] nums) {
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i = i + 2) {
                for (int j = 0; j < nums[i]; j++) {
                    tmp.add(nums[i + 1]);
                }
            }
            int[] rs = new int[tmp.size()];
            int idx = 0;
            for (int i : tmp) {
                rs[idx++] = i;
            }
            return rs;
        }
    }

}
