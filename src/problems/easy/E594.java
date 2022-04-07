package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E594 {

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(new Solution().findLHS(nums));
    }
    
    private static class Solution {
        public int findLHS(int[] nums) {
            int rs = 0;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            List<Integer> list = new ArrayList<Integer>();
            
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    Integer tmp = map.get(Integer.valueOf(nums[i]));
                    map.put(nums[i], tmp + 1);
                } else {
                    list.add(nums[i]);
                    map.put(nums[i], 1);
                }
            }
//            System.out.println(map.toString());
            Collections.sort(list);
//            System.out.println(list.toString());
            for(int i = 1; i< list.size(); i++) {
                if ((list.get(i) - list.get(i - 1) == 1)) {
                    int len = map.get(list.get(i)) + map.get(list.get(i - 1));
                    if (rs < len) {
                        rs = len;
                    }
                }
            }
            
            return rs;
        }
    }

}
