package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E993 {

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4, null, null)), new TreeNode(3, null, new TreeNode(5, null, null)));
//        TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3,null, new TreeNode(5)));
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null), new TreeNode(5, null, new TreeNode(6)));
        System.out.println(new Solution().isCousins(root, 3, 6));
    }

    private static class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            boolean rs = false;
            List<TreeNode> level = new ArrayList<TreeNode>();
            level.add(root);
            while (level.size() > 0) {
                List<TreeNode> tmp = new ArrayList<TreeNode>();
                boolean ex = false;
                boolean ey = false;
                boolean flag = false;
                int idxX = 0;
                int idxY = 0;
                System.out.println(level.toString());
                for(int i = 0; i < level.size(); i++) {
                    TreeNode node = level.get(i);
                    if (node.val == -1) {
                        continue;
                    }
                    if (node.val == x) {
                        ex = true;
                        idxX = i;
                    }
                    if (node.val == y) {
                        ey = true;
                        idxY = i;
                    }
                    if (null != node.left) {
                        tmp.add(node.left);
                    } else {
                        tmp.add(new TreeNode(-1, null, null));
                    }
                    if (null != node.right) {
                        tmp.add(node.right);
                    } else {
                        tmp.add(new TreeNode(-1, null, null));
                    }
                    flag = true;
                }
                if (flag) {
                    rs = ex && ey && (Math.abs(idxX - idxY) > 1);
                }
                if (rs) {
                    break;
                }
                level.clear();
                level.addAll(tmp);
            }
            return rs;
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            super();
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
