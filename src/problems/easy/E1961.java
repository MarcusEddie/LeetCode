package problems.easy;

public class E1961 {

    public static void main(String[] args) {
        String s = "aaaabb";
        String[] words = { "a", "a", "a", "a", "b", "b" };
        System.out.println(new Solution().isPrefixString(s, words));
    }

    private static class Solution {
        public boolean isPrefixString(String s, String[] words) {
            boolean rs = true;
            int len = 0;
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                if (len < s.length()) {
                    builder.append(words[i]);
                    if (s.indexOf(builder.toString()) == 0) {
                        len += words[i].length();
                    } else {
                        rs = false;
                        break;
                    }
                }
            }
            if (builder.length() != s.length()) {
                return false;
            }
            return rs;
        }
    }

}
