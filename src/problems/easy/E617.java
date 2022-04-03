package problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

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
            TreeNode node = new TreeNode();
            TreeNode[] node1 = gen(root1);
            for (int i = 0; i < node1.length; i++) {
                if (node1[i] == null) {
                    System.out.print("null" + " ");
                } else {
                    System.out.print(node1[i].val + " ");
                }
            }
            System.out.println();
            TreeNode[] node2 = gen(root2);
            
            return node;
        }
        
        private TreeNode[] gen(TreeNode root) {
            TreeNode[] slot = new TreeNode[2001];
            if (null == root) {
                return null;
            }
            slot[0] = root;
            for(int i = 0; i < slot.length; i++) {
                if (slot[i]!= null && slot[i].left == null) {
                    slot[2 * i + 1] = null;
                } else if (slot[i]!= null && slot[i].left != null) {
                    slot[2 * i + 1] = slot[i].left;
                }
                if (slot[i]!= null && slot[i].right == null) {
                    slot[2 * i + 2] = null;
                } else if (slot[i]!= null && slot[i].right != null) {
                    slot[2 * i + 2] = slot[i].right;
                }
            }
            return slot;
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
