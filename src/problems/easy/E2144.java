package problems.easy;

public class E2144 {

    public static void main(String[] args) {
        int[] cost = {6,5,7,9,2,2};
        System.out.println(new Solution().minimumCost(cost));
    }
    
    private static class Solution {
        public int minimumCost(int[] cost) {
            int rs = 0;
            int[] price = new int[101];
            int right = 0;
            int left = 999;
            for (int i = 0; i < cost.length; i++) {
                price[cost[i]] = price[cost[i]] + 1;
                if (right < cost[i]) {
                    right = cost[i];
                }
                if (left > cost[i]) {
                    left = cost[i];
                }
            }
            
            int free = 0;
            while (right >= left) {
                if (price[right] == 0) {
                    right--;
                    continue;
                }
                if (free == 2) {
                    free = 0;
                    price[right]--;
                } else {
                    free++;
                    rs = rs+ right;
                    price[right]--;
                }
                if (price[right] == 0) {
                    right--;
                }
            }
            
            return rs;
        }
    }

}
