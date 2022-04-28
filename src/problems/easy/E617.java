package problems.easy;

public class E617 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3, new TreeNode(5), null);
        root1.right = new TreeNode(2);
        TreeNode root2 = new TreeNode(1);
        System.out.println(new Solution().mergeTrees(root1, root2).val);
    }

    private static class Solution {
        public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 != null) {
                return root2;
            } else if (root1 != null && root2 == null) {
                return root1;
            } else if (null == root1 && null == root2) {
                return null;
            }
            TreeNode node = merge(root1, root2);
            return node;
        }
        
        private TreeNode merge(TreeNode root1, TreeNode root2) {
            TreeNode rs = new TreeNode();
            
            if (null == root1 && null != root2) {
                return root2;
            } else if (null != root1 && null == root2) {
                return root1;
            } else if (null == root1 && null == root2) {
                return null;
            }
            rs.val = root1.val + root2.val;
            if (null != root1.left || null != root2.left) {
                rs.left = merge(root1.left, root2.left);
            }
            if (null != root1.right || null != root2.right) {
                rs.right = merge(root1.right, root2.right);
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
