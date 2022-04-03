package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class E219 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(new Solution().containsNearbyDuplicate(nums, k));
    }
    
    private static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Boolean rs = false;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(Integer.valueOf(nums[i]))) {
                    map.put(Integer.valueOf(nums[i]), i + 1);
                } else {
                    if (i + 1 - map.get(Integer.valueOf(nums[i])) <= k) {
                        rs = true;
                        break;
                    } else {
                        map.put(Integer.valueOf(nums[i]), i + 1);
                    }
                }
            }
            return rs;
        }
    }

}
