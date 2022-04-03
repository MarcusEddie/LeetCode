package problems.easy;

public class E1668 {

    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(new Solution().maxRepeating(sequence, word));
    }

    private static class Solution {
        public int maxRepeating(String sequence, String word) {
            int rs = 0;
            String tmp = word;
            while (sequence.indexOf(tmp) >= 0) {
                rs++;
                tmp = tmp + word;
            }
            return rs;
        }
    }

}
