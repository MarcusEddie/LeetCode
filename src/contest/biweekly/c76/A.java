package contest.biweekly.c76;

import java.util.Arrays;

public class A {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        Solution solution = new Solution();
        System.out.println(solution.findClosestNumber(nums1));
        int[] nums2 = {-1,-2,-3,-4};
        System.out.println(solution.findClosestNumber(nums2));
        int[] nums3 = {-1,-2,3,4};
        System.out.println(solution.findClosestNumber(nums3));
        int[] nums4 = {-10,-12,3,4};
        System.out.println(solution.findClosestNumber(nums4));
        int[] nums5 = {61488,18221,-1321,90249,-62158,55128,-93476,53905,57644,24630,89599,-95795,-14891,-60298,17690,99022,-24006,-89156,80135,-46303,18812,59924,32024,82924,-47519,-77086,1763,68618,53629,-56957,95485,99630,-7977,31164,94481,-80239,-57749,-3319,-58231,-94841,-19292,33200,-31446,-3528,2229,74241,-19992,-91852,-28073,31453,-74484,35491,38870,-9499,39838,87369,21123,-38616,-89277,-14541,-81586,-18569,-58242,-71216,10816,15086,-10519,51080,53257,-4912,-37142,-16723,-69795,54937,-24920,68970,-10010,-81717,36203,-67939,73877,-58258,-57183,36637,91518,-8492,-57476,50523,62462,73152,-9511,-66761,28333,-87163,5187};
        System.out.println(solution.findClosestNumber(nums5));
    }

    private static class Solution {

        public int findClosestNumber(int[] nums) {
            int rs = 0;
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            if (nums[0] >= 0) {
                rs = nums[0];
            } else if (nums[nums.length - 1] < 0) {
                rs = nums[nums.length - 1];
            } else {
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] == 0) {
                        rs = nums[i];
                        break;
                    }
//                    if ((long)(nums[i] * nums[i + 1]) < 0) {
                    if (nums[i] < 0 && nums[i + 1] > 0) {
                        System.err.println(nums[i] + " " + nums[i+1] + " " + (nums[i] * nums[i + 1]));
                        if (0 - nums[i] < nums[i+1]) {
                            rs = nums[i];
                        } else {
                            rs = nums[i + 1];
                        }
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
