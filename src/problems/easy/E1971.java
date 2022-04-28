package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public class E1971 {

    public static void main(String[] args) {
        int n = 10;
        int[][] edges = { { 4, 3 }, { 1, 4 }, { 4, 8 }, { 1, 7 }, { 6, 4 }, { 4, 2 }, { 7, 4 },
                { 4, 0 }, { 0, 9 }, { 5, 4 } };
        int source = 5;
        int destination = 9;

        System.out.println(new Solution().validPath(n, edges, source, destination));
    }

    private static class Solution {
        public boolean validPath(int n, int[][] edges, int source, int destination) {
            boolean rs = false;
            if (edges.length == 0) {
                return true;
            }
            Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
            for (int i = 0; i < edges.length; i++) {
                int start = edges[i][0];
                int end = edges[i][1];
                if (map.containsKey(start)) {
                    List<Integer> tmp = map.get(start);
                    tmp.add(end);
                    map.put(start, tmp);
                } else {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(end);
                    map.put(start, tmp);
                }

                if (map.containsKey(end)) {
                    List<Integer> tmp = map.get(end);
                    tmp.add(start);
                    map.put(end, tmp);
                } else {
                    List<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(start);
                    map.put(end, tmp);
                }
            }

            Set<Integer> set = new HashSet<Integer>();
            Queue<Integer> queue = new LinkedBlockingQueue<Integer>();
            queue.offer(source);
            while (!queue.isEmpty()) {
                Integer node = queue.poll();
                set.add(node);
                if (map.get(node).contains(destination)) {
                    rs = true;
                    break;
                }
                List<Integer> tmp = map.get(node);
                for (int j = 0; j < tmp.size(); j++) {
                    if (!set.contains(tmp.get(j))) {
                        queue.offer(tmp.get(j));
                    }

                }
            }
            return rs;
        }
    }

}
