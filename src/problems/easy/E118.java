package problems.easy;

import java.util.ArrayList;
import java.util.List;

public class E118 {

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5).toString());
    }

    private static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> rs = new ArrayList<List<Integer>>();
            List<Integer> tmp = new ArrayList<Integer>();
            tmp.add(1);
            rs.add(tmp);
            if (numRows == 1) {
                return rs;
            }
            List<Integer> tmp2 = new ArrayList<Integer>();
            tmp2.add(1);
            tmp2.add(1);
            rs.add(tmp2);
            int cnt = 2;
            while (cnt <numRows) {
                List<Integer> list = new ArrayList<Integer>();
                List<Integer> parent = rs.get(rs.size() - 1);
                list.add(1);
                for(int i = 0; i < parent.size() - 1; i++) {
                    list.add(parent.get(i) + parent.get(i + 1));
                }
                list.add(1);
                rs.add(list);
                cnt++;
            }
            
            return rs;
        }
    }
}
