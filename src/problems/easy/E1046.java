package problems.easy;

import java.util.Arrays;

public class E1046 {

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8};
        System.out.println(new Solution().lastStoneWeight(stones));
    }

    private static class Solution {
        public int lastStoneWeight(int[] stones) {
            int idx = stones.length - 1;
            while (idx > 0) {
                Arrays.sort(stones);
                if (stones[idx] == stones[idx - 1]) {
                    stones[idx] = 2000;
                    stones[idx - 1] = 2000;
                    idx = idx - 2;
                } else {
                    stones[idx - 1] = stones[idx] - stones[idx - 1];
                    stones[idx] = 2000;
                    idx--;
                }
            }

            if (stones[0] == 2000) {
                return 0;
            }
            return stones[0];
        }
    }

}
