package problems.easy;

import java.util.Arrays;

public class E1103 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().distributeCandies(4, 1)));
    }
    
    private static class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            int[] rs = new int[num_people];
            int n = 1;
            while (candies > 0) {
                int idx = (n - 1) % (num_people);
                
                if (candies >= n) {
                    candies = candies - n;
                } else {
                    n = candies;
                    candies = 0;
                }
                rs[idx] = rs[idx] + n++;
            }
            return rs;
        }
    }

}
