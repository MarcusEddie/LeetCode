package problems.easy;

import java.util.Arrays;

public class E2022 {

    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int[][] rs = new Solution().construct2DArray(original, 2, 2);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(Arrays.toString(rs[i]));
        }
    }
    
    private static class Solution {
        public int[][] construct2DArray(int[] original, int m, int n) {
            int[][] rs = new int[m][n];
            if (m * n < original.length) {
                return rs;
            }
            int idx = -1;
            for (int i = 0; i < original.length; i++) {
                int col = i % n;
                if (col == 0) {
                    idx++;
                }
                rs[idx][col] = original[i];
            }
            return rs;
        }
    }

}
