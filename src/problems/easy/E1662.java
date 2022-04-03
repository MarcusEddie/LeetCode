package problems.easy;

public class E1662 {

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(new Solution().arrayStringsAreEqual(word1, word2));
    }
    
    
    private static class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            Boolean rs = true;
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < word1.length; i++) {
                tmp.append(word1[i]);
            }
            StringBuilder tmp1 = new StringBuilder();
            for (int i = 0; i < word2.length; i++) {
                tmp1.append(word2[i]);
            }
            if (tmp.length() != tmp1.length()) {
                rs = false;
                return rs;
            }
            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i) != tmp1.charAt(i)) {
                    rs = false;
                    break;
                }
            }
            return rs;
        }
    }

}
