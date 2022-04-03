package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E1656 {

    public static void main(String[] args) {
        OrderedStream stream = new OrderedStream(5);
        System.out.println(stream.insert(3, "ccccc"));
        System.out.println(stream.insert(1, "aaaaa"));
        System.out.println(stream.insert(2, "bbbbb"));
        System.out.println(stream.insert(5, "eeeee"));
        System.out.println(stream.insert(4, "ddddd"));
    }
    
    private static class OrderedStream {
        
        private String[] slot;
        private int ptr = 1;
        public OrderedStream(int n) {
            slot = new String[n + 1];
        }
        
        public List<String> insert(int idKey, String value) {
            List<String> rs = new ArrayList<String>();
            slot[idKey] = value;
            for (int i = ptr; i < slot.length; i++) {
                if (null != slot[i] && slot[i].length() > 0) {
                    rs.add(slot[i]);
                    ptr = i + 1;
                } else {
                    break;
                }
            }
            return rs;
        }
    }

}
