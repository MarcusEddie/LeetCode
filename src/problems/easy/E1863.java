package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class E1863 {

    public static void main(String[] args) {
        int[] nums = { 10,5,8,3,6,12,2,4,11,7,1,9 };
        System.out.println(new Solution().subsetXORSum(nums));
    }

    private static class Solution {
        public int subsetXORSum(int[] nums) {
            int rs = 0;
            if (nums.length == 0) {
                return rs;
            }
            for (int i = 0; i < nums.length; i++) {
                rs = rs + nums[i];
            }
            int len = 2;
            while (len <= nums.length) {
                List<String> list = gen(nums.length, len);
                System.out.println(list.toString());
                for (String string : list) {
                    String[] idx = string.split(" ");
                    int sum = nums[Integer.valueOf(idx[0]) - 1];
                    for (int i = 1; i < idx.length; i++) {
                        sum = sum ^ nums[Integer.valueOf(idx[i]) - 1];
                    }
                    rs = rs + sum;
                }
                len++;
            }
            return rs;
        }

        private List<String> gen(int n, int len) {
            List<String> rs = new ArrayList<String>();
            Queue<String> queue = new LinkedBlockingDeque<String>();
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (int i = 1; i <= n; i++) {
                queue.offer(String.valueOf(i));
                map.put(String.valueOf(i), i);
            }
            while (!queue.isEmpty()) {
                String tmp = queue.poll();
                Integer tmpSet = map.get(String.valueOf(tmp));
                for (int i = tmpSet + 1; i <= n; i++) {
                    String newItem = new StringBuilder(tmp).append(" ").append(i).toString();
                    if (newItem.length() + 1 == len * 2) {
                        rs.add(newItem);
                    } else {
                        queue.offer(newItem);
                        map.put(newItem, i);
                    }
                }
            }
            return rs;
        }
    }

}
