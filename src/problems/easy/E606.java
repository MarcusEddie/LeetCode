package problems.easy;

public class E606 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public String tree2str(TreeNode root) {
            String rs = "";
            if (null == root.left && null == root.right) {
                return String.valueOf(root.val);
            }
            rs = String.valueOf(root.val);
            if (null != root.left) {
                rs = rs + "(" + tree2str(root.left) + ")";
            } else {
                rs = rs +"()";
            }
            if (null != root.right) {
                rs = rs + "(" + tree2str(root.right) + ")";
            } else {
                rs = rs + "()";
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
