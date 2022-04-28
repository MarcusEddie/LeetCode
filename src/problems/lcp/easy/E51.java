package problems.lcp.easy;

public class E51 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
            int rs = 0;
            for (int i = 1; i <= attribute.length; i++) {
                int idx = 0;
                while (idx <= attribute.length - i) {
                    int hungry = 0;
                    for (int j = idx; j < idx + i; j++) {
                        hungry += attribute[i][1];
                    }
                    if (hungry < limit) {
                        continue;
                    }
                }
            }
            return rs;
        }
    }

}
