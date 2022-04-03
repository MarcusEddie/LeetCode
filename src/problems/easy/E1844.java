package problems.easy;

public class E1844 {

    public static void main(String[] args) {
        System.out.println(new Solution().replaceDigits("a1b2c3d4e"));
    }
    
    private static class Solution {
        public String replaceDigits(String s) {
            StringBuilder builder = new StringBuilder();
            int code = s.charAt(0);
            for(int i = 0; i< s.length(); i++) {
                if (97 <= s.charAt(i) && s.charAt(i) <= 122) {
                    builder.append(String.valueOf(s.charAt(i)));
                    code = s.charAt(i);
                } else {
                    builder.append(String.valueOf((char)(code + (s.charAt(i) - 48))));
                }
            }
            return builder.toString();
        }
    }

}
