package problems.easy;

public class E2160 {

    public static void main(String[] args) {
        int num = 4009;
        System.out.println(new Solution().minimumSum(num));
    }
    
    private static class Solution {
        public int minimumSum(int num) {
            int rs = 0;
            int[] digits = new int[10];
            while (num != 0) {
                int remainder = num % 10;
                digits[remainder] = digits[remainder] + 1;
                num = num / 10;
            }
            StringBuilder op1 = new StringBuilder();
            StringBuilder op2 = new StringBuilder();
            int sign = 1;
            for (int i = 0; i < digits.length; i++) {
                while (digits[i] != 0) {
                    if (sign == 1) {
                        op1.append(i);
                        digits[i] = digits[i] - 1;
                        sign = -sign;
                    }
                    if (digits[i] != 0) {
                        if (sign == -1) {
                            op2.append(i);
                            digits[i] = digits[i] - 1;
                            sign = -sign;
                        }
                    }
                }
            }
            
            rs = Integer.valueOf(op1.toString()) + Integer.valueOf(op2.toString());
            return rs;
        }
    }

}
