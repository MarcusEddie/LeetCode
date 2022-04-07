package problems.easy;

public class E26 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(new Solution().removeDuplicates(nums));
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int removeDuplicates(int[] nums) {
            int rs = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[rs] = nums[i];
                    rs++;
                }
            }
            return rs;
        }
    }

}
