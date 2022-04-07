package problems.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E2032 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2};
        int[] nums2 = {4,3,3};
        int[] nums3 = {5};
        System.out.println(new Solution().twoOutOfThree(nums1, nums2, nums3).toString());
    }
    
    private static class Solution {
        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            int[] slot = new int[101];
            Set<Integer> set = new HashSet<Integer>();
            for(int i = 0; i < nums1.length; i++){
                if(!set.contains(nums1[i])){
                    slot[nums1[i]] = 1;
                    set.add(nums1[i]);
                }
            }
            
            set.clear();
            for(int i = 0; i < nums2.length; i++){
                if(!set.contains(nums2[i])){
                    slot[nums2[i]] += 1;
                    set.add(nums2[i]);
                }
            }
            
            set.clear();
            for(int i = 0; i < nums3.length; i++){
                if(!set.contains(nums3[i])){
                    slot[nums3[i]] += 1;
                    set.add(nums3[i]);
                }
            }
            
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i = 0; i < slot.length; i++){
                if(slot[i] >= 2){
                    tmp.add(i);
                }
            }
            
            return tmp;
        }
    }

}
