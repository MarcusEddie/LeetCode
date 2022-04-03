package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1022 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(0, new TreeNode(0), new TreeNode(1));
        TreeNode right = new TreeNode(1, new TreeNode(0), new TreeNode(1));
        root.left = left;
        root.right = right;
        System.out.println(new Solution().sumRootToLeaf(root));
    }

    private static class Solution {
        public int sumRootToLeaf(TreeNode root) {
            int rs = 0;
            List<Integer> tmp = dfs(root, 0);
            for (Integer integer : tmp) {
                rs = rs + integer;
            }
            return rs;
        }
        
        private List<Integer> dfs(TreeNode root, int sum) {
            List<Integer> rs = new ArrayList<Integer>();
            if (root.left == null && root.right == null) {
                rs.add((sum << 1 )+ root.val);
                return rs;
            }
            int tmp = sum << 1;
            tmp = tmp + root.val;
            if (root.left != null) {
                rs.addAll(dfs(root.left, tmp));
            }
            if (root.right != null) {
                rs.addAll(dfs(root.right, tmp));
            }
            return rs;
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

    }

}
