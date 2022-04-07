package problems.easy;

public class E1945 {

    public static void main(String[] args) {
        System.err.println(new Solution().getLucky("dbvmfhnttvr", 5));
    }
    private static class Solution {
        public int getLucky(String s, int k) {
            int rs = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) - 96 < 10) {
                    rs = rs + (s.charAt(i) - 96);
                } else {
                    int code = s.charAt(i) - 96;
                    rs = rs + code % 10 + code / 10;
                }
            }
            while (k != 1) {
                k--;
                int tmp = 0;
                while (rs != 0) {
                    tmp += rs % 10;
                    rs = rs / 10;
                }
                rs = tmp;
            }
            return rs;
        }
    }

}
