package problems.easy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class E1037 {

    public static void main(String[] args) {
        int[][] points = {{40,93},{45,34},{10,89}};
        System.out.println(new Solution().isBoomerang(points));
    }
    
    private static class Solution {
        public boolean isBoomerang(int[][] points) {
            boolean rs = true;
            int y = points[0][1];
            int x = points[0][0];
            if (x == points[1][0] && x == points[2][0]) {
                rs = false;
                return rs;
            }
            if (y == points[1][1] && y == points[2][1]) {
                rs = false;
                return rs;
            }
            if ((x == points[1][0] && y == points[1][1]) || (x == points[2][0] && y == points[2][1]) || (points[2][0] == points[1][0] && points[2][1] == points[1][1])) {
                rs = false;
                return rs;
            }
            BigDecimal slope1 = new BigDecimal(points[1][1] - y);
            if (points[1][0] - x == 0) {
                slope1 = slope1.setScale(10000);
            } else {
                slope1 = slope1.divide(new BigDecimal(points[1][0] - x), 20, RoundingMode.HALF_UP);
            }
            
            BigDecimal slope2 = new BigDecimal(points[2][1] - y);
            if (points[2][0] - x == 0) {
                slope2 = slope2.setScale(10000);
            } else {
                slope2 = slope2.divide(new BigDecimal(points[2][0] - x), 20, RoundingMode.HALF_UP);
            }
            if (slope1.equals(slope2)) {
                rs = false;
            }
            return rs;
        }
    }

}
