package problems.easy;

public class E58 {

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("   fly me   to   the moon  "));
    }
    
    private static class Solution {
        public int lengthOfLastWord(String s) {
            int rs = 0;
            String[] words = s.split(" ");
            for(int i = words.length - 1; i >= 0; i--) {
                if (words[i].trim().length() != 0) {
                    rs = words[i].trim().length();
                    break;
                }
            }
            return rs;
        }
    }

}
