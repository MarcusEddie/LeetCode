package problems.easy;

public class E605 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            boolean rs = true;
            for (int i = 0; i < flowerbed.length; i++) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            return n == 0;
        }
    }

}
