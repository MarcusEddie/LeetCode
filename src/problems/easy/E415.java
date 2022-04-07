package problems.easy;

public class E415 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public String addStrings(String num1, String num2) {
            StringBuilder builder = new StringBuilder();
            if (num1.length() >= num2.length()) {
                int len = num1.length() - num2.length();
                while (len != 0) {
                    num2 = "0" + num2;
                    len--;
                }
            } else {
                int len = num2.length() - num1.length();
                while (len != 0) {
                    num1 = "0" + num1;
                    len--;
                }
            }
            int left = 0;
            for(int i = num1.length() - 1; i >= 0; i--) {
                int a = num1.charAt(i) - 48;
                int b = num2.charAt(i) - 48;
                int sum = a + b + left;
                if (sum > 9) {
                    builder.append(sum - 10);
                    left = 1;
                } else {
                    builder.append(sum);
                    left = 0;
                }
            }
            if (left == 1) {
                builder.append(left);
            }
            return builder.reverse().toString();
        }
    }

}
