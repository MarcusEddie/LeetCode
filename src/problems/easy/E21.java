package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E21 {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(new Solution().mergeTwoLists(list1, list2).toString());
    }
    
    private static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode rs = new ListNode();
            List<ListNode> tmp = new ArrayList<ListNode>();
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    tmp.add(new ListNode(list1.val));
                    list1 = list1.next;
                } else {
                    tmp.add(new ListNode(list2.val));
                    list2 = list2.next;
                }
            }
            while (list1 != null) {
                tmp.add(new ListNode(list1.val));
                list1 = list1.next;
            }
            
            while (list2 != null) {
                tmp.add(new ListNode(list2.val));
                list2 = list2.next;
            }
//            System.err.println(tmp.toString());
            if (tmp.size() == 0) {
                return rs;
            }
            rs = gen(tmp, 0);
            return rs;
        }
        
        private ListNode gen(List<ListNode> list, int i) {
            ListNode rs = new ListNode();
            if (i == list.size() - 1) {
                rs = list.get(i);
                return rs;
            }
            rs.val = list.get(i).val;
            rs.next = gen(list, i + 1);
            return rs;
        }
    }
    private static class ListNode {
        int val;
        ListNode next;
        public ListNode() {
        }
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        @Override
        public String toString() {
            return "ListNode [val=" + val + ", next=" + next + "]";
        }
    }

}
