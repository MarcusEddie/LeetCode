package problems.easy;


public class E14 {
    public static void main(String[] args) {
        String[] strs = {"ab","ac","ab"};
        System.out.println(new Solution().longestCommonPrefix(strs));
    }
    
    private static class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder rs = new StringBuilder();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < strs.length; i++) {
                if (min > strs[i].length()) {
                    min = strs[i].length();
                }
            }
            for (int i = 0; i < min; i++) {
                int code = strs[0].charAt(i);
                boolean flag = true;
                for (int j = 1; j < strs.length; j++) {
                    int tmp = strs[j].charAt(i);
                    if (code != tmp) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                } else {
                    rs.append((char)code);
                }
            }
            return rs.toString();
        }
    }

}
