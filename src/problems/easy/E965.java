package problems.easy;

public class E965 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean isUnivalTree(TreeNode root) {
            return pre(root, root.val);
        }
        
        private boolean pre(TreeNode root, int val) {
            boolean rs = true;
            if (null == root.left && null == root.right) {
                if (root.val == val) {
                    return true;
                } else {
                    return false;
                }
            }
            
            if (root.left != null) {
                rs = true & pre(root.left, val);
            }
            if (!rs) {
                return rs;
            }
            rs = root.val == val ? true : false;
            if (null != root.right) {
                rs = true & pre(root.right, val);
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
