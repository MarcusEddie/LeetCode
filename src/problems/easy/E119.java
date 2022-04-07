package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E119 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    private static class Solution {
        public List<Integer> getRow(int numRows) {
            List<Integer> rs = new ArrayList<Integer>();
            rs.add(1);
            if (numRows == 0) {
                return rs;
            }
            
            rs.add(1);
            int cnt = 2;
            while (cnt < numRows) {
                List<Integer> list = new ArrayList<Integer>();
                List<Integer> parent = rs;
                list.add(1);
                for (int i = 0; i < parent.size() - 1; i++) {
                    list.add(parent.get(i) + parent.get(i + 1));
                }
                list.add(1);
                rs = list;
                cnt++;
            }

            return rs;
        }
    }

}
