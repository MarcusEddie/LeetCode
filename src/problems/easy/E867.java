package problems.easy;

public class E867 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int[][] transpose(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i + 1; j < matrix[i].length; j++) {
                    matrix[i][j] = matrix[i][j] + matrix[j][i];
                    matrix[j][i] = matrix[i][j] - matrix[j][i];
                    matrix[i][j] = matrix[i][j] - matrix[j][i];
                }
            }
            return matrix;
        }
    }

}
