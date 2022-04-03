package problems.easy;

public class E2176 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int k = 1;
        System.out.println(new Solution().countPairs(nums, k));
    }
    
    private static class Solution {
        public int countPairs(int[] nums, int k) {
            int rs = 0;
            int[][] slot = new int[101][nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                int tmp = slot[nums[i]][0];
                slot[nums[i]][tmp + 1] = i;
                slot[nums[i]][0] = tmp + 1;
            }
            
//            for (int i = 0; i < slot.length; i++) {
//                for (int j = 0; j < slot[i].length; j++) {
//                    System.out.print(slot[i][j] + " ");
//                }
//                System.out.println();
//            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i][0] > 1) {
                    int tmp =0;
                    for (int j = 1; j <= slot[i][0]; j++) {
                        for (int j2 = 1; j2 <= slot[i][0] && j != j2; j2++) {
                            if (slot[i][j] * slot[i][j2] % k == 0) {
//                                System.out.println(slot[i][j]+" "+slot[i][j2] );
                                tmp++;
                            }
                        }
                    }
//                    System.out.println(tmp);
                    rs = rs + tmp;
                }
            }
            return rs;
        }
    }

}
