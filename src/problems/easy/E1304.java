package problems.easy;

public class E1304 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int[] sumZero(int n) {
            int[] rs = new int[n];
            if (n == 1) {
                rs[0] = 0;
                return rs;
            }
            if ((n & 1) == 0) {
                n = n >> 1;
                for (int i = 0; i < rs.length; i = i + 2) {
                    rs[i] = n;
                    rs[i+1] = -n;
                    n--;
                }
            } else {
                rs[0] = 0;
                n = (n - 1) >> 1;
                for (int i = 1; i < rs.length; i = i + 2) {
                    rs[i] = n;
                    rs[i+1] = -n;
                    n--;
                }
            }
            return rs;
        }
    }

}
