package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E590 {

    public static void main(String[] args) {
        Node node3 = new Node(3);
        List<Node> list = new ArrayList<E590.Node>();
        list.add(new Node(5));
        list.add(new Node(6));
        node3.children = list;
        List<Node> list2 = new ArrayList<E590.Node>();
        list2.add(node3);
        list2.add(new Node(2));
        list2.add(new Node(4));
        Node root = new Node(1, list2);
        System.out.println(new Solution().postorder(root).toString());
    }
    

    private static class Solution {
        public List<Integer> postorder(Node root) {
            List<Integer> rs = new ArrayList<Integer>();
            if (root.children == null || (root.children != null && root.children.size() == 0)) {
                rs.add(root.val);
                return rs;
            }
            for (int i = 0; i < root.children.size(); i++) {
                rs.addAll(postorder(root.children.get(i)));
            }
            rs.add(root.val);
            return rs;
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
