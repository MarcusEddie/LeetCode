package contest.weekly.c294;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        int bottom = 2;
        int top = 9;
        int[] capacity = {2,3,4,5};
        int[] rocks = {1,2,4,4};
        System.out.println(solution.maximumBags(capacity, rocks, 2));
        
        int[] capacity1 = {10,2,2};
        int[] rocks1 = {2,2,0};
        System.out.println(solution.maximumBags(capacity1, rocks1, 100));
    }

    private static class Solution {
        public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            int ans = 0;
            List<Integer> slot = new ArrayList<Integer>();
            for (int i = 0; i < rocks.length; i++) {
                Integer vol = capacity[i] - rocks[i];
                if (vol == 0) {
                    ans++;
                } else {
                    slot.add(vol);
                }
            }
            Collections.sort(slot);
            for (int i = 0; i < slot.size(); i++) {
                if (slot.get(i) > additionalRocks) {
                    break;
                } else if (slot.get(i) == additionalRocks) {
                    ans++;
                    break;
                } else {
                    additionalRocks = additionalRocks - slot.get(i);
                    ans++;
                }
            }
            return ans;
        }
    }
}
