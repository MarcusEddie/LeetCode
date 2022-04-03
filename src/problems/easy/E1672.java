package problems.easy;

public class E1672 {

    public static void main(String[] args) {
//        int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(new Solution().maximumWealth(accounts));
    }
    
    private static class Solution {
        public int maximumWealth(int[][] accounts) {
            int rs = 0;
            for (int i = 0; i < accounts.length; i++) {
                int tmp = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    tmp = tmp  + accounts[i][j];
                }
                if (rs < tmp) {
                    rs = tmp;
                }
            }
            return rs;
        }
    }

}
