package problems.easy;

public class E1684 {

    public static void main(String[] args) {
        String allowed = "adc";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(new Solution().countConsistentStrings(allowed, words));
    }
    
    private static class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            int rs = 0;
            int[] slot = new int[26];
            for(int i = 0; i < allowed.length(); i++) {
                slot[allowed.charAt(i) - 97] = 1;
            }
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (slot[words[i].charAt(j) - 97] == 0) {
                        rs++;
                        break;
                    }
                }
            }
            return words.length - rs;
        }
    }

}
