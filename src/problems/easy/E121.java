package problems.easy;

import java.util.Map;

public class E121 {

    public static void main(String[] args) {

    }
    private static class Solution {
        public int maxProfit(int[] prices) {
            int rs = 0;
            String[] slot = new String[10001];
            int min = 10002;
            int max = 0;
            for (int i = 0; i < prices.length; i++) {
                if (slot[prices[i]] != null && slot[prices[i]].length() > 0) {
                    String tmp = slot[prices[i]];
                    slot[prices[i]] = tmp + " " + i;
                }
                if (min > prices[i]) {
                    min = prices[i];
                }
                if (max < prices[i]) {
                    max = prices[i];
                }
            }
            while (min <= max) {
                String[] minIdx = slot[min].split(" ");
                String[] maxIdx = slot[max].split(" ");
                

            }
            return rs;
        }
    }

}
