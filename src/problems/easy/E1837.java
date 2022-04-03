package problems.easy;

public class E1837 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
    }
    
    private static class Solution {
        public int sumBase(int n, int k) {
            int rs = 0;
            while (n != 0) {
                rs = rs + n % k;
                n = n / k;
            }
            return rs;
        }
    }

}
