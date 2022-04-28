package problems.easy;

public class E1779 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int nearestValidPoint(int x, int y, int[][] points) {
            int rs = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < points.length; i++) {
                if (points[i][0] == x) {
                    int dist = Math.abs(points[i][1] - y);
                    if (min > dist) {
                        min = dist;
                        rs = i;
                    }
                } else if (points[i][1] == y) {
                    int dist = Math.abs(points[i][0] - x);
                    if (min > dist) {
                        min = dist;
                        rs = i;
                    }
                }
            }
            return rs;
        }
    }

}
