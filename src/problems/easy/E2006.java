package problems.easy;

public class E2006 {

    public static void main(String[] args) {
//        int[] nums = {7,7,8,3,1,2,7,2,9,5};
//        int k = 6;
//        int[] nums = {1,2,2,1};
//        int k = 1;
        int[] nums = {3,2,1,5,4};
        int k = 2;
        
        System.out.println(new Solution().countKDifference(nums, k));
    }
    
    private static class Solution {
        public int countKDifference(int[] nums, int k) {
            int rs = 0;
            int[] slot = new int[101];
            for (int i = 0; i < nums.length; i++) {
                slot[nums[i]] = slot[nums[i]] + 1;
            }
//            for (int j : slot) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
            for (int i = 0; i < nums.length; i++) {
                int sum = nums[i] + k;
                boolean flag = false;
                if (sum <= 100) {
                    flag = true;
                    rs = rs + slot[sum];
                }
                int diff = nums[i] - k;
                if (diff > 0) {
                    if (!((diff == nums[i]) && slot[diff] == 1)) {
                        rs = rs+slot[diff];
                        flag = true;
                    }
                }
                if (flag) {
                    slot[nums[i]]--;
                }
                
//                for (int j : slot) {
//                    System.out.print(j + " ");
//                }
//                System.out.println();
//                System.out.println(rs);
            }
            return rs;
        }
    }

}
