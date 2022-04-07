package problems.easy;

public class E111 {

    public static void main(String[] args) {
        TreeNode node11 = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        TreeNode node4 = new TreeNode(4, node11, null);
        TreeNode node8 = new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)));
        TreeNode root = new TreeNode(5, node4, node8);
        System.out.println(new Solution().minDepth(root));
    }

    private static class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int leftDepth = minDepth(root.left);
            int rightDepth = minDepth(root.right);

            if (leftDepth == 0 || rightDepth == 0) {
                return Math.max(leftDepth, rightDepth) + 1;
            }

            return Math.min(leftDepth, rightDepth) + 1;
        }

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
        }

    }
}
