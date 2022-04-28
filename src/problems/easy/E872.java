package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E872 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean leafSimilar(TreeNode root1, TreeNode root2) {
            boolean rs = true;
            List<Integer> list1 = new ArrayList<Integer>();
            List<Integer> list2 = new ArrayList<Integer>();
            pre(root1, list1);
            pre(root2, list2);
            if (list1.size() != list2.size()) {
                rs = false;
                return rs;
            }
            for (int i = 0; i < list1.size(); i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    rs = false;
                    break;
                }
            }
            return rs;
        }
        
        private void pre(TreeNode root, List<Integer> rs){
            if (null == root.left && null == root.right) {
                rs.add(root.val);
            }
            if (null != root.left) {
                pre(root.left, rs);
            }
            if (null!= root.right) {
                pre(root.right, rs);
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
