package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E2089 {

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 5;
        System.out.println(new Solution().targetIndices(nums, target).toString());
    }
    
    private static class Solution {
        public List<Integer> targetIndices(int[] nums, int target) {
            List<Integer> rs = new ArrayList<Integer>();
            int[][] slot = new int[101][1];
            for (int i = 0; i < nums.length; i++) {
                int tmp = slot[nums[i]][0];
                slot[nums[i]][0] = tmp + 1;
            }
//            
//            for (int i = 0; i < slot.length; i++) {
//                for (int j = 0; j < slot[i].length; j++) {
//                    System.out.print(slot[i][j] + " ");
//                }
//                System.out.println();
//            }
            int start = 0;
            for (int i = 0; i < slot.length; i++) {
                start = start + slot[i][0];
                if (i== target) {
                    for (int j = 0; j < slot[i][0]; j++) {
                        rs.add(start - slot[i][0] + j);
                    }
                    break;
                }
            }
            return rs;
        }
    }

}
