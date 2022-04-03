package problems.easy;

public class E1909 {

    public static void main(String[] args) {
        int[] nums = { 1,2,3,4};
        System.out.println(new Solution().canBeIncreasing(nums));
        
        int[] nums1 = { 1,2,5,10,7};
        System.out.println(new Solution().canBeIncreasing(nums1));
        int[] nums2 = { 2,3,1,2};
        System.out.println(new Solution().canBeIncreasing(nums2));
        int[] nums3 = { 1,1,1,1,1};
        System.out.println(new Solution().canBeIncreasing(nums3));
        int[] nums4 = { 101,23,101};
        System.out.println(new Solution().canBeIncreasing(nums4));
        int[] nums5 = { 105,924,38,994};
        System.out.println(new Solution().canBeIncreasing(nums5));
        int[] nums6 = { 995,2,3,48};
        System.out.println(new Solution().canBeIncreasing(nums6));
        int[] nums7 = { 449,354,508,962};
        System.out.println(new Solution().canBeIncreasing(nums7));
        

    }

    private static class Solution {
        public boolean canBeIncreasing(int[] nums) {
            boolean rs = false;
            if (nums.length < 3) {
                return true;
            }
            if (nums.length == 3) {
                int i = 0;
                if ((nums[i] < nums[i + 1]) && (nums[i + 1] < nums[i + 2]) && (nums[i] < nums[i + 2])) {
                    return true;
                } else if ((nums[i] < nums[i + 1]) && (nums[i + 1] > nums[i + 2])) {
                    return true;
                } else if ((nums[i] > nums[i + 1]) && (nums[i + 1] < nums[i + 2])) {
                    return true;
                } else {
                    return false;
                }
            }

            int cnt = 0;
            int cnt2 = 0;
            int left = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if ((left < nums[i]) && (nums[i] < nums[i + 1]) && (left < nums[i + 1])) {
                    cnt2++;
                }
                if ((left < nums[i]) && (nums[i] > nums[i + 1]) && (left < nums[i + 1])) {
                    cnt++;
                    if (cnt >= 2) {
                        break;
                    }
                }
                if ((left > nums[i]) && (nums[i] < nums[i + 1]) && (left < nums[i + 1])) {
                    cnt++;
                    if (cnt >= 2) {
                        break;
                    }
                }
                left = nums[i];
            }
            if (cnt2 == nums.length - 1) {
                rs = true;
            } else {
                if (cnt == 1) {
                    rs = true;
                }
            }
            System.out.println(cnt);
            return rs;
        }
    }

}
