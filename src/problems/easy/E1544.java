package problems.easy;

public class E1544 {

    public static void main(String[] args) {
        System.out.println(new Solution().makeGood("abc"));
    }

    private static class Solution {
        public String makeGood(String s) {
            StringBuilder builder = new StringBuilder(s);
            int idx = 0;
            while (idx < builder.length() - 1) {
                int code = Math.abs(builder.charAt(idx) - builder.charAt(idx + 1));
                if (code == 32) {
                    builder = builder.replace(idx, idx + 2, "");
                    if (idx != 0) {
                        idx--;
                    }
                } else {
                    idx++;
                }
            }
            return builder.toString();
        }
    }

}
