package problems.easy;

public class E1470 {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2}; 
        int n = 2;
        int[] rs = new Solution().shuffle(nums, n);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] rs = new int[nums.length];
            int idx = 0;
            for(int i = 0; i<n; i++) {
                rs[idx++] = nums[i];
                rs[idx++] = nums[i + n];
            }
            return rs;
        }
    }
}
