package problems.easy;

public class E203 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2));
        System.out.println(new Solution().removeElements(head, 1).toString());
    }

    private static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if(null == head){
                return null;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            
            while (slow != null && null != fast) {
                while (null != fast && fast.val != val) {
                    fast = fast.next;
                }
                if (null == fast) {
                    break;
                }
                while (slow.next != fast) {
                    slow = slow.next;
                }
                slow.next = fast.next;
                fast = fast.next;
            }
            if (head.val == val) {
                head = head.next;
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
