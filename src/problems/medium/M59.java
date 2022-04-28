package problems.medium;

public class M59 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int[][] generateMatrix(int n) {
            int[][] rs = new int[n][n];
            int total = 1;
            int end = n * n;
            int row = 0;
            int col = 0;
            while (total <= end) {
                rs[row][col] = total++;
                if (rs[row][col] !=0 && row < n - 1) {
                    row++;
                } else if (row == n - 1) {
                    col--;
                } else if (col == 0) {
                    row--;
                } else if (row == 0) {
                    col++;
                }
            }
            return rs;
        }
    }

}
