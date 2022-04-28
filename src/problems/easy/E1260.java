package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class E1260 {

    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new Solution().shiftGrid(grid, 9));
    }
    
    private static class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            List<List<Integer>> rs = new ArrayList<List<Integer>>();
            int m = grid.length;
            int n = grid[0].length;
            List<Integer> node = new LinkedList<Integer>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    node.add(grid[i][j]);
                }
            }
//            System.out.println(node.toString());
                int idx = 1;
                while (k != 0) {
                    k--;
                    Integer tmp = node.get(node.size() - idx);
                    idx++;
//                    System.out.println(tmp);
                    node.add(0, tmp);
                }
            System.out.println(node.toString());
            int len = 0;
            List<Integer> row = new ArrayList<Integer>();
            for (Integer integer : node) {
            }
            for (int i = 0; i < m * n; i++) {
                len++;
                row.add(node.get(i));
                if (len == n) {
                    rs.add(row);
                    row = new ArrayList<Integer>();
                    len = 0;
                }
            }
            return rs;
        }
    }

}
