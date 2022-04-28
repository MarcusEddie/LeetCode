package problems.easy;

public class E459 {

    public static void main(String[] args) {
        System.out.println(new Solution().repeatedSubstringPattern("aabaaba"));
    }

    private static class Solution {
        public boolean repeatedSubstringPattern(String s) {
            boolean rs = false;
            for (int i = 1; i <= s.length() / 2; i++) {
                boolean flag = true;
                if (s.length() % i != 0) {
                    continue;
                }
                for (int j = 0 + i; j < s.length(); j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    rs = true;
                    break;
                }
            }
            return rs;
        }
    }

}
