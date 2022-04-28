package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E101 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean isSymmetric(TreeNode root) {
            Boolean rs = true;
            List<Integer> list = inOrder(root);
            int i = 0;
            int j = list.size() - 1;
            while (i <= j) {
                if (!list.get(i).equals(list.get(j))) {
                    rs = false;
                    break;
                }
                i++;
                j--;
            }
            return rs;
        }

        private List<Integer> inOrder(TreeNode root) {
            List<Integer> rs = new ArrayList<Integer>();
            if (null == root.left && null == root.right) {
                rs.add(root.val);
                return rs;
            }
            if (root.left == null) {
                rs.add(-1);
            } else {
                rs.addAll(inOrder(root.left));
            }
            rs.add(root.val);
            if (root.right != null) {
                rs.addAll(inOrder(root.right));
            } else {
                rs.add(-1);
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
