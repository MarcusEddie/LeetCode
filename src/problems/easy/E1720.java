package problems.easy;

public class E1720 {

    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        int first = 4;
        int[] rs = new Solution().decode(encoded, first);
        for (int i : rs) {
            System.out.print(i +" ");
        }
        System.out.println();
    }
    
    private static class Solution {
        public int[] decode(int[] encoded, int first) {
            int[] rs = new int[encoded.length + 1];
            rs[0] = first;
            for (int i = 0; i < encoded.length; i++) {
                rs[i + 1] = encoded[i] ^ first;
                first = rs[i + 1];
            }
            return rs;
        }
    }

}
