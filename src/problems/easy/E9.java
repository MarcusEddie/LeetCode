package problems.easy;

public class E9 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean isPalindrome(int x) {
            if(x < 0)
                return false;
            
            String str = String.valueOf(x);
            boolean flag = true;
            for(int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    }

}
