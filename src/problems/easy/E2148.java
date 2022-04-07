package problems.easy;

public class E2148 {

    public static void main(String[] args) {
        int[] nums = {11,7,2,15};
        System.out.println(new Solution().countElements(nums));
    }
    
    private static class Solution {
        public int countElements(int[] nums) {
            int[] slot = new int[200001];
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++){
                slot[nums[i] + 100000]++;
                if(nums[i] + 100000 > max){
                    max = nums[i] + 100000;
                }
                if(nums[i] + 100000 < min){
                    min = nums[i] + 100000;
                }
            }
            int rs = 0;
            
//            for (int i = 100000; i < 100000 + 20; i++) {
//                System.out.print(slot[i] + " ");
//            }
//            System.out.println();
//            System.out.println(min);
//            System.out.println(max);
            for(int i = min + 1; i < max; i++){
                rs = rs + slot[i];
            }
            return rs;
        }
    }

}
