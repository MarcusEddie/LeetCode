package problems.easy;

public class E1967 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int rs = 0;
            for (int i = 0; i < patterns.length; i++) {
                if (word.indexOf(patterns[i]) >= 0) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
