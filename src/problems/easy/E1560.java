package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1560 {

    public static void main(String[] args) {
        int[] rounds = {1,3,5,7};
        int n = 7;
        for (int i : rounds) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(new Solution().mostVisited(n, rounds).toString());
    }
    
    private static class Solution {
        public List<Integer> mostVisited(int n, int[] rounds) {
            List<Integer> rs = new ArrayList<Integer>();
            int[] slot = new int[n + 1];
            slot[rounds[0]] = 1;
            int max = 0;
            for (int i = 1; i < rounds.length; i++) {
                int end = rounds[i];
                int start = rounds[i - 1];
                if(start <= end) {
                    for (int j = start + 1; j <= end; j++) {
                        slot[j]++;
                        if(max < slot[j]) {
                            max = slot[j];
                        }
                    }
                } else {
                    for (int j = start + 1; j <= end + n; j++) {
                        int idx = j % n != 0 ? j % n : n;
                        slot[idx]++;
                        if(max < slot[idx]) {
                            max = slot[idx];
                        }
                    }
                }
            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] == max) {
                    rs.add(i);
                }
            }
            return rs;
        }
    }

}
