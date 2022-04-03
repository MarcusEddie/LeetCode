package contest.biweekly.c75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class C {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOfWays("001110100"));
//        System.out.println(solution.numberOfWays("111100101010110"));
    }
    
    private static class Solution{
        public long numberOfWays(String s) {
            long rs = 0;
            int[] slot = new int[100001];
            for (int i = 0; i < slot.length; i++) {
                slot[i] = -1;
            }
            int idx = 0;
            int cnt = 1;
            for(int i = 1; i<s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    cnt++;
                } else {
                    slot[idx++] = cnt;
                    cnt = 1;
                }
                if (i == s.length() - 1) {
                    slot[idx++] = cnt;
                }
            }
            
//            for (int i : slot) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//            System.out.println(idx);
            if (idx <= 2) {
                return 0;
            }
            for(int i = 0; i < idx; i++) {
                for (int j = i + 1; j < idx; j =j+2) {
                    for (int j2 = j + 1; j2 < idx; j2 = j2+2) {
//                        System.out.println(i + " " + j + " " + j2);
                        rs = rs + slot[i] * slot[j] * slot[j2];
                    }
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
