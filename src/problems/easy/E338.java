package problems.easy;

public class E338 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public int[] countBits(int n) {
            int[] rs = new int[n + 1];
            for (int i = 0; i <=n; i++) {
                int cnt = 0;
                int tmp = i;
                while (tmp != 0) {
                    if ((tmp & 1) == 1) {
                        cnt++;
                    }
                    tmp = tmp >> 1;
                }
                rs[i] = cnt;
            }
            return rs;
        }
    }

}
