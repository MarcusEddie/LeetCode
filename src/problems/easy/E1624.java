package problems.easy;

import java.util.Arrays;

public class E1624 {

    public static void main(String[] args) {
        System.out.println(new Solution().maxLengthBetweenEqualCharacters("cbzxy"));
    }
    
    private static class Solution {
        public int maxLengthBetweenEqualCharacters(String s) {
            int rs = -1;
            int[][] dist = new int[27][2];
            for (int i = 0; i < dist.length; i++) {
                dist[i][0] = -1;
                dist[i][1] = -1;
            }
            for(int i = 0; i < s.length(); i++) {
                int code = s.charAt(i) - 96;
                if (dist[code][0] == -1) {
                    dist[code][0] = i;
                } else {
                    dist[code][1] = i;
                }
            }
//            for (int i = 0; i < dist.length; i++) {
//                System.out.println(Arrays.toString(dist[i]));
//            }
            for (int i = 0; i < dist.length; i++) {
                if (dist[i][1] > 0) {
                    if (rs < dist[i][1] - dist[i][0]) {
                        rs = dist[i][1] - dist[i][0] - 1;
                    }
                }
            }
            return rs;
        }
    }

}
