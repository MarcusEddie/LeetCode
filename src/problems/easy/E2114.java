package problems.easy;

public class E2114 {

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(new Solution().mostWordsFound(sentences));
    }
    
    private static class Solution {
        public int mostWordsFound(String[] sentences) {
            int rs = 0;
            for (int i = 0; i < sentences.length; i++) {
                String[] words = sentences[i].split(" ");
                if (rs < words.length) {
                    rs = words.length;
                }
            }
            return rs;
        }
    }

}
