package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E599 {

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] rs = new Solution().findRestaurant(list1, list2);
        for (String string : rs) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            Map<String, Integer> map1 = new HashMap<String, Integer>();
            for (int i = 0; i < list1.length; i++) {
                map1.put(list1[i], i);
            }
            List<String> list = new ArrayList<String>();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < list2.length; i++) {
                if (map1.containsKey(list2[i])) {
                    if (min > (i + map1.get(list2[i]))) {
                        min = i + map1.get(list2[i]);
                        list = new ArrayList<String>();
                        list.add(list2[i]);
                    } else if (min == (i + map1.get(list2[i]))) {
                        list.add(list2[i]);
                    }
                }
            }

            String[] rs = new String[list.size()];
            for (int i = 0; i < rs.length; i++) {
                rs[i] = list.get(i);
            }
            return rs;
        }
    }

}
