package problems.easy;

public class E463 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int islandPerimeter(int[][] grid) {
            int rs = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (i - 1 >=0 && grid[i-1][j] == 0 && grid[i][j] == 1) {
                        rs++;
                    } else if (i  ==0 && grid[i][j] == 1) {
                        rs++;
                    }
                    
                    if (i + 1 <grid.length && grid[i+1][j] == 0 && grid[i][j] == 1) {
                        rs++;
                    } else if (i  ==grid.length - 1 && grid[i][j] == 1) {
                        rs++;
                    }
                    
                    if (j - 1 >= 0 && grid[i][j - 1] == 0 && grid[i][j] == 1) {
                        rs++;
                    } else if (j == 0 && grid[i][j] == 1 ) {
                        rs++;
                    }
                    
                    if (j + 1 < grid[i].length && grid[i][j + 1] == 0 && grid[i][j] == 1) {
                        rs++;
                    } else if (j == grid[i].length - 1 && grid[i][j] == 1) {
                        rs++;
                    }
                }
            }
            return rs;
        }
    }

}
