package problems.easy;

public class E414 {

    public static void main(String[] args) {
        int[] nums = {2,1};
        System.out.println(new Solution().thirdMax(nums));
    }
    
    private static class Solution {
        public int thirdMax(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            int rs = 0;
            long[] slot = new long[3];
            slot[2] = nums[0];
            slot[1] = Long.MIN_VALUE;
            slot[0] = Long.MIN_VALUE;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > slot[2]) {
                    slot[0] = slot[1];
                    slot[1] = slot[2];
                    slot[2] = nums[i];
                    rs++;
                } else if (slot[1] < nums[i] && nums[i] < slot[2]) {
                    slot[0] = slot[1];
                    slot[1] = nums[i];
                    rs++;
                } else if (slot[0] < nums[i] && nums[i] < slot[1]) {
                    slot[0] = nums[i];
                    rs++;
                }
                
                for (long ij : slot) {
                    System.out.print(ij + " ");
                }
                System.out.println();
                
            }
            System.out.println(rs);
            if (slot[0] == Long.MIN_VALUE) {
                return (int) slot[2];
            } else {
                return (int) slot[0];
            }
        }
    }

}
