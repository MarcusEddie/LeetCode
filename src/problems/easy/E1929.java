package problems.easy;

public class E1929 {

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] rs = new Solution().getConcatenation(nums);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static class Solution {
        public int[] getConcatenation(int[] nums) {
            int[] rs = new int[nums.length * 2];
            for (int i = 0; i < nums.length; i++) {
                rs[i] = nums[i];
                rs[i + nums.length] = nums[i];
            }
            return rs;
        }
    }
}

