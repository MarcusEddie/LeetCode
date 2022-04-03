package problems.easy;

public class E1527 {

    public static void main(String[] args) {
        int[][] mat = {};
        System.out.println(new Solution().diagonalSum(mat));
    }
    
    private static class Solution {
        public int diagonalSum(int[][] mat) {
            int rs = 0;
            for (int i = 0; i < mat.length; i++) {
                int left = i;
                int right = mat[i].length - 1 - i;
                if (left != right) {
                    rs = rs + mat[i][left] + mat[i][right];
                } else {
                    rs = rs + mat[i][left];
                }
            }
            return rs;
        }
    }

}
