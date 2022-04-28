package problems.easy;

public class E235 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if ((null != p.left && p.left == q) || (null != p.right && p.right == q)) {
                return p;
            }
            if ((null != q.left && q.left == p) || (null != q.right && q.right == p)) {
                return q;
            }
            return lca(root, p, q);
        }
        
        private TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
            if (root.val < p.val && root.val < q.val) {
                return lca(root.right, p, q);
            } else if (root.val > p.val && root.val > q.val) {
                return lca(root.left, p, q);
            } else {
                return root;
            }
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
