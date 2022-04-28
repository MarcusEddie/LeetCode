package problems.easy;

public class E1422 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int maxScore(String s) {
            int rs = 0;
            for (int i = 1; i < s.length(); i++) {
                String str1 = s.substring(0, i);
                String str2 = s.substring(i);
                int zero = cnt(str1, '0');
                int one = cnt(str2, '1');
                if (rs < zero + one) {
                    rs = zero + one;
                }
            }
            return rs;
        }
        
        private int cnt(String str, char tar) {
            int rs = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == tar) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
