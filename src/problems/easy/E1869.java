package problems.easy;

public class E1869 {

    public static void main(String[] args) {
        System.out.println(new Solution().checkZeroOnes("10"));
    }
    
    private static class Solution {
        public boolean checkZeroOnes(String s) {
            boolean rs = true;
            int zero=0;
            int one = 0;
            int len = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    if (s.charAt(i - 1) == '0') {
                        if (zero < len) {
                            zero = len;
                        }
                    }
                    if (s.charAt(i - 1) == '1') {
                        if (one < len) {
                            one = len;
                        }
                    }
                    len = 1;
                } else {
                    len++;
                }
                if (s.charAt(i - 1) == '0') {
                    if (zero < len) {
                        zero = len;
                    }
                }
                if (s.charAt(i - 1) == '1') {
                    if (one < len) {
                        one = len;
                    }
                }
            }
            System.out.println(one);
            System.out.println(zero);
            if (one <= zero) {
                return false;
            } else {
                return true;
            }
        }
    }

}
