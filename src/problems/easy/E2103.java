package problems.easy;


public class E2103 {

    public static void main(String[] args) {
        System.out.println(new Solution().countPoints("B0"));
    }
    
    private static class Solution {
        public int countPoints(String rings) {
            int rs = 0;
            int[] slot = {1,1,1,1,1,1,1,1,1,1};
            for(int i = 0; i < rings.length() - 1; i = i + 2) {
                int idx = Integer.valueOf(String.valueOf(rings.charAt(i + 1)));
                if (rings.charAt(i) == 'R') {
                    slot[idx] = slot[idx] | 2;
                } else if (rings.charAt(i) == 'G') {
                    slot[idx] = slot[idx] | 4;
                } else if (rings.charAt(i) == 'B') {
                    slot[idx] = slot[idx] | 8;
                }
            }
            for (int i = 0; i < slot.length; i++) {
                if (slot[i] == 15) {
                    rs++;
                }
            }
            return rs;
        }
    }

}
