package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E897 {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3, new TreeNode(2, node1, null), new TreeNode(4));
        TreeNode node6 = new TreeNode(6, null, new TreeNode(8, new TreeNode(7), new TreeNode(9)));
        TreeNode root = new TreeNode(5, node3, node6);
        System.out.println(new Solution().increasingBST(root).toString());
    }
    
    private static class Solution {
        public TreeNode increasingBST(TreeNode root) {
            List<Integer> values = preOrder(root);
            TreeNode node = new TreeNode(values.get(values.size() - 1));
            for(int i = values.size() - 2; i >=0; i--) {
                TreeNode parent = new TreeNode(values.get(i), null, node);
                node = parent;
            }
            return node;
        }
        
        private List<Integer> preOrder(TreeNode root) {
            List<Integer> rs = new ArrayList<Integer>();
            if (root.left == null && root.right == null) {
                rs.add(root.val);
                return rs;
            }
            if (root.left != null) {
                rs.addAll(preOrder(root.left));
            }
            rs.add(root.val);
            if (root.right != null) {
                rs.addAll(preOrder(root.right));
            }
            return rs;
        }
    }
    
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
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
