package problems.easy;

import java.util.Arrays;

public class E496 {

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(new Solution().nextGreaterElement(nums1, nums2)));
    }
    
    private static class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] rs = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                int elem = nums1[i];
                boolean flag = false;
                for (int j = 0; j < nums2.length; j++) {
                    if (nums2[j] == elem) {
                        flag = true;
                    }
                    if (flag) {
                        if (nums2[j] > elem) {
                            elem = nums2[j];
                            break;
                        }
                    }
                }
                
                rs[i] = elem == nums1[i] ? -1 : elem;
            }
            return rs;
        }
    }

}
