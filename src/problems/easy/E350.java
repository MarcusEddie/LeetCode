package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E350 {

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {4,4,9,9,8};
        int[] rs = new Solution().intersect(nums1, nums2);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            int[] slot = new int[1001];
            for (int i = 0; i < nums1.length; i++) {
                slot[nums1[i]]++;
            }
            int[] slot2 = new int[1001];
            List<Integer> set = new ArrayList<Integer>();
            for (int i = 0; i < nums2.length; i++) {
                slot2[nums2[i]]++;
            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] > 0 && slot2[i] > 0) {
                    int len = slot[i] > slot2[i] ? slot2[i] : slot[i];
                    while (len > 0) {
                        set.add(i);
                        len--;
                    }
                }
            }

            int[] rs = new int[set.size()];
            for (int i = 0; i < rs.length; i++) {
                rs[i] = set.get(i);
            }
            // list.toArray(rs);
            return rs;
        }
    }

}
