package problems.easy;

import java.util.Arrays;

public class E566 {

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] rs = new Solution().matrixReshape(mat, r, c);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(Arrays.toString(rs[i]));
        }
    }
    
    private static class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            int[][] rs = new int[r][c];
            int realCnt = mat.length * mat[0].length;
            if (realCnt != r * c) {
                return mat;
            }
            
            int row = 0;
            int col = 0;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    rs[row][col] = 0;
                    col++;
                    if (col == c) {
                        col = 0;
                        row++;
                    }
                }
            }
            return rs;
        }
    }

}
