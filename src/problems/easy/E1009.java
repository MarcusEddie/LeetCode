package problems.easy;

public class E1009 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int bitwiseComplement(int n) {
            int rs = 0;
            String bits = Integer.toBinaryString(n);
            for (int i = bits.length() - 1; i >= 0; i--) {
                int tmp = 1;
                if (bits.charAt(i) == '1') {
                    tmp = 0;
                }
                rs += tmp * Math.pow(2, bits.length() - 1 - i);
            }
            return rs;
        }
    }

}
