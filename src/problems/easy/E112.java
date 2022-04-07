package problems.easy;

public class E112 {

    public static void main(String[] args) {
        TreeNode node11 = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        TreeNode node4 = new TreeNode(4, node11, null);
        TreeNode node8 = new TreeNode(8, new TreeNode(13), new TreeNode(4, null,new TreeNode(1)));
        TreeNode root = new TreeNode(5, node4, node8);
        System.out.println(new Solution().hasPathSum(root, 28));
    }

    private static class Solution {
        public boolean hasPathSum(TreeNode root, int targetSum) {
            boolean rs = true;
            if (root == null) {
                return false;
            }
            return hasPathSum0(root, 0, targetSum);
        }

        private boolean hasPathSum0(TreeNode root, int currentSum, int targetSum) {
            boolean rs = false;
            if (root.left == null && root.right == null) {
                if (currentSum + root.val == targetSum) {
                    return true;
                } else {
                    return false;
                }
            }
            currentSum += root.val;
            if (root.left != null) {
                rs = true && hasPathSum0(root.left, currentSum, targetSum);
                System.out.println("L: " + root.val + " " + currentSum + " ");
            }
            if (rs) {
                System.out.println("L: " + " chck");
                return rs;
            }
            if (root.right != null) {
                rs = true && hasPathSum0(root.right, currentSum, targetSum);
                System.out.println("R: " + root.val + " " + currentSum + " ");
            }
            return rs;
        }
    }

    /**
     * Definition for a binary tree node. public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
     * = left; this.right = right; } }
     */
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
