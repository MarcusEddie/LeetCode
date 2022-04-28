package problems.easy;

public class E704 {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(new Solution().search(nums, 9));
    }
    
    private static class Solution {
        public int search(int[] nums, int target) {
            int rs = -1;
            int lo = 0;
            int hi = nums.length - 1;
            int mid = (lo + hi) / 2;
            while(lo <= hi){
                if(target < nums[mid]){
                    hi = mid - 1;
                } else if (target > nums[mid]){
                    lo = mid + 1;
                } else{
                    rs = mid;
                    break;
                }
                mid = (lo + hi) / 2;
            }
            return rs;
        }
    }

}
