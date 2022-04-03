package problems.easy;

public class E1342 {

    public static void main(String[] args) {
        int num = 14;
        System.out.println(new Solution().numberOfSteps(num));
    }
    private static class Solution {
        public int numberOfSteps(int num) {
            int rs = 0;
            while (num != 0) {
                rs++;
                if (num % 2 == 1) {
                    num--;
                } else {
                     num = num / 2;
                }
            }
            return rs;
        }
    }

}
