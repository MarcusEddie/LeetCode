package problems.easy;

public class E1791 {

    public static void main(String[] args) {
        int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
        System.out.println(new Solution().findCenter(edges));
    }

    private static class Solution {
        public int findCenter(int[][] edges) {
            int rs = 0;
            int[] slot = new int[edges.length + 2];
            for (int i = 0; i < edges.length; i++) {
                slot[edges[i][0]] = slot[edges[i][0]] + 1;
                slot[edges[i][1]] = slot[edges[i][1]] + 1;
            }
            for (int i = 1; i < slot.length; i++) {
                if (slot[i] == edges.length) {
                    rs = i;
                    break;
                }
            }
            return rs;
        }
    }

}
