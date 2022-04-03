package problems.easy;

public class E693 {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(new Solution().hasAlternatingBits(n));
    }
    
    private static class Solution {
        public boolean hasAlternatingBits(int n) {
            boolean rs = false;
//            String bit = Integer.toBinaryString(n);
//            for(int i = 0; i < bit.length() - 1; i++) {
//                if (!(bit.charAt(i) == '1' && bit.charAt(i + 1) == '0') && !(bit.charAt(i) == '0' && bit.charAt(i + 1) == '1')) {
//                    rs = false;
//                    break;
//                }
//            }
            if ((n & (n >> 1)) == 0) {
                if ((n | (n >> 2)) == n) {
                    rs = true;
                }
            }
            return rs;
        }
        
    }

}
