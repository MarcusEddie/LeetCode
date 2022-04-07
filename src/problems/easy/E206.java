package problems.easy;

import java.util.Stack;

public class E206 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        System.out.println(new Solution().reverseList(head));
        
    }

    private static class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null) {
                return null;
            }
            Stack<ListNode> stack = new Stack<ListNode>();
            while (head != null) {
                ListNode node = new ListNode(head.val);
                stack.push(node);
                head = head.next;
            }
            ListNode rs = new ListNode();
            ListNode tailer = rs;
            while (!stack.isEmpty()) {
                ListNode node = stack.pop();
                tailer.next = node;
                tailer = tailer.next;
            }
            return rs.next;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        @Override
        public String toString() {
            return "ListNode [val=" + val + ", next=" + next + "]";
        }
        
        ListNode() {}
    }

}
