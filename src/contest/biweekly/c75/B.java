package contest.biweekly.c75;

import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) {
        int[] nums = {5};
        Solution solution = new Solution();
        System.out.println(solution.triangularSum(nums));
    }
    
    private static class Solution{
        public int triangularSum(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            List<Integer> tmp = new ArrayList<Integer>();
            for (int i = 0; i < nums.length - 1; i++) {
                int sum = (nums[i] + nums[i + 1]) % 10;
                tmp.add(sum);
            }
            
            while (tmp.size() != 1) {
                List<Integer> tmp2 = new ArrayList<Integer>();
                for(int i = 0; i < tmp.size() - 1; i++) {
                    int sum = (tmp.get(i) + tmp.get(i + 1)) % 10;
                    tmp2.add(sum);
                }
                tmp.clear();
                tmp.addAll(tmp2);
            }
            return tmp.get(0);
        }
    }

}
