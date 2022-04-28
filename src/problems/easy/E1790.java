package problems.easy;

public class E1790 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean areAlmostEqual(String s1, String s2) {
            boolean rs = true;
            if (s1.equals(s2)) {
                return true;
            }
            int cnt = 0;
            int left = -1;
            int right = -1;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    cnt++;
                    if (left == -1) {
                        left = i;
                    } else {
                        right = i;
                    }
                    if (cnt > 2) {
                       rs = false;
                       break;
                    }
                }
            }
            if (!(s1.charAt(left) == s2.charAt(right) && s1.charAt(right) == s2.charAt(left))) {
                rs = false;
            }
            return rs;
        }
    }

}
