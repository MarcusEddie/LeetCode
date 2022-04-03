package problems.easy;

public class E2185 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int prefixCount(String[] words, String pref) {
            int rs = 0;
            for (int i = 0; i < words.length; i++) {
                if (words[i].indexOf(pref) == 0) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
