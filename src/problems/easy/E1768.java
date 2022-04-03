package problems.easy;

public class E1768 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public String mergeAlternately(String word1, String word2) {
            StringBuilder rs = new StringBuilder();
            int len = word1.length() > word2.length() ? word2.length() : word1.length();
            for(int i = 0; i <len; i++) {
                rs.append(String.valueOf(word1.charAt(i))).append(String.valueOf(word2.charAt(i)));
            }
            if (len == word1.length()) {
                rs.append(word2.substring(len));
            }
            if (len == word2.length()) {
                rs.append(word1.substring(len));
            }
            return rs.toString();
        }
    }

}
