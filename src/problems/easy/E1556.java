package problems.easy;

public class E1556 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public String thousandSeparator(int n) {
            StringBuilder builder = new StringBuilder();
            int cnt = 0;
            while (n != 0) {
                builder.append(n % 10);
                n = n / 10;
                cnt++;
                if (n!= 0 && cnt % 4 == 3) {
                    builder.append(".");
                    cnt = 0;
                } 
            }
            return builder.reverse().toString();
        }
    }

}
