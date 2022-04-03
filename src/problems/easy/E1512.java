package problems.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class E1512 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(new Solution().numIdenticalPairs(nums));
    }
    private static class Solution {
        public int numIdenticalPairs(int[] nums) {
            int rs = 0;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(Integer.valueOf(nums[i]))) {
                    Integer tmp = map.get(Integer.valueOf(nums[i]));
                    map.put(Integer.valueOf(nums[i]), tmp + 1);
                } else {
                    map.put(Integer.valueOf(nums[i]), 1);
                }
            }
            Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.Integer,java.lang.Integer> entry = (Map.Entry<java.lang.Integer,java.lang.Integer>) it
                        .next();
                if (entry.getValue().compareTo(1) > 0) {
                    rs = rs + (entry.getValue() * (entry.getValue() - 1)) / 2;
                }
            }
            return rs;
        }
    }

}
