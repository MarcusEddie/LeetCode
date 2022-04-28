package contest.weekly.c289;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class B {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] tasks = { 69, 65, 62, 64, 70, 68, 69, 67, 60, 65, 69, 62, 65, 65, 61, 66, 68, 61, 65,
                63, 60, 66, 68, 66, 67, 65, 63, 65, 70, 69, 70, 62, 68, 70, 60, 68, 65, 61, 64, 65,
                63, 62, 62, 62, 67, 62, 62, 61, 66, 69 };
        System.out.println(solution.minimumRounds(tasks));
    }

    private static class Solution {
        public int minimumRounds(int[] tasks) {
            int result = 0;
            Map<Integer, Integer> slot = new HashMap<Integer, Integer>();
            for (int i = 0; i < tasks.length; i++) {
                if (slot.containsKey(Integer.valueOf(tasks[i]))) {
                    slot.put(Integer.valueOf(tasks[i]), slot.get(Integer.valueOf(tasks[i])) + 1);
                } else {
                    slot.put(Integer.valueOf(tasks[i]), 1);
                }
            }
            Iterator<Entry<Integer, Integer>> it = slot.entrySet().iterator();
            while (it.hasNext() && result != -1) {
                Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) it.next();
                int times = entry.getValue();
                if (times < 2) {
                    result = -1;
                }
                if (times % 3 == 0) {
                    result += times / 3;
                } else {
                    result += times / 3;
                    result++;
                }
            }
            return result;
        }
    }

}
