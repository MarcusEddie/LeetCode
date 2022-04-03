package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E1913 {

    public static void main(String[] args) {
        int[] nums = {4,2,5,9,7,4,8};
        System.out.println(new Solution().maxProductDifference(nums));
    }
    
    private static class Solution {
        public int maxProductDifference(int[] nums) {
            int rs = 0;
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                tmp.add(nums[i]);
            }
            Collections.sort(tmp);
            rs = (tmp.get(tmp.size() - 1) * tmp.get(tmp.size() - 2)) - (tmp.get(0) * tmp.get(1)); 
            return rs;
        }
    }

}
