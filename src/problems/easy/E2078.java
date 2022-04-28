package problems.easy;

public class E2078 {

    public static void main(String[] args) {
        int[] colors = {4,4,4,11,4,4,11,4,4,4,4,4};
        System.out.println(new Solution().maxDistance(colors));
    }
    
    private static class Solution {
        public int maxDistance(int[] colors) {
            int rs = 0;
            int[][] slot = new int[101][2];
            for (int i = 0; i < slot.length; i++) {
                slot[i][0] = -1;
                slot[i][1] = -1;
            }
            for (int i = 0; i < colors.length; i++) {
                int idx = colors[i];
                if (slot[idx][0] == -1) {
                    slot[idx][0] = i;
                } else {
                    slot[idx][1] = i;
                }
            }
            int first = 200;
            int last = -1;
            for (int i = 0; i < slot.length; i++) {
                if (first > slot[i][0] && slot[i][0] != -1) {
                    first = slot[i][0];
                }
                
                for (int i1 = 0; i1 < slot.length; i1++) {
                    if (slot[i1][1] == -1 && slot[i1][0] != -1) {
                        if (last < slot[i1][0] && i1 != i) {
                            last = slot[i1][0];
                        }
                    } else if (slot[i1][1] != -1 && slot[i1][0] != -1) {
                        if (last < slot[i1][1] && i1 != i) {
                            last = slot[i1][1];
                        }
                    }
                }
                if (rs < last - first) {
                    rs = last - first;
                }
            }
            return rs;
        }
    }

}
