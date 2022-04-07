package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1582 {

    public static void main(String[] args) {
        int[][] mat = {{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,1},{0,0,0,0,1,0,0,0},{1,0,0,0,1,0,0,0},{0,0,1,1,0,0,0,0}};
        System.out.println(new Solution().numSpecial(mat));
    }
    
    private static class Solution {
        public int numSpecial(int[][] mat) {
            int rs = 0;
            List<Integer> cols = new ArrayList<Integer>();
            
            for (int i = 0; i < mat.length; i++) {
                int col = 0;
                int row = 0;
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == 1) {
                        row++;
                        col = j;
                        if (row > 1) {
                            break;
                        }
                    }
                }
                if (row == 1) {
                    cols.add(col);
                }
            }
            System.out.println(cols.toString());
            for (int j = 0; j < cols.size(); j++) {
                int row = 0;
                for (int i = 0; i < mat.length; i++) {
                    if (mat[i][cols.get(j)] == 1) {
                        row++;
                        if (row > 1) {
                            break;
                        }
                    }
                }
                if (row == 1) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
