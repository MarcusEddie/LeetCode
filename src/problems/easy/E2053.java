package problems.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class E2053 {

    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        System.out.println(new Solution().kthDistinct(arr, 2));
    }
    
    private static class Solution {
        public String kthDistinct(String[] arr, int k) {
            String rs = "";
            Map<String, Integer> map = new LinkedHashMap<String, Integer>();
            
            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i])) {
                    Integer tmp = map.get(arr[i]);
                    map.put(arr[i], tmp + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
            Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
            while (it.hasNext() && k >0) {
                Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
                        .next();
                if (entry.getValue() == 1) {
                    k--;
                    rs = entry.getKey();
                }
            }
            if (k != 0) {
                rs = "";
            }
            return rs;
        }
    }

}
