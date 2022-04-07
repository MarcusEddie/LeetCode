package problems.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class E169 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int majorityElement(int[] nums) {
            int rs = 0;
            int limit = nums.length / 2;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    Integer tmp = map.get(nums[i]);
                    map.put(nums[i], tmp + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
            Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.Integer,java.lang.Integer> entry = (Map.Entry<java.lang.Integer,java.lang.Integer>) it
                        .next();
                if (entry.getValue() > limit) {
                    rs = entry.getKey();
                    break;
                }
                
            }
            return rs;
        }
    }

}
