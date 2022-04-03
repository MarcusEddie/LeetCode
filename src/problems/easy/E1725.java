package problems.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class E1725 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int countGoodRectangles(int[][] rectangles) {
            int rs = 0;
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int maxLen = 0;
            for (int i = 0; i < rectangles.length; i++) {
                Integer len = rectangles[i][0] > rectangles[i][1] ? rectangles[i][1] : rectangles[i][0];
                if (maxLen < len) {
                    maxLen = len;
                    rs = 1;
                } else if (maxLen == len) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
