package problems.easy;

public class E1332 {

    public static void main(String[] args) {
        System.out.println(new Solution().removePalindromeSub("ababa"));
        System.out.println(new Solution().removePalindromeSub("abc"));
        System.out.println(new Solution().removePalindromeSub("baabb"));
    }
    
    private static class Solution {
        public int removePalindromeSub(String s) {
            int rs = 0;
            boolean flag = true;
            StringBuilder builder = new StringBuilder(s);
            System.out.println(builder.toString());
            while (flag) {
                int lo = 0;
                int hi = builder.length() - 1;
                while (lo <= hi) {
                    if (builder.charAt(lo) == builder.charAt(hi)) {
                        builder.replace(lo, lo + 1, "=");
                        builder.replace(hi, hi + 1, "=");
                        lo++;
                        hi--;
                    } else {
                        hi--;
                    }
                }
                System.out.println(builder.toString());
                if (!builder.toString().contains("=")) {
                    flag = false;
                    break;
                }
                rs++;
                builder = new StringBuilder(builder.toString().replaceAll("=", ""));
            }
            return rs;
        }
    }

}
