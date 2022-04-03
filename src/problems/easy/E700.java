package problems.easy;

public class E700 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null || (root != null && root.left == null && root.right == null
                    && root.val != val)) {
                return null;
            }
            if (root.val == val) {
                return root;
            }
            if (root.val > val) {
                return searchBST(root.left, val);
            } else {
                return searchBST(root.right, val);
            }
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
    }
}
