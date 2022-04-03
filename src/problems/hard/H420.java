package problems.hard;

public class H420 {

    public static void main(String[] args) {
        System.out.println(new Solution().strongPasswordChecker(""));
    }
    
    static  class Solution {
        public int strongPasswordChecker(String password) {
            int rs = 0;
            if (password.length() <= 4) {
                return 6 - password.length();
            } else if (password.length() == 5) {
                return 2;
            }
            return rs;
        }
    }

}
