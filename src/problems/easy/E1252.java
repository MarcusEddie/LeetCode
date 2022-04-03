package problems.easy;

public class E1252 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public int oddCells(int m, int n, int[][] indices) {
            int rs = 0;
            int[][] matrix = new int[m][n];
            for (int i = 0; i < indices.length; i++) {
                int row = indices[i][0];
                int col = indices[i][1];
                for(int j = 0; j < matrix[row].length; j++) {
                    matrix[row][j] = matrix[row][j] + 1;
                }
                for(int j = 0; j < matrix.length; j++) {
                    matrix[j][col] = matrix[j][col] + 1;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if ((matrix[i][j] & 1) == 1) {
                        rs++;
                    }
                }
            }
            return rs;
        }
    }

}
