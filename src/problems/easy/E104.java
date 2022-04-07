package problems.easy;

public class E104 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            int left = 0;
            int right = 0;
            if (root.left != null) {
                left = maxDepth(root.left);
            }
            if (root.right != null) {
                right = maxDepth(root.right);
            }
            if (left < right) {
                return right + 1;
            } else {
                return left + 1;
            }
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
    }
}
