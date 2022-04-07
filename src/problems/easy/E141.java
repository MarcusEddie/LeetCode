package problems.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E141 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean hasCycle(ListNode head) {
            Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
            while (head != null) {
                if (map.containsKey(head.val)) {

                }
            }
            return false;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;
    }

}
