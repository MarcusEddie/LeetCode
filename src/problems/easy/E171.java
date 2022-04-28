package problems.easy;

public class E171 {

    public static void main(String[] args) {
        System.out.println(new Solution().titleToNumber("AB"));
    }
    
    private static class Solution {
        public int titleToNumber(String columnTitle) {
            int rs = 0;
            int[] slot = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
            int len = columnTitle.length();
            if (len == 1) {
                int code = columnTitle.charAt(0) - 65;
                rs = slot[code];
            } else {
                for (int i = 0; i < len; i++) {
                    int code = columnTitle.charAt(i) - 65;
                    rs += slot[code] * (int)Math.pow(26, len - 1 - i);
                }
            }
            return rs;
        }
    }

}
