package problems.easy;

public class E88 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        new Solution().merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (m == 0 && n != 0) {
                for (int i = 0; i < nums2.length; i++) {
                    nums1[i] = nums2[i];
                }
            } else if (m != 0 && n ==0) {
                ;
            } else if (m != 0 && n != 0) {
                for (int i = 0; i < nums2.length; i++) {
                    int tmp = m - 1;
                    m++;
                    while (tmp >= 0) {
                        if (nums1[tmp]> nums2[i]) {
                            nums1[tmp + 1] = nums1[tmp];
                            for (int i1 : nums1) {
                                System.out.print(i1 + " ");
                            }
                            System.out.println();
                        } else {
                            nums1[tmp + 1] = nums2[i];
                            for (int i1 : nums1) {
                                System.out.print(i1 + " ");
                            }
                            System.out.println();
                        }
                        tmp--;
                    }
                }
            }
        }
    }

}
