package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E653 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean findTarget(TreeNode root, int k) {
            boolean rs = false;
            List<Integer> orders = pre(root);
            for(int i = 0; i < orders.size(); i++) {
                Integer diff = k - orders.get(i);
                for (int j = i+1; j < orders.size(); j++) {
                    if (orders.get(j).equals(diff)) {
                        rs = true;
                        break;
                    }
                }
                if (rs) {
                    break;
                }
            }
            return rs;
        }
        
        private List<Integer> pre(TreeNode root){
            List<Integer> rs = new ArrayList<Integer>();
            if (null == root.left && null == root.right) {
                rs.add(root.val);
                return rs;
            }
            rs.add(root.val);
            if (null != root.left) {
                rs.addAll(pre(root.left));
            }
            if (null != root.right) {
                rs.addAll(pre(root.right));
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
