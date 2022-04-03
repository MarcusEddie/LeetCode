package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

import javax.swing.table.TableModel;

public class E1534 {

    public static void main(String[] args) {
        int[] arr = {1,18,19,2,19,10,2,5,15,18};
        int a = 4;
        int b = 9;
        int c = 2;
        System.out.println(new Solution().countGoodTriplets(arr, a, b, c));
    }
    
    private static class Solution {
        public int countGoodTriplets(int[] arr, int a, int b, int c) {
            int rs = 0;
            List<String> list = gen(arr.length, 3);
            for (String string : list) {
                String[] idxs = string.split(" ");
                int i = Integer.valueOf(idxs[0]) - 1;
                int j = Integer.valueOf(idxs[1]) - 1;
                int k = Integer.valueOf(idxs[2]) - 1;
                if (Math.abs(arr[i] - arr[j]) <=a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                    rs++;
                }
            }
            return rs;
        }
        
        private List<String> gen(int n, int len) {
            List<String> rs = new ArrayList<String>();
            Queue<String> queue = new LinkedBlockingDeque<String>();
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (int i = 1; i <= n; i++) {
                queue.offer(String.valueOf(i));
                map.put(String.valueOf(i), 1);
            }
            while (!queue.isEmpty()) {
                String tmp = queue.poll();
                Integer cursor = Integer.valueOf(tmp.substring(tmp.lastIndexOf(" ") + 1));
                Integer tmpSet = map.get(String.valueOf(tmp));
                for (int i = cursor + 1; i <= n; i++) {
                    String newItem = new StringBuilder(tmp).append(" ").append(i).toString();
                    if (tmpSet + 1 == len) {
                        rs.add(newItem);
                    } else {
                        queue.offer(newItem);
                        map.put(newItem, tmpSet + 1);
                    }
                }
            }
            return rs;
        }
    }

}
