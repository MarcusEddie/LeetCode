package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class E13 {

    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("III"));
        System.out.println(new Solution().romanToInt("LVIII"));
        System.out.println(new Solution().romanToInt("MCMXCIV"));
        System.out.println(new Solution().romanToInt("MCMXCIVI"));
    }
    
    private static class Solution {
        public int romanToInt(String s) {
            int rs = 0;
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);
            int idx = 0;
            while (idx < s.length()) {
                if ((idx + 1 < s.length()) && s.charAt(idx) == 'I' && (s.charAt(idx + 1) == 'V' || s.charAt(idx + 1) == 'X')) {
                    rs = rs + map.get(String.valueOf(s.charAt(idx + 1))) - map.get(String.valueOf(s.charAt(idx)));
                    idx = idx + 2;
                } else if ((idx + 1 < s.length()) && s.charAt(idx) == 'X' && (s.charAt(idx + 1) == 'L' || s.charAt(idx + 1) == 'C')) {
                    rs = rs + map.get(String.valueOf(s.charAt(idx + 1))) - map.get(String.valueOf(s.charAt(idx)));
                    idx = idx + 2;
                } else if ((idx + 1 < s.length()) && s.charAt(idx) == 'C' && (s.charAt(idx + 1) == 'D' || s.charAt(idx + 1) == 'M')) {
                    rs = rs + map.get(String.valueOf(s.charAt(idx + 1))) - map.get(String.valueOf(s.charAt(idx)));
                    idx = idx + 2;
                } else {
                    rs = rs + map.get(String.valueOf(s.charAt(idx)));
                    idx++;
                }
            }
            return rs;
        }
    }

}
