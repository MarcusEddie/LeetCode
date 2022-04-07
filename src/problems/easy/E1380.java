package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1380 {

    public static void main(String[] args) {
        int[][] matrix = {{7,8},{1,2}};
        System.err.println(new Solution().luckyNumbers(matrix).toString());
    }
    
    private static class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> rs = new ArrayList<Integer>();
            
            for (int i = 0; i < matrix.length; i++) {
                int[] row = new int[100001];
                int rowMin = Integer.MAX_VALUE;
                int colMax = 0;
                for (int j = 0; j < matrix[i].length; j++) {
                    row[matrix[i][j]] = j;
                    if (rowMin > matrix[i][j]) {
                        rowMin = matrix[i][j];
                    }
                }
                for (int j = 0; j < matrix.length; j++) {
                    if (colMax < matrix[j][row[rowMin]]) {
                        colMax = matrix[j][row[rowMin]];
                    }
                }
                if (rowMin == colMax) {
                    rs.add(rowMin);
                }
            }
            return rs;
        }
    }

}
