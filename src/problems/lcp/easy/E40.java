package problems.lcp.easy;

import java.util.Arrays;

public class E40 {

    public static void main(String[] args) {

    }

    private static class Solution {
        public int maxmiumScore(int[] cards, int cnt) {
            int rs = 0;
            Arrays.sort(cards);
            for (int i = 0; i < cnt - 1; i++) {
                rs += cards[cards.length - 1 - i];
            }
            if ((rs & 1) == 1) {
                for (int i = cards.length - cnt; i >= 0; i--) {
                    rs += cards[cards.length - 1 - i];
                    if ((cards[i] & 1) ==1) {
                        rs += cards[i];
                        break;
                    }
                }
            } else {
                for (int i = cards.length - cnt; i >= 0; i--) {
                    rs += cards[cards.length - 1 - i];
                    if ((cards[i] & 1) ==0) {
                        rs += cards[i];
                        break;
                    }
                }
            }
            if (rs % 2 == 1) {
                return 0;
            }
            return rs;
        }
    }

}
