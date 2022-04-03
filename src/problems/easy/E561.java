package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E561 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int arrayPairSum(int[] nums) {
            int rs = 0;
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                tmp.add(nums[i]);
            }
            Collections.sort(tmp);
            for (int i = 0; i < tmp.size(); i = i + 1) {
                rs = rs + tmp.get(i);
            }
            return rs;
        }
    }

}
