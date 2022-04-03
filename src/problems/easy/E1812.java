package problems.easy;

public class E1812 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public boolean squareIsWhite(String coordinates) {
            boolean rs = true;
            if (coordinates.charAt(0) == 'a' || coordinates.charAt(0) == 'c'
                    || coordinates.charAt(0) == 'e' || coordinates.charAt(0) == 'g') {
                if ((Integer.valueOf(String.valueOf(coordinates.charAt(1))) & 1) == 1) {
                    rs = false;
                }
            } else {
                if ((Integer.valueOf(String.valueOf(coordinates.charAt(1))) & 1) == 0) {
                    rs = false;
                }
            }
            return rs;
        }
    }

}
