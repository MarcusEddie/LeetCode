package problems.easy;

public class E1281 {

    public static void main(String[] args) {
        int n = 4421;
        System.out.println(new Solution().subtractProductAndSum(n));
    }
    private static class Solution {
        public int subtractProductAndSum(int n) {
            int sum = 0;
            int product = 1;
            while (n != 0) {
                int remainder = n % 10;
                sum = sum + remainder;
                product = product * remainder;
                n = n / 10;
            }
            return product - sum;
        }
    }

}
