package problems.easy;

public class E344 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public void reverseString(char[] s) {
            char tmp = '0';
            for (int i = 0; i < s.length / 2; i++) {
                tmp = s[i];
                s[i] = s[s.length - i - 1];
                s[s.length - 1- i] = tmp;
            }
        }
    }

}
