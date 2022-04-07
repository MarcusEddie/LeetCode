package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class E884 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public String[] uncommonFromSentences(String s1, String s2) {
            List<String> tmp = new ArrayList<String>();
            String[] words1 = s1.split(" ");
            String[] words2 = s2.split(" ");
            Map<String, Integer> map1 = new HashMap<String, Integer>();
            Map<String, Integer> map2 = new HashMap<String, Integer>();
            for (int i = 0; i < words1.length; i++) {
                if (map1.containsKey(words1[i])) {
                    Integer integer = map1.get(words1[i]);
                    map1.put(words1[i], integer + 1);
                } else {
                    map1.put(words1[i], 1);
                }
            }
            Iterator<Entry<String, Integer>> it = map1.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
                        .next();
                if (entry.getValue().intValue() == 1) {
                    boolean flag = true;
                    for (int j = 0; j < words2.length; j++) {
                        if (entry.getKey().equals(words2[j])) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        tmp.add(entry.getKey());
                    }
                }
            }

            for (int i = 0; i < words2.length; i++) {
                if (map2.containsKey(words2[i])) {
                    Integer integer = map2.get(words2[i]);
                    map2.put(words2[i], integer + 1);
                } else {
                    map2.put(words2[i], 1);
                }
            }

            it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
                        .next();
                if (entry.getValue().intValue() == 1) {
                    boolean flag = true;
                    for (int j = 0; j < words1.length; j++) {
                        if (entry.getKey().equals(words1[j])) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        tmp.add(entry.getKey());
                    }
                }
            }

            String[] rs = new String[tmp.size()];
            for (int i = 0; i < rs.length; i++) {
                rs[i] = tmp.get(i);
            }
            return rs;
        }
    }

}
