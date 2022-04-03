package problems.easy;

public class E1486 {

    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(new Solution().xorOperation(n, start));
    }
    
    private static class Solution {
        public int xorOperation(int n, int start) {
            int rs = 0;
            int i = 0;
            rs = start + 2 * i;
            i++;
            while (n > i) {
                rs = rs ^ (start + 2 * i);
                i++;
            }
            return rs;
        }
    }

}
