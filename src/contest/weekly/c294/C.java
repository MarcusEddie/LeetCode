package contest.weekly.c294;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] stockPrices = {{1,7},{2,6},{3,5},{4,4},{5,4},{6,3},{7,2},{8,1}};
//        System.out.println(solution.minimumLines(stockPrices));
//        int[][] stockPrices1 = {{3,4},{1,2},{7,8},{2,3}};
//        System.out.println(solution.minimumLines(stockPrices1));
        int[][] stockPrices2 = {{3,4},{3,2},{7,8},{2,3}};
        System.out.println(solution.minimumLines(stockPrices2));
    }

    private static class Solution {
        public int minimumLines(int[][] stockPrices) {
            if (stockPrices.length < 2) {
                return 0;
            }
            List<Integer> days = new ArrayList<Integer>();
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (int i = 0; i < stockPrices.length; i++) {
                days.add(stockPrices[i][0]);
                map.put(String.valueOf(stockPrices[i][0]), stockPrices[i][1]);
            }
            Collections.sort(days);
            Integer startX = days.get(0);
            Integer startY = map.get(startX.toString());
            Integer endX = days.get(1);
            Integer endY = map.get(endX.toString());
            int ans = 1;
            for (int i = 2; i < days.size(); i++) {
                Integer curX = days.get(i);
                Integer curY = map.get(curX.toString());
                BigDecimal numerator1 = new BigDecimal(endY - startY);
                BigDecimal denominator1 = new BigDecimal(endX - startX);
                BigDecimal numerator2 = new BigDecimal(curY - endY);
                BigDecimal denominator2 = new BigDecimal(curX - endX);
                if ((!denominator1.equals(0)) && (!denominator2.equals(0))) {
                    numerator1 = numerator1.multiply(denominator2);
                    numerator2 = numerator2.multiply(denominator1);
                    if (!numerator1.equals(numerator2)) {
                        ans++;
                    }
                }
                startX = endX;
                startY = endY;
                endX = curX;
                endY = curY;
            }
            return ans;
        }
    }

}
