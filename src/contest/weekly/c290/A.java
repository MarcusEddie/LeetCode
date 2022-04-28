package contest.weekly.c290;

import java.util.ArrayList;
import java.util.List;

public class A {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] nums = { {3,1,2},{4,5,6}};
        System.out.println(solution.intersection(nums));
        
    }

    private static class Solution {
        public List<Integer> intersection(int[][] nums) {
            List<Integer> rs = new ArrayList<Integer>();
            int[] slot = new int[1001];
            int min = 10000;
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    slot[nums[i][j]]++;
                    if (min > nums[i][j]) {
                        min = nums[i][j];
                    }
                    if (max < nums[i][j]) {
                        max = nums[i][j];
                    }
                }
            }
            for (int i = min; i <=max; i++) {
                if (slot[i] == nums.length) {
                    rs.add(i);
                }
            }
            return rs;
        }
    }

}
