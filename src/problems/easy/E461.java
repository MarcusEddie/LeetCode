package problems.easy;

public class E461 {

    public static void main(String[] args) {
        System.out.println(new Solution().hammingDistance(1, 4));
    }

    private static class Solution {
        public int hammingDistance(int x, int y) {
            int rs = 0;
            String a = Integer.toBinaryString(x);
            String b = Integer.toBinaryString(y);
            int len = Math.abs(a.length() - b.length());
            if (a.length() < b.length()) {
                for (int i = 0; i < len; i++) {
                    a = "0" + a;
                }
            } else {
                for (int i = 0; i < len; i++) {
                    b = "0" + b;
                }
            }
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
