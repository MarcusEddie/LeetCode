package problems.easy;

public class E771 {

    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZZ";
        System.out.println(new Solution().numJewelsInStones(jewels, stones));
        
    }
    
    private static class Solution {
        public int numJewelsInStones(String jewels, String stones) {
            int rs = 0;
            int[] slot = new int[52];
            for (int i = 0; i < jewels.length(); i++) {
                int tmp = jewels.charAt(i);
                if (65 <= tmp && tmp <= 90) {
                    slot[tmp - 65] = 1;
                }
                if (97 <= tmp && tmp <= 122) {
                    slot[tmp - 71] = 1;
                }
            }
            for (int i = 0; i < stones.length(); i++) {
                int tmp = stones.charAt(i);
                if (65 <= tmp && tmp <= 90) {
                    if (slot[tmp - 65] == 1) {
                        rs++;
                    }
                }
                if (97 <= tmp && tmp <= 122) {
                    if (slot[tmp - 71] == 1) {
                        rs++;
                    }
                }
            }
            return rs;
        }
    }

}
