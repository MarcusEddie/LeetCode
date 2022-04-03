package contest.weekly.c287;

import java.util.ArrayList;
import java.util.List;

public class B {

    public static void main(String[] args) {
//        int[][] matchs = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
//        int[][] matchs = {{2,3},{1,3},{5,4},{6,4}};
        int[][] matchs = {{1,100000}};
        System.out.println(new Solution().findWinners(matchs).toString());
    }

    private static class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            List<List<Integer>> rs = new ArrayList<List<Integer>>();
            int[] slot = new int[100001];
            for (int i = 0; i < slot.length; i++) {
                slot[i] = -1;
            }
            int min = Integer.MAX_VALUE;
            int max = 0;
            for (int i = 0; i < matches.length; i++) {
                slot[matches[i][1]] = slot[matches[i][1]] + 1;
                if (min > matches[i][1]) {
                    min = matches[i][1];
                }
                if (min > matches[i][0]) {
                    min = matches[i][0];
                }
                
                if (max < matches[i][1]) {
                    max = matches[i][1];
                }
                if (max < matches[i][0]) {
                    max = matches[i][0];
                }
            }
            System.out.println(min + " "+max);
            List<Integer> zero = new ArrayList<Integer>();
            List<Integer> one = new ArrayList<Integer>();
            for (int i = min; i <=max; i++) {
                if (slot[i] == 0) {
                    zero.add(i);
                }
                if (slot[i] == 1) {
                    one.add(i);
                }
            }
            rs.add(zero);
            rs.add(one);
//            for (int i : slot) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
            return rs;
        }
    }

}
