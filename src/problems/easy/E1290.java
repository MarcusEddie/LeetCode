package problems.easy;

public class E1290 {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        System.out.println(new Solution().getDecimalValue(head));
        head = new ListNode(1, new ListNode(0, new ListNode(1)));
        System.out.println(new Solution().getDecimalValue(head));
    }
    private static class Solution {
        public int getDecimalValue(ListNode head) {
            int rs = 0;
            ListNode node = head;
            while (null != node) {
                System.out.println(node.val);
                rs = rs << 1;
                rs = rs + node.val;
                node = node.next;
            }
            return rs;
        }
    }
    
    private static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
