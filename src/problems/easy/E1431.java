package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1431 {

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(new Solution().kidsWithCandies(candies, extraCandies).toString());
    }
    
    private static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> rs = new ArrayList<Boolean>();
            int max = 0;
            for (int i = 0; i < candies.length; i++) {
                if (max < candies[i]) {
                    max = candies[i];
                }
            }
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] + extraCandies < max) {
                    rs.add(false);
                } else {
                    rs.add(true);
                }
            }
            return rs;
        }
    }

}
