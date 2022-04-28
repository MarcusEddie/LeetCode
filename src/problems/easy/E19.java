package problems.easy;

public class E19 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2));
        System.out.println(new Solution().removeNthFromEnd(head, 2));
    }

    private static class Solution {
        public ListNode removeNthFromEnd1(ListNode head, int n) {
            remove(head, n);
            return head;
        }
        
        
        public ListNode removeNthFromEnd(ListNode head, int n) {
            int len = 0;
            ListNode tail = head;
            while (tail != null) {
                tail = tail.next;
                len++;
            }
            len = len - n;
            ListNode first = head;
            if (len == 0) {
                first = first.next;
                return first;
            }
            len--;
            while (len != 0) {
                len--;
                first = first.next;
            }
            first.next = first.next.next;
            System.out.println("== "+first.toString());
            return head;
        }

        private Integer remove(ListNode head, int n) {
            if (head.next == null) {
                if (n == 1) {
                    head = null;
                }
                return 1;
            }
            int level = 1;
            level += remove(head.next, n);
            if (level == n) {
                head = head.next;
            }
            return level;
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
