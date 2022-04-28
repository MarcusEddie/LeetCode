package problems.medium;

import java.util.ArrayList;
import java.util.List;

public class M429 {

    public static void main(String[] args) {

    }
    

    private static class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> rs = new ArrayList<List<Integer>>();
            List<Node> list = new ArrayList<Node>();
            list.add(root);
            while (!list.isEmpty()) {
                List<Node> tmp = new ArrayList<Node>();
                List<Integer> val = new ArrayList<Integer>();
                for (Node node : list) {
                    val.add(node.val);
                    if (null != node.children && node.children.size() > 0) {
                        tmp.addAll(node.children);
                    }
                }
                list.clear();
                list.addAll(tmp);
                rs.add(val);
            }
            return rs;
        }
    }

    private static class Node {
        public int val;
        public List<Node> children;
        
        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
        
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
