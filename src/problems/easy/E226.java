package problems.easy;

public class E226 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();

        System.err.println(new Solution().invertTree(root).toString());
    }

    private static class Solution {
        public TreeNode invertTree(TreeNode root) {
            TreeNode rs = new TreeNode();
            if (root.left == null && root.right == null) {
                return root;
            }
            if (root.left != null && root.right == null) {
                root.right = root.left;
                root.left = null;
                root.right = invertTree(root.right);
            } else if (root.left == null && root.right != null) {
                root.left = root.right;
                root.right = null;
                root.left = invertTree(root.left);
            } else {
                TreeNode tmp = root.right;
                root.right = root.left;
                root.left = tmp;
                root.right = invertTree(root.right);
                root.left = invertTree(root.left);
            }
            return rs;
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            super();
            this.val = val;
        }

        @Override
        public String toString() {
            return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
        }

    }

}
