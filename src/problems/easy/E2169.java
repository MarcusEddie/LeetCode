package problems.easy;

public class E2169 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int countOperations(int num1, int num2) {
            int rs = 0;
            while ((num1 | num2) != 0) {
                if (num1 > num2) {
                    num1 = num1 - num2;
                } else {
                    num2 = num2 - num1;
                }
                rs++;
            }
            return rs;
        }
    }

}
