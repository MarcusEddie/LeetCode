package problems.easy;

public class E495 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            int rs = 0;
            for (int i = 1; i < timeSeries.length; i++) {
                if (timeSeries[i] - timeSeries[i - 1] < duration) {
                    rs += timeSeries[i] - timeSeries[i - 1];
                } else {
                    rs += duration;
                }
            }
            return rs;
        }
    }

}
