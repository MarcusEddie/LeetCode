package problems.easy;

public class E657 {

    public static void main(String[] args) {

    }
    
    private static class Solution {
        public boolean judgeCircle(String moves) {
            boolean rs = true;
            int[] slot = new int[4];
            for(int i = 0; i <moves.length(); i++) {
                if (moves.charAt(i) == 'R') {
                    slot[0] = slot[0] + 1;
                } else if (moves.charAt(i) == 'L') {
                    slot[1] = slot[1] + 1;
                }  else if (moves.charAt(i) == 'U') {
                    slot[2] = slot[2] + 1;
                }  else if (moves.charAt(i) == 'D') {
                    slot[3] = slot[3] + 1;
                } 
            }
            if (slot[0] != 0 && slot[1] != 0 && slot[0] != slot[1]) {
                rs = false;
            }
            if ((slot[0] != 0 && slot[1] == 0) || (slot[0] == 0 && slot[1] != 0)) {
                rs = false;
            }
            if (slot[2] != 0 && slot[3] != 0 && slot[2] != slot[3]) {
                rs = false;
            }
            if ((slot[2] != 0 && slot[3] == 0) || (slot[2] == 0 && slot[3] != 0)) {
                rs = false;
            }
            return rs;
        }
    }

}
