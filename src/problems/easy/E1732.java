package problems.easy;

public class E1732 {

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(new Solution().largestAltitude(gain));
    }
    private static class Solution {
        public int largestAltitude(int[] gain) {
            int rs = 0;
            int max = 0;
            for (int i = 0; i < gain.length; i++) {
                rs = rs + gain[i];
                if (rs > max) {
                    max = rs;
                }
            }
            rs = max;
            return rs;
        }
    }

}
