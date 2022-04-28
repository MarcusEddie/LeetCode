package problems.easy;

public class E1550 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            boolean rs = false;
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[i] & 1)  == 1) {
                    cnt++;
                    if (cnt == 3) {
                        rs = true;
                        break;
                    }
                } else {
                    cnt = 0;
                }
            }
            return rs;
        }
    }

}
