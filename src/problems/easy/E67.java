package problems.easy;

public class E67 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


    }

    private static class Solution {
        public String addBinary(String a, String b) {
            StringBuilder builder = new StringBuilder();
            if (a.length() < b.length()) {
                int len = b.length() - a.length();
                while (len > 0) {
                    len--;
                    a = "0"+a;
                }
            } else {
                int len = a.length() - b.length();
                while (len > 0) {
                    len--;
                    b = "0" + b;
                }
            }
            int left = 0;
            for(int i = a.length() - 1; i >= 0; i--) {
                int a1 = a.charAt(i) - 48;
                int b1 = b.charAt(i) - 48;
                if (a1 + b1 == 2) {
                    left = 1;
                    builder.append(0);
                } else {
                    left = 0;
                    builder.append(1);
                }
            }
            if (left == 1) {
                builder.append(1);
            }
            return builder.reverse().toString();
        }
    }
}
