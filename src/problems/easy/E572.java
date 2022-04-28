package problems.easy;

public class E572 {

    public static void main(String[] args) {
    }

    private static class Solution {
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            boolean rs = true;
            
            return rs;
        }
        
        private boolean check(TreeNode root, TreeNode subRoot) {
            boolean rs = true;
            if (null == root.left && null == root.right) {
                if (null == subRoot.left && null == subRoot.right) {
                    if (root.val == subRoot.val) {
                        return true;
                    }
                }
                return false;
            }
            if (root.val != subRoot.val) {
                if (null != root.left) {
                    rs = true & check(root.left, subRoot);
                }
                if (!rs) {
                    return rs;
                }
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
