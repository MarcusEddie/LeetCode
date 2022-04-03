package problems.easy;

public class E1941 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    private static class Solution {
        public boolean areOccurrencesEqual(String s) {
            boolean rs = true;
            int[] slot = new int[26];
            for(int i = 0; i< s.length(); i++) {
                int code = s.charAt(i);
                slot[code - 97] = slot[code - 97] +1;
            }
            int tmp = 0;
            for (int i = 0; i < slot.length; i++) {
                if (tmp == 0 && slot[i] != 0) {
                    tmp = slot[i];
                } else if (tmp != 0 && slot[i] != 0) {
                    if (slot[i] != tmp) {
                        rs = false;
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
