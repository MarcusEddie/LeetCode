package problems.easy;

public class E74 {

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 99;
        System.out.println(new Solution().searchMatrix(matrix, target));
    }
    
    private static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            boolean rs = false;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][0]<= target) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (matrix[i][j] == target) {
                            rs = true;
                            break;
                        }
                    }
                }
                if (rs) {
                    break;
                }
            }
            return rs;
        }
    }

}
