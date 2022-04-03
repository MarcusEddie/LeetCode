package problems.easy;

public class E1688 {

    public static void main(String[] args) {
        System.out.println(new Solution().numberOfMatches(3));
    }
    
    private static class Solution {
        public int numberOfMatches(int n) {
            int rs = 0;
            while (n > 1) {
                if ((n & 1) == 0) {
                    n = n >> 1;
                    rs = rs + n;
                } else {
                    n = (n - 1) >> 1;
                    rs = rs + n;
                    n++;
                }
            }
            return rs;
        }
    }

}
