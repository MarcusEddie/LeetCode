package problems.easy;

public class E2000 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public String reversePrefix(String word, char ch) {
            StringBuilder rs = new StringBuilder();
            int idx = word.indexOf(ch);
            if (idx > 0) {
                StringBuilder tmp = new StringBuilder(word.substring(0, idx + 1));
                rs.append(tmp.reverse()).append(word.substring(idx + 1));
            } else {
                return word;
            }
            return rs.toString();
        }
    }

}
