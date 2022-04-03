package problems.easy;

public class E125 {

    public static void main(String[] args) {
        String s = "   ";
        System.out.println(new Solution().isPalindrome(s));
    }
    
    private static class Solution {
        public boolean isPalindrome(String s) {
            boolean rs = true;
            s = s.toLowerCase();
            
            int[] slot = new int[s.length()];
            int idx = 0;
            for(int i = 0; i< s.length(); i++) {
                int code = s.charAt(i);
                if ((48 <= code && code <= 57) || (97 <= code && code <= 122)) {
                    slot[idx] = code;
                    idx++;
                }
            }
            for(int i = 0; i < idx/2; i++) {
                if (slot[i] != slot[idx - i - 1]) {
                    rs = false;
                    break;
                }
            }
            return rs;
        }
    }

}
