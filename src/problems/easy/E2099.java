package problems.easy;

public class E2099 {

    public static void main(String[] args) {
        int[] nums = {-16,-13,8,16,35,-17,30,-8,34,-2,-29,-35,15,13,-30,-34,6,15,28,-23,34,28,-24,15,-17,10,31,32,-3,-36,19,31,-5,-21,-33,-18,-23,-37,-15,12,-28,-40,1,38,38,-38,33,-35,-28,-40,4,-15,-29,-33,-18,-9,-29,20,1,36,-8,23,-34,16,-7,13,39,38,7,-7,-10,30,9,26,27,-37,-18,-25,14,-36,23,28,-15,35,-9,1};
        int[] rs = new Solution().maxSubsequence(nums, 8);
        for (int i : rs) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int[] maxSubsequence(int[] nums, int k) {
            int[] rs = new int[k];
            int max = 0;
            int min = 200002;
            int[] slot = new int[200001];
            for(int i = 0; i < nums.length; i++){
                int idx = nums[i] + 100000;
                if(max < idx){
                    max = idx;
                }
                if(min > idx){
                    min = idx;
                }
                    
                slot[idx] = slot[idx] + 1;
            }
            int mark = 0;
            int times = 0;
            for(int i = max; i >= min; i--){
                k = k - slot[i];
                if(k <= 0){
                    mark = i - 100000;
                    if (k == 0) {
                        times = slot[i];
                    } else {
                        times = k + slot[i];
                    }
                    break;
                }
            }
            int idx = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] >= mark && times > 0){
                    if (nums[i] == mark) {
                        times--;
                    }
                    rs[idx++] = nums[i];
                    if (idx >= rs.length) {
                        break;
                    }
                } else if (nums[i] > mark) {
                    rs[idx++] = nums[i];
                    if (idx >= rs.length) {
                        break;
                    }
                }
                    
            }
            return rs;
        }
    }

}
