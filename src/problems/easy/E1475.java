package problems.easy;

public class E1475 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int[] finalPrices(int[] prices) {
            int[] rs = new int[prices.length];
            for (int i = 0; i < prices.length; i++) {
                int idx = 0;
                for (int j = i+1; j < prices.length; j++) {
                    if (prices[i] >= prices[j]) {
                        idx = j;
                        break;
                    }
                }
                if (idx != 0) {
                    rs[i] = prices[i] - prices[idx];
                } else {
                    rs[i] = prices[i];
                }
            }
            return rs;
        }
    }

}
