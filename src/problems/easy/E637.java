package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E637 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public List<Double> averageOfLevels(TreeNode root) {
            List<Double> rs = new ArrayList<Double>();
            List<TreeNode> level = new ArrayList<TreeNode>();
            level.add(root);
            while (level.size() > 0) {
                List<TreeNode> tmp = new ArrayList<TreeNode>();
                double sum = 0.0d;
                for (TreeNode treeNode : level) {
                    sum += treeNode.val;
                    if (null != treeNode.left) {
                        tmp.add(treeNode.left);
                    }
                    if (null != treeNode.right) {
                        tmp.add(treeNode.right);
                    }
                }
                rs.add(sum / level.size());
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
    }

}
