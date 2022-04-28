package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class E1200 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            Map<Integer, List<List<Integer>>> map = new HashMap<Integer, List<List<Integer>>>();
            for (int i = 1; i < arr.length; i++) {
                int diff = arr[i] - arr[i - 1]; 
                if (min > diff) {
                    min = arr[i] - arr[i - 1]; 
                }
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(arr[i - 1]);
                tmp.add(arr[i]);
                if (map.containsKey(diff)) {
                    List<List<Integer>> temp = map.get(diff);
                    temp.add(tmp);
                    map.put(diff, temp);
                } else {
                    List<List<Integer>> temp = new ArrayList<List<Integer>>();
                    temp.add(tmp);
                    map.put(diff, temp);
                }
            }
            return map.get(min);
        }
        
    }

}
