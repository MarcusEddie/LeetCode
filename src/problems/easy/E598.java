package problems.easy;

public class E598 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public int maxCount(int m, int n, int[][] ops) {
            int rs = 0;
            int minM = Integer.MAX_VALUE;
            int minN = Integer.MAX_VALUE;
            for (int i = 0; i < ops.length; i++) {
                if (minM > ops[i][0]) {
                    minM = ops[i][0];
                }
                if (minN > ops[i][1]) {
                    minN = ops[i][1];
                }
            }
            return minM * minN;
        }
    }

}
