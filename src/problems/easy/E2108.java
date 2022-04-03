package problems.easy;

public class E2108 {

    public static void main(String[] args) {
        String[] words = {"def","ghi"};
        System.out.println(new Solution().firstPalindrome(words));
    }
    private static class Solution {
        public String firstPalindrome(String[] words) {
            String rs = "";
            for (int i = 0; i < words.length; i++) {
                if (is(words[i])) {
                    rs = words[i];
                    break;
                }
            }
            return rs;
        }
        
        private boolean is(String word) {
            boolean rs = true;
            int low = 0;
            int hi = word.length() - 1;
            while (low < hi) {
                if (word.charAt(low) != word.charAt(hi)) {
                    rs = false;
                    break;
                }
                low++;
                hi--;
            }
            return rs;
        }
    }

}
