package problems.easy;

public class E509 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public int fib(int n) {
            int rs = 0;
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            rs = fib(n - 1) + fib(n - 2);
            return rs;
        }
        
    }

}
