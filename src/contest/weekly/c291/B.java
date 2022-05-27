package contest.weekly.c291;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;

public class B {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] cards = {3,4,2,3,4,3,1,2,5,6,3};
        System.out.println(solution.minimumCardPickup(cards));
        int[] cards1 = {1,0,5,3};
        System.out.println(solution.minimumCardPickup(cards1));
    }

    private static class Solution {
        public int minimumCardPickup(int[] cards) {
            int ans = 1000000;
            Map<Integer, int[]> map = new HashMap<Integer, int[]>();
            for (int i = 0; i < cards.length; i++) {
                int cur = cards[i];
                if (map.containsKey(cur)) {
                    if (map.get(cur)[0] == 0) {
                        map.get(cur)[0] = i + 1;
                    } else {
                        if (map.get(cur)[1] == 0) {
                            map.get(cur)[1] = i + 1;
                            if (map.get(cur)[1] - map.get(cur)[0] < ans) {
                                ans = map.get(cur)[1] - map.get(cur)[0];
                            }
                        } else {
                            map.get(cur)[0] = map.get(cur)[1];
                            map.get(cur)[1] = i + 1;
                            if (map.get(cur)[1] - map.get(cur)[0] < ans) {
                                ans = map.get(cur)[1] - map.get(cur)[0];
                            }
                        }
                    }
                } else {
                    int[] tmp = new int[2];
                    tmp[0] = i + 1;
                    map.put(cur, tmp);
                }
            }
            if (ans == 1000000) {
                ans = -1;
                return ans;
            }
            return ans + 1;
        }
    }

}
