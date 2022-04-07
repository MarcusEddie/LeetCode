package problems.easy;

public class E1957 {

    public static void main(String[] args) {
        System.out.println(new Solution().makeFancyString("aaa"));
    }

    private static class Solution {
        public String makeFancyString(String s) {
            StringBuilder builder = new StringBuilder();
            int idx = 1;
            int cur = 0;

            while (idx < s.length()) {
                if (s.charAt(idx) != s.charAt(idx - 1)) {
//                    System.out.println(s.substring(cur, idx) + " " + (idx - cur));
                    if (idx - cur > 2) {
                        builder.append(s.substring(idx - 2, idx));
                    } else {
                        builder.append(s.substring(cur, idx));
                    }
                    cur = idx;
                }
                idx++;
            }
//            System.out.println(s.substring(cur) + " " + (s.length() - cur));
            if (s.length() - cur > 2) {
                builder.append(s.substring(s.length() - 2));
            } else {
                builder.append(s.substring(cur));
            }

            return builder.toString();
        }
    }

}
