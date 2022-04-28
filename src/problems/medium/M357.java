package problems.medium;

public class M357 {

    public static void main(String[] args) {
        System.err.println(new Solution().countNumbersWithUniqueDigits(0));
    }
    
    private static class Solution {
        public int countNumbersWithUniqueDigits(int n) {
            int rs = 0;
            int max = (int) Math.pow(10, n);
            for (int i = 0; i < max; i++) {
                StringBuilder builder = new StringBuilder().append(i);
                for (int j = 0; j < 10; j++) {
                    if (builder.indexOf(String.valueOf(j)) != builder.lastIndexOf(String.valueOf(j))) {
                        rs++;
                        break;
                    }
                }
            }
            rs = (int) (Math.pow(10, n) - rs);
            return rs;
        }
    }

}
