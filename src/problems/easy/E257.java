package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E257 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> rs = new ArrayList<String>();
            dfs(root, "", rs);
            return rs;
        }
        
        private void dfs(TreeNode root, String path, List<String> list){
            if (null == root.left && null == root.right) {
                String finalPath = path;
                finalPath = finalPath + "->" + root.val;
                list.add(finalPath);
                return;
            }
            String newPath = path;
            if (path.length() > 0) {
                newPath = newPath + "->" + root.val;
            } else {
                newPath = String.valueOf(root.val);
            }
            
            if (null != root.left) {
                dfs(root.left, newPath, list);
            }
            if (null != root.right) {
                dfs(root.right, newPath, list);
            }
        }
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
