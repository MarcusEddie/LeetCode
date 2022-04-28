package problems.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class E347 {

    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        int[] rs = new Solution().topKFrequent(nums, 2);
        System.out.println(Arrays.toString(rs));
    }

    private static class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    Integer tmp = map.get(nums[i]);
                    map.put(nums[i], tmp + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }
            int[] rs = new int[k];
            int[] slot = new int[100001];
            Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
            int min = Integer.MAX_VALUE;
            int max = 0;

            PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(k);
            while (it.hasNext()) {
                Entry<Integer, Integer> entry = it.next();
                if (minHeap.size() < k) {
                    minHeap.offer(entry.getValue());
                } else if (minHeap.peek() < entry.getValue()) {
                    minHeap.poll();
                    minHeap.offer(entry.getValue());
                }
            }
            while (!minHeap.isEmpty()) {
                
            }
            int idx = 0;
            for (int i = max; i >= min; i--) {
                if (slot[i] != 0 && k > 0) {
                    k--;
                    rs[idx++] = slot[i];
                }
            }
            return rs;
        }
    }
}
