package problems.easy;

public class E1646 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int getMaximumGenerated(int n) {
            int rs = 0;
            int[] slot = new int[n + 1];
            slot[0] = 0;
            slot[1] = 1;
            for (int i = 2; i < slot.length; i++) {
                if ((i & 1) == 0) {
                    slot[i] = slot[i >> 1];
                } else {
                    int idx = (i - 1) >> 1;
                    slot[i] = slot[idx] + slot[idx + 1];
                }
                if (rs < slot[i]) {
                    rs = slot[i];
                }
            }
            return rs;
        }
    }

}
