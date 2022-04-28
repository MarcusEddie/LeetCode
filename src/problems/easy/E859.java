package problems.easy;

public class E859 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean buddyStrings(String s, String goal) {
            boolean rs = true;
            if (s.length() != goal.length()) {
                return false;
            }
            int[] slot = new int[26];
            int times = 0;
            if (s.equals(goal)) {
                for (int i = 0; i < s.length(); i++) {
                    int code = s.charAt(i) - 97;
                    slot[code]++;
                    if (times < slot[code]) {
                        times = slot[code];
                    }
                }
                if (times <= 1) {
                    rs = false;
                }
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != goal.charAt(i)) {
                        times++;
                        if (times >= 3) {
                            break;
                        }
                    }
                }
                if (times > 2) {
                    rs = false;
                }
            }
            return rs;
        }
    }

}
