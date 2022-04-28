package problems.easy;

public class E883 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int projectionArea(int[][] grid) {
            int rs = 0;
            for (int i = 0; i < grid.length; i++) {
                int row = 0;
                int col = 0;
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] != 0) {
                        rs++;
                    }
                    if (grid[i][j] > row) {
                        row = grid[i][j];
                    }
                    if (grid[j][i] > col) {
                        col = grid[j][i];
                    }
                }
                rs += row;
                rs += col;
            }
            return rs;
        }
    }

}
