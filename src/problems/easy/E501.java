package problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class E501 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int[] findMode(TreeNode root) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            Queue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
            queue.add(root);
            int max = 0;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (map.containsKey(node.val)) {
                    Integer tmp = map.get(node.val);
                    map.put(node.val, tmp + 1);
                    if (max < tmp + 1) {
                        max = tmp +1;
                    }
                } else {
                    map.put(node.val, 1);
                }
                if (null != node.left) {
                    queue.offer(node.left);
                }
                if (null != node.right) {
                    queue.offer(node.right);
                }
            }
            
            List<Integer> tmp = new ArrayList<Integer>();
            Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<java.lang.Integer, java.lang.Integer> entry = (Map.Entry<java.lang.Integer, java.lang.Integer>) it
                        .next();
                if (entry.getValue() == max) {
                    tmp.add(entry.getKey());
                }
            }
            int[] rs = new int[tmp.size()];
            for (int i = 0; i < rs.length; i++) {
                rs[i] = tmp.get(i);
            }
            return rs;
        }
        
//        private List<Integer> pre(TreeNode root){
//            List<Integer> rs = new ArrayList<Integer>();
//            if(null == root.left && null == root.right){
//                rs.add(root.val);
//                
//                return rs;
//            }
//            if(null != root.left){
//                rs.addAll(pre(root.left));
//            }
//            rs.add(root.val);
//            if(null != root.right){
//                rs.addAll(pre(root.right));
//            }
//            return rs;
//        }
    }
    
    private static class TreeNode{
        int val;
          TreeNode left;
          TreeNode right;
    }

}
