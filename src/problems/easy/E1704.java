package problems.easy;

public class E1704 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean halvesAreAlike(String s) {
            int left = 0;
            int right = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() / 2) {
                    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                            || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                            || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'E'
                            || s.charAt(i) == 'U') {
                        left++;
                    }
                } else {
                    if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                            || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A'
                            || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'E'
                            || s.charAt(i) == 'U') {
                        right++;
                    }
                }
            }
            return left == right;
        }
    }

}
