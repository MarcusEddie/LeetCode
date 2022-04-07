package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1403 {

    public static void main(String[] args) {
        int[] nums = {7,4,2,8,1,7,7,10};
        System.out.println(new Solution().minSubsequence(nums).toString());
    }
    
    private static class Solution {
        public List<Integer> minSubsequence(int[] nums) {
            List<Integer> rs = new ArrayList<Integer>();
            int sum = 0;
            int[] slot = new int[101];
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                slot[nums[i]]++;
                if (max < nums[i]) {
                    max = nums[i];
                }
                sum += nums[i];
            }
            
            int sum2 = 0;
            
            while (sum >= sum2) {
                if (slot[max] == 0) {
                    max--;
                }
                if (slot[max] > 0) {
                    sum2 += max;
                    rs.add(max);
                    sum -= max;
                    slot[max]--;
                }
            }
            return rs;
        }
    }

}
