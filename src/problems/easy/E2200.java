package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E2200 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
            List<Integer> rs = new ArrayList<Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == key) {
                    for (int j = i - k; j <= i + k; j++) {
                        if (j >= 0) {
                            rs.add(j);
                        }
                    }
                }
            }
            return rs;
        }
    }

}
