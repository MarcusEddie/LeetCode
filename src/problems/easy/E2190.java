package problems.easy;

public class E2190 {

    public static void main(String[] args) {
        int[] nums = {1,100,200,1,100};
        System.out.println(new Solution().mostFrequent(nums, 1));
    }
    
    private static class Solution {
        public int mostFrequent(int[] nums, int key) {
            int[] slot = new int[1001];
            int min = Integer.MAX_VALUE;
            int max = 0;
            for(int i =0 ; i < nums.length - 1; i++){
                if(nums[i] == key){
                    slot[nums[i + 1]]++;
                    if(min > nums[i + 1]){
                        min = nums[i + 1];
                    }
                    if(max < nums[i+1]){
                        max = nums[i + 1];
                    }
                }

            }
            int rs = 0;
            int max1 = 0;
            for(int i = min; i <= max; i++){
                if(max1 < slot[i]){
                    max1 = slot[i];
                    rs = i;
                }
            }
            return rs;

        }
    }

}
