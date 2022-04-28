package problems.easy;

public class E892 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int surfaceArea(int[][] grid) {
            int rs = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] != 0) {
                        rs += 2;
                    }
                    if (i == 0) {
                        rs += grid[i][j];
                    }
                    if (j == 0) {
                        rs += grid[i][j];
                    }
                    if (j < grid[i].length - 1) {
                        rs += Math.abs(grid[i][j] - grid[i][j+1]);
                    } else if (j == grid[i].length - 1) {
                        rs += grid[i][j];
                    }
                    if (i < grid.length - 1) {
                        rs += Math.abs(grid[i][j] - grid[i+1][j]);
                    } else if (i == grid.length - 1) {
                        rs+= grid[i][j];
                    }
                }
            }
            return rs;
        }
    }

}
