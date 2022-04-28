package problems.easy;

public class E242 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean isAnagram(String s, String t) {
            boolean rs = true;
            int[] slot = new int[26];
            for (int i = 0; i < s.length(); i++) {
                int code = s.charAt(i) - 97;
                slot[code]++;
            }
            for (int i = 0; i < t.length(); i++) {
                int code = s.charAt(i) - 97;
                slot[code]--;
            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] != 0) {
                    rs = false;
                    break;
                }
            }
            return rs;
        }
    }

}
