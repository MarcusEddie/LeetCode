package problems.easy;

public class E1903 {

    public static void main(String[] args) {
        System.out.println(new Solution().largestOddNumber("52"));
    }
    
    private static class Solution {
        public String largestOddNumber(String num) {
            String rs = "";
            if ((Integer.valueOf(num.charAt(num.length() - 1)) & 1) == 1) {
                return num;
            }
            int left = -1;
            int right = -1;
            for (int i = 0; i < num.length(); i++) {
                if ((Integer.valueOf(num.charAt(i)) & 1) == 1) {
                    if (left == -1) {
                        left = i;
                        right = i;
                    } else {
                        right = i;
                    }
                }
            }
            System.out.println(left + " " + right);
            return num.substring(left, right + 1);
        }
    }

}
