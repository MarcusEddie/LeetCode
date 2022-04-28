package problems.easy;

import java.util.Arrays;

public class E27 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(new Solution().removeElement(nums, 2));
        int[] nums1 = {3,2,2,3};
        System.out.println(new Solution().removeElement(nums1, 3));
        int[] nums2 = {3,3};
        System.out.println(new Solution().removeElement(nums2, 3));
    }
    
    private static class Solution {
        public int removeElement(int[] nums, int val) {
            int rs = 0;
            
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] == val && i == nums.length - 1) {
                    nums[i] = -1;
                    rs++;
                }
                if (nums[i] == val) {
                    rs++;
                    for (int j = i; j < nums.length - 1; j++) {
                        nums[j] = nums[j+1];
                    }
                }
            }
            System.out.println(Arrays.toString(nums));

           
            return nums.length - rs;
        }
    }

}
