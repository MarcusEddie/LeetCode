package problems.easy;

import java.util.Arrays;

public class E1886 {

    public static void main(String[] args) {

        int[][] mat = { {0,0,0},{0,1,0},{1,1,1} };
        int[][] target = { {1,1,1},{0,1,0},{0,0,0} };
        System.out.println(new Solution().findRotation(mat, target));
    }

    private static class Solution {
        public boolean findRotation(int[][] mat, int[][] target) {
            boolean rs = false;
            if (check(mat, target)) {
                rs = true;
                return rs;
            }
            int times = 3;
            while (times > 0) {
                int[][] tmp = new int[mat.length][mat[0].length];
                for (int i = 0; i < mat.length; i++) {
                    for (int j = 0; j < mat[i].length; j++) {
                        tmp[j][mat.length - 1 - i] = mat[i][j];
                    }
                }
                
                boolean flag = check(tmp, target);
                if (flag) {
                    rs = true;
                    break;
                }
                for (int i = 0; i < tmp.length; i++) {
                    for (int j = 0; j < tmp[i].length; j++) {
                        mat[i][j] = 0;
                        mat[i][j] = tmp[i][j];
                    }
                }
                times--;
            }
            return rs;
        }

        private boolean check(int[][] mat, int[][] target) {
            for (int i = 0; i < mat.length; i++) {
                System.out.println(Arrays.toString(mat[i]));
            }
            System.out.println();
            boolean rs = true;
            for (int i = 0; i < target.length; i++) {
                for (int j = 0; j < target[i].length; j++) {
                    if (mat[i][j] != target[i][j]) {
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
