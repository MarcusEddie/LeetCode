package problems.easy;

public class E83 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        System.out.println(new Solution().deleteDuplicates(head).toString());
    }

    private static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while (fast != null) {
                if (slow.val != fast.val) {
                    slow = fast;
                    fast = fast.next;
                } else {
                    slow.next = fast.next;
                    fast = fast.next;
                }
            }
            return head;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode [val=" + val + ", next=" + next + "]";
        }
    }

}
