package problems.easy;

public class E1716 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int totalMoney(int n) {
            int rs = 0;
            int monday = 1;
            while (n > 0) {
                if (n > 7) {
                    rs += (((monday + monday + 6) * 7) / 2);
                    n = n - 7;
                } else {
                    rs += (((monday + monday + n - 1) * n) / 2);
                    n = 0;        
                }
                monday++;
            }
            return rs;
        }
    }

}
