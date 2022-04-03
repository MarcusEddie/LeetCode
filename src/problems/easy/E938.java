package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E938 {

    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5, new TreeNode(3, null, null), new TreeNode(7, null, null));
        TreeNode node15 = new TreeNode(15, null, new TreeNode(18, null, null));
        TreeNode root = new TreeNode(10, node5, node15); 
        int low = 7;
        int high = 15;
        System.out.println(new Solution().rangeSumBST(root, low, high));
    }

    private static class Solution {
        public int rangeSumBST(TreeNode root, int low, int high) {
            int rs = 0;
            List<Integer> tmp = range0(root);
            for (Integer integer : tmp) {
                if (low <= integer && integer <= high) {
                    rs = rs + integer;
                }
            }
            return rs;
        }
        
        public static List<Integer> range0(TreeNode root) {
            if (null == root.left && null == root.right) {
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(root.val);
                return tmp;
            }
            List<Integer> rs = new ArrayList<Integer>();
            if (null != root.left) {
                rs.addAll(range0(root.left));
            }
            rs.add(root.val);
            if (null != root.right) {
                rs.addAll(range0(root.right));
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

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
        
    }

}
