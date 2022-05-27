package contest.weekly.c292;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

import java.util.Map.Entry;
import java.util.Queue;
import java.util.Random;

public class B {

    public static void main(String[] args) {
        Solution solution = new Solution();
//        TreeNode node8 = new TreeNode(8, new TreeNode(0), new TreeNode(1));
//        TreeNode node5 = new TreeNode(5, null, new TreeNode(6));
        TreeNode root = new TreeNode(4, null, null);
        System.out.println(solution.averageOfSubtree(root));
        
    }

    private static class Solution {
        public int averageOfSubtree(TreeNode root) {
            Pair rs = pre(root);
            return rs.result;
        }
        
        private Pair pre(TreeNode root){
            if (root.left == null && root.right == null) {
                Pair pair = new Pair();
                pair.subSum = root.val;
                pair.result = 1;
                pair.subNum = 1;
                return pair;
            }
            Pair rs = new Pair();
            Pair left = new Pair();
            Pair right = new Pair();
            if (null != root.left) {
                left = pre(root.left);
            }
            if (null != root.right) {
                right = pre(root.right);
            }
            rs.subNum = left.subNum + right.subNum + 1;
            rs.subSum = left.subSum + right.subSum + root.val;
            rs.result = left.result + right.result;
            if ((rs.subSum / rs.subNum) == root.val) {
                rs.result = rs.result + 1;
            }
            return rs;
        }
    }
    
    private static class Pair{
        int subSum;
        int subNum;
        int result;
        @Override
        public String toString() {
            return "Pair [subSum=" + subSum + ", subNum=" + subNum + ", result=" + result + "]";
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

        @Override
        public String toString() {
            return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
        }
        
    }
    

}
