package contest.weekly.c293;

import java.util.ArrayList;
import java.util.Arrays;
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
        int[] special = { 4, 6 };
        System.out.println(solution.maxConsecutive(bottom, top, special));
        
        int bottom1 = 6;
        int top1 = 8;
        int[] special1 = { 7, 6, 8 };
        System.out.println(solution.maxConsecutive(bottom1, top1, special1));
    }

    private static class Solution {
        public int maxConsecutive(int bottom, int top, int[] special) {
            int ans = 0;
            Arrays.sort(special);
            int[] slot = new int[special.length + 2];
            if (bottom == special[0]) {
                slot[0] = bottom;
            }
            slot[0] = bottom - 1;
            for (int i = 0; i < special.length; i++) {
                slot[i + 1] = special[i];
            }
            if (top == special[special.length - 1]) {
                slot[slot.length - 1] = top;
            }
            slot[slot.length - 1] = top + 1;
            for (int i = 1; i < slot.length; i++) {
                int tmp = slot[i] - slot[i - 1];
                if (ans < tmp) {
                    ans = tmp;
                }
            }
            return ans - 1;
        }
    }
}
