package problems.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E559 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int maxDepth(Node root) {
            if (root == null) {
                return 0;
            }
            
            if (root.children == null || null != root.children && root.children.size() == 0) {
                return 1;
            }
            
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i = 0; i < root.children.size(); i++) {
                tmp.add(maxDepth(root.children.get(i)));
            }
            Collections.sort(tmp);
            return 1 + tmp.get(tmp.size() - 1);
        }
    }
    
    private static class Node{
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
    }

}
