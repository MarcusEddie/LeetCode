package problems.easy;

public class E1323 {

    public static void main(String[] args) {
        System.out.println(new Solution().maximum69Number(9669));
    }
    
    private static class Solution {
        public int maximum69Number (int num) {
            int rs = 0;
            StringBuilder builder = new StringBuilder(String.valueOf(num));
            int idx = builder.indexOf("6");
            if (idx >= 0) {
                rs = Integer.valueOf(builder.replace(idx, idx+1, "9").toString());
            } else {
                rs = num;
            }
            return rs;
        }
    }

}
