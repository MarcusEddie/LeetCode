package problems.easy;

import java.util.Arrays;

public class E766 {

    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int[][] matrix = {{1,5,9},{2,1,5},{3,2,1}, {4,3,2}, {5,4,3}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(new Solution().isToeplitzMatrix(matrix));
    }
    
    private static class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            boolean rs = true;
            int col = matrix[0].length;
            for (int i = 0; i < matrix[0].length; i++) {
                int row = matrix.length > (col - i) ? col - i : matrix.length;
                for (int j = 0; j < row - 1; j++) {
                    System.out.println(matrix[0 + j][i + j] + " " + matrix[0 + j + 1][i+j + 1]);
                    if (matrix[0 + j][i + j] != matrix[0 + j + 1][i+j + 1]) {
                        rs = false;
                        break;
                    }
                }
                if (!rs) {
                    break;
                }
            }
            if (!rs) {
                return rs;
            }
            for (int i = 1; i < matrix.length; i++) {
                int col1 = col > matrix.length - i ? matrix.length - i : col;
                for (int j = 0; j < col1 - 1; j++) {
                    System.out.println(matrix[i + j][0 + j] + " " + matrix[i + j + 1][0+j + 1]);
                    if (matrix[i + j][0 + j] != matrix[i + j + 1][0+j + 1]) {
                        rs = false;
                        break;
                    }
                }
                if (!rs) {
                    break;
                }
            }
            return rs;
        }
    }

}
