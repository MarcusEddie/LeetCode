package problems.easy;

public class E1920 {

    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] rs = new Solution().buildArray(nums);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class Solution {
    public int[] buildArray(int[] nums) {
        int[] rs = new int[nums.length];
        for (int i = 0; i < rs.length; i++) {
            rs[i] = nums[nums[i]];
        }
        return rs;
    }
}