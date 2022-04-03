package problems.easy;

public class E1221 {

    public static void main(String[] args) {
        String s = "LLLLRRRR";
        System.out.println(new Solution().balancedStringSplit(s));
    }
    
    private static class Solution {
        public int balancedStringSplit(String s) {
            int rs = 0;
            int l = 0;
            int r = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                    l++;
                }
                if (s.charAt(i) == 'R') {
                    r++;
                }
                if (l == r) {
                    rs++;
                    l = 0;
                    r = 0;
                }
            }
            return rs;
        }
    }

}
