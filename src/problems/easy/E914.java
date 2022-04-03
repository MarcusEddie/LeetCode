package problems.easy;

public class E914 {

    public static void main(String[] args) {
        int[] deck = {1,1,2,2,2,2};
        System.out.println(new Solution().hasGroupsSizeX(deck));
        
    }
    
    private static class Solution {
        public boolean hasGroupsSizeX(int[] deck) {
            if (deck.length == 1) {
                return false;
            }
            boolean rs = true;
            int[] slot = new int[10001];
            int max = 0;
            for (int i = 0; i < deck.length; i++) {
                slot[deck[i]] = slot[deck[i]] + 1;
                if (max < slot[deck[i]]) {
                    max = slot[deck[i]];
                }
            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] != 0) {
                    if ((slot[i] & 1) == 1) {
                        rs = false;
                        break;
                    }
                }
            }
            return rs;
        }
    }

}
