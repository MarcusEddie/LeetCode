package problems.easy;

public class E1742 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int countBalls(int lowLimit, int highLimit) {
            int rs = 0;
            int[] slot = new int[highLimit + 1];
            for (int i = lowLimit; i <= highLimit; i++) {
                int tmp = i;
                int cnt = 0;
                while (tmp != 0) {
                    cnt = cnt + tmp % 10;
                    tmp = tmp / 10;
                }
                slot[cnt] = slot[cnt] + 1;
                if (rs < slot[cnt]) {
                    rs = slot[cnt];
                }
            }
            return rs;
        }
    }

}
