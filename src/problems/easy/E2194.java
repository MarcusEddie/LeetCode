package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E2194 {

    public static void main(String[] args) {
        String s = "A1:F1";
        System.out.println(new Solution().cellsInRange(s).toString());
    }
    
    private static class Solution {
        public List<String> cellsInRange(String s) {
            List<String> rs = new ArrayList<String>();
            String[] cells = s.split(":");
            Integer c1 = (int) cells[0].charAt(0);
            Integer c2 = (int) cells[1].charAt(0);
            Integer r1 = (int) cells[0].charAt(1);
            Integer r2 = (int) cells[1].charAt(1);
            for(int i = c1; i <= c2; i++) {
                for (int j = r1; j <= r2; j++) {
                    rs.add(String.valueOf((char)i) + String.valueOf((char)j));
                }
            }
            return rs;
        }
    }

}
