package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class E1356 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public int[] sortByBits(int[] arr) {
            Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
            int[] rs = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                String bitStr = Integer.toBinaryString(arr[i]);
                Integer cnt = 0 ;
                for(int j = 0; j < bitStr.length(); j++) {
                    if (bitStr.charAt(j) == '1') {
                        cnt++;
                    }
                }
                
                if (map.containsKey(cnt)) {
                    List<Integer> tmp = map.get(cnt);
                    tmp.add(arr[i]);
                    map.put(cnt, tmp);
                } else {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(arr[i]);
                    map.put(cnt, tmp);
                }
            }
            int  idx = 0;
            Iterator<Entry<Integer, List<Integer>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.Integer,java.util.List<java.lang.Integer>> entry = (Map.Entry<java.lang.Integer,java.util.List<java.lang.Integer>>) it
                        .next();
                List<Integer> list = entry.getValue();
                Collections.sort(list);
                for (Integer integer : list) {
                    rs[idx++] = integer;
                }
            }
            return rs;
        }
    }
}
