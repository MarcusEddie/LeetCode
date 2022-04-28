package problems.easy;

import java.util.Arrays;

public class E88 {

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        new Solution().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (m == 0 && n != 0) {
                for (int i = 0; i < nums2.length; i++) {
                    nums1[i] = nums2[i];
                }
            } else if (m != 0 && n != 0) {
                for (int i = 0; i < nums2.length; i++) {
                    if (nums2[i] >= nums1[m - 1]) {
                        nums1[m] = nums2[i];
                    } else {
                        for (int j = m - 1; j >= 0; j--) {
                            if (nums2[i] < nums1[j]) {
                                nums1[j + 1] = nums1[j];
                                nums1[j] = nums2[i];
                            }
                        }
                    }
                    m++;
                }
            }
        }
    }

}
