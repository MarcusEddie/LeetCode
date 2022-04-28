package problems.easy;

public class E551 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean checkRecord(String s) {
            Boolean rs = true;
            int absent = 0;
            for(int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'A') {
                    absent++;
                    if (absent > 1) {
                        rs = false;
                        break;
                    }
                }
                if (i >= 2) {
                    if (s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
                        rs = false;
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
