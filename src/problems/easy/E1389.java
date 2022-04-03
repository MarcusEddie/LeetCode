package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1389 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] rs = new Solution().createTargetArray(nums, index);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            int[] rs = new int[nums.length];
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                tmp.add(index[i], nums[i]);
            }
            for (int i = 0; i < rs.length; i++) {
                rs[i] = tmp.get(i);
            }
            return rs;
        }
    }

}
