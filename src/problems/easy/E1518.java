package problems.easy;

public class E1518 {

    public static void main(String[] args) {
        System.out.println(new Solution().numWaterBottles(15, 1));
    }
    
    private static class Solution {
        public int numWaterBottles(int numBottles, int numExchange) {
            int rs = numBottles;
            int totalEmpty = numBottles;
            while (totalEmpty >= numExchange) {
                int newEmpty = totalEmpty / numExchange;
                rs += newEmpty;
                newEmpty += totalEmpty % numExchange;
                totalEmpty = newEmpty;
            }
            return rs;
        }
    }

}
