package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E100 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            boolean rs = true;
            if (null == p && null == q) {
                return true;
            } else if (null == p && null != q) {
                return false;
            } else if (null != p && null == q) {
                return false;
            }
//            List<Integer> pPre = pre(p);
//            List<Integer> qPre = pre(q);
            
            List<String> pPre = pre(p, "M");
            List<String> qPre = pre(q, "M");
            
            List<Integer> pPost = post(p);
            List<Integer> qPost = post(q);
            if (!(pPre.size() == qPre.size() && qPre.size() == pPost.size() && pPost.size() == qPost.size())) {
                rs = false;
                return rs;
            }
            for(int i = 0; i < pPre.size(); i++) {
                if (!pPre.get(i).equals(qPre.get(i))) {
                    rs = false;
                    break;
                }
            }
            if (!rs) {
                return rs;
            }
            for(int i = 0; i < pPost.size(); i++) {
                if (!pPost.get(i).equals(qPost.get(i))) {
                    rs = false;
                    break;
                }
            }
            return rs;
        }
        
        private List<Integer> pre(TreeNode node){
            List<Integer> rs = new ArrayList<Integer>();
            if (null == node.left && null == node.right) {
                rs.add(node.val);
                return rs;
            }
            rs.add(node.val);
            if (null != node.left) {
                rs.addAll(pre(node.left));
            }
            if (null != node.right) {
                rs.addAll(pre(node.right));
            }
            return rs;
        }
        
        private List<String> pre(TreeNode node, String flag){
            List<String> rs = new ArrayList<String>();
            if (null == node.left && null == node.right) {
                rs.add(node.val + flag);
                return rs;
            }
            rs.add(node.val + "M");
            if (null != node.left) {
                rs.addAll(pre(node.left, "L"));
            }
            if (null != node.right) {
                rs.addAll(pre(node.right, "R"));
            }
            return rs;
        }
        
        private List<Integer> post(TreeNode node){
            List<Integer> rs = new ArrayList<Integer>();
            if (null == node.left && null == node.right) {
                rs.add(node.val);
                return rs;
            }
            if (null != node.left) {
                rs.addAll(post(node.left));
            }
            if (null != node.right) {
                rs.addAll(post(node.right));
            }
            rs.add(node.val);
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
