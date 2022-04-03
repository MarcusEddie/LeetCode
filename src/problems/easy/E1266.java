package problems.easy;

public class E1266 {

    public static void main(String[] args) {
        int[][] points = {{3,2},{-2,2}};
        System.out.println(new Solution().minTimeToVisitAllPoints(points));
    }
    
    private static class Solution {
        public int minTimeToVisitAllPoints(int[][] points) {
            int rs = 0;
            int x = points[0][0];
            int y = points[0][1];
            for (int i = 1; i < points.length; i++) {
                int xlen = Math.abs(points[i][0] - x);
                int ylen = Math.abs(points[i][1] - y);
                rs = rs + (xlen > ylen ? xlen : ylen);
                x = points[i][0];
                y = points[i][1];
            }
            return rs;
        }
    }

}
