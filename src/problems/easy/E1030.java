package problems.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class E1030 {

    public static void main(String[] args) {
        int[][] rs = new Solution().allCellsDistOrder(2, 3, 1, 2);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(Arrays.toString(rs[i]));
        }
    }

    private static class Solution {
        public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
            int[][] rs = new int[rows * cols][2];
            List<Pair> list = new ArrayList<Pair>();
            list.add(new Pair(rCenter, cCenter));
            for (int i = 0; i < rs.length; i++) {
                for (int j = 0; j < rs[j].length; j++) {
                    if (i != rCenter && j != cCenter) {
                        list.add(new Pair(i, j));
                    }
                }
            }
            
            return rs;
        }
        
        private class Pair{
            public int a;
            public int b;
            public Pair(int a, int b) {
                this.a = a;
                this.b = b;
            }
            @Override
            public String toString() {
                return "Pair [a=" + a + ", b=" + b + "]";
            }
        }
        
        private class E1030Comparator implements Comparator<Integer>{

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
            
        }
    }

}
