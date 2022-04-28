package problems.easy;

public class E868 {

    public static void main(String[] args) {
        System.out.println(new Solution().binaryGap(15));
    }
    
    private static class Solution {
        public int binaryGap(int n) {
            int rs = 0;
            String bits = Integer.toBinaryString(n);
            int[] slot = new int[28];
            int idx = -1;
            for (int i = 0; i < bits.length(); i++) {
                if (bits.charAt(i) == '1') {
                    slot[i] = 1;
                    if (idx == -1) {
                        idx = i;
                    }
                }
            }
            System.out.println(bits);
            int sign = 1;
            for (int i = idx + 1; i < slot.length; i++) {
                if (slot[i] == 1) {
                    sign = -sign;
                    if (rs < i - idx) {
                        rs = i - idx;
                    }
                        idx = i;
                }
            }
            return rs;
        }
    }

}
