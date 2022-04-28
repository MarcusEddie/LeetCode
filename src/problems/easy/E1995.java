package problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class E1995 {

    public static void main(String[] args) {
        int[] nums = { 1,1,1,3,5 };
        System.out.println(new Solution().countQuadruplets(nums));
    }

    private static class Solution {
        public int countQuadruplets(int[] nums) {
            int rs = 0;

            int len = nums.length;
            Queue<List<Integer>> queue = new LinkedBlockingQueue<List<Integer>>();
            for (int i = 0; i < len; i++) {
                List<Integer> list = new ArrayList<Integer>();
                list.add(i);
                queue.offer(list);
            }
            while (!queue.isEmpty()) {
                List<Integer> list = queue.poll();
                if (list.size() < 4) {
                    if (list.get(list.size() - 1) + 4 - list.size() <= len - 1) {
                        for (int i = list.get(list.size() - 1) + 1; i < len; i++) {
                            List<Integer> tmp = new ArrayList<Integer>(list);
                            tmp.add(i);
//                            System.out.println(tmp.toString());
                            queue.offer(tmp);
                        }
                    }
                } else {
                    if (nums[list.get(0)] + nums[list.get(1)]
                            + nums[list.get(2)] == nums[list.get(3)]) {
                        rs++;
                    }
                }
            }

            return rs;
        }

    }

}
