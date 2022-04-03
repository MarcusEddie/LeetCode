package problems.easy;

public class E1351 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int countNegatives(int[][] grid) {
            int rs = 0;
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][0] < 0) {
                    rs = rs + grid[i].length;
                } else if (grid[i][0] >= 0 && grid[i][grid[i].length - 1] < 0) {
                    for (int j = 0; j < grid[i].length; j++) {
                        if (grid[i][j] < 0) {
                            rs++;
                        }
                    }
                }
            }
            return rs;
        }
    }

}
