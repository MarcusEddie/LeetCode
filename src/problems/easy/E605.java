package problems.easy;

public class E605 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            boolean rs = true;
            int len = 0;
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i] == 0) {
                    len++;
                } else {
                    if ((len & 1) == 1) {
                        len = (len - 1 ) / 2;
                        n -= len;
                    } else {
                        len = (len - 2) / 2;
                        n-= len;
                    }
                    len = 0;
                }
            }

            return n == 0;
        }
    }

}
