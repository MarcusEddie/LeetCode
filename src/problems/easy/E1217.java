package problems.easy;

public class E1217 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public int minCostToMoveChips(int[] position) {
            int zero = 0;
            int one = 0;
            for (int i = 0; i < position.length; i++) {
                if ((position[i] & 1) == 1) {
                    one++;
                } else {
                    zero++;
                }
            }
            if (zero < one) {
                return zero;
            } else {
                return one;
            }
        }
    }

}
