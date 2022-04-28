package problems.easy;

public class E1446 {

    public static void main(String[] args) {
        System.out.println(new Solution().maxPower("aabbbbbccccdddddddeffffffggghhhhhiiiiijjjkkkkkllllmmmmmnnnnnoopppqrrrrsssttttuuuuvvvvwwwwwwwxxxxxyyyzzzzzzzz"));
    }
    
    private static class Solution {
        public int maxPower(String s) {
            int rs = 0;
            int pre = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    System.out.println(s.substring(pre,i) + " " + (i - pre));
                    if (rs < i - pre) {
                        rs = i - pre;
                    }
                    pre = i;
                }
                if (i == s.length() - 1) {
                    System.out.println(s.substring(pre));
                    if (rs < i - pre) {
                        rs = i - pre + 1;
                    }
                }
            }
            return rs;
        }
    }

}
