package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E543 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public int diameterOfBinaryTree(TreeNode root) {
            int rs = 0;
            int left = 0;
            List<Integer> list = new ArrayList<Integer>();
            if (null != root.left) {
                left = height(root.left, list) + 1;
            }

            int right = 0;
            if (null != root.right) {
                right = height(root.right, list) + 1;
            }
            return list.get(0);
        }

        private int height(TreeNode root, List<Integer> list ) {
            if (null == root.left && null == root.right) {
                return 0;
            }
            int left = 0;
            int max = 0;
            if (null != root.left) {
                left = height(root.left, list) + 1;
                max = left;
            }
            int right = 0;
            if (null != root.right) {
                right = height(root.right, list) + 1;
                if (max < right) {
                    max= right;
                }
            }
            int tmp = list.get(0);
            if (tmp < left + right) {
                list.remove(0);
                list.add(left + right);
            }
            return max;
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
