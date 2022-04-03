package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class E1436 {

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<List<String>>();
        List<String> list1 = new ArrayList<String>();
        list1.add("London");
        list1.add("New York");
        paths.add(list1);
        List<String> list2 = new ArrayList<String>();
        list2.add("New York");
        list2.add("Lima");
        paths.add(list2);
        List<String> list3 = new ArrayList<String>();
        list3.add("Lima");
        list3.add("Sao Paulo");
        paths.add(list3);
        
        System.out.println(new Solution().destCity(paths));
    }
    
    private static class Solution {
        public String destCity(List<List<String>> paths) {
            String rs = "";
            Map<String, Integer> map = new HashMap<String, Integer>();
            Map<String, Integer> ht = new HashMap<String, Integer>();
            for (int i = 0; i < paths.size(); i++) {
                List<String> path = paths.get(i);
                if (!map.containsKey(path.get(0))) {
                    map.put(path.get(0), 1);
                    ht.put(path.get(0), 0);
                } else {
                    map.remove(path.get(0));
                    ht.remove(path.get(0));
                }
                if (!map.containsKey(path.get(1))) {
                    map.put(path.get(1), 1);
                    ht.put(path.get(1), 1);
                } else {
                    map.remove(path.get(1));
                    ht.remove(path.get(1));
                }
            }
            Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.String, java.lang.Integer> entry = (Map.Entry<java.lang.String, java.lang.Integer>) it
                        .next();
                if (ht.get(entry.getKey()).equals(1)) {
                    rs = entry.getKey();
                    break;
                }
                
            }
            return rs;
        }
    }

}
